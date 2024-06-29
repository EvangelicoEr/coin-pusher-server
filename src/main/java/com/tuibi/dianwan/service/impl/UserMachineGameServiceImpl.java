package com.tuibi.dianwan.service.impl;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.tuibi.dianwan.entity.MachineMain;
import com.tuibi.dianwan.entity.UserCharterMachine;
import com.tuibi.dianwan.entity.UserMachineGame;
import com.tuibi.dianwan.enums.UserMachineActionEnum;
import com.tuibi.dianwan.global.ConstantGlobal;
import com.tuibi.dianwan.listener.event.MachineVersionChangeEvent;
import com.tuibi.dianwan.listener.event.UserMachineActionEvent;
import com.tuibi.dianwan.listener.event.UserMachineDownEvent;
import com.tuibi.dianwan.mapper.UserMachineGameMapper;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.MachineMainService;
import com.tuibi.dianwan.service.UserCharterMachineService;
import com.tuibi.dianwan.service.UserInfoService;
import com.tuibi.dianwan.service.UserMachineGameService;
import com.tuibi.dianwan.vo.MachinePlayUserSimpleInfoResp;
import com.tuibi.dianwan.vo.MachineRoomDataResp;
import com.tuibi.dianwan.vo.UserSimpleInfoResp;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.robert.vesta.service.intf.IdService;
import com.tuibi.common.framework.config.RedisConst;
import com.tuibi.common.framework.util.cache.CacheUtil;
import com.tuibi.common.juc.thread.ThreadManager;
import com.tuibi.common.juc.thread.runnable.BaseRunnable;
import com.tuibi.common.util.SpringContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
@Slf4j
public class UserMachineGameServiceImpl implements UserMachineGameService {

    @Autowired
    private UserMachineGameMapper userMachineGameMapper;
    @Autowired
    private UserMachineGameService userMachineGameService;
    @Autowired
    private MachineMainService machineMainService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private IdService idService;
    @Autowired
    private UserCharterMachineService userCharterMachineService;

    @Override
    public List<UserMachineGame> getUserMachineGameByMachineId(List<String> machineIds, String[] properties) {
        if(properties == null || properties.length == 0) {
            properties = new String[]{"userCode", "machineId"};
        }
        List<UserMachineGame> userMachineGames = userMachineGameMapper.selectByCondition(Condition.builder(UserMachineGame.class).where(
                Sqls.custom()
                        .andIn("machineId", machineIds)
        ).orderByDesc("isGame", "gxsj").select(properties).build());
        return userMachineGames;
    }

    @Override
    public Map<String, List<UserMachineGame>> getGroupUserMachineGameByMachineId(List<String> machineIds, String[] properties) {
        List<UserMachineGame> userMachineGameByMachineId = userMachineGameService.getUserMachineGameByMachineId(machineIds, properties);
        Map<String, List<UserMachineGame>> machinePlayerUserMap = new HashMap<>();
        for(Iterator<UserMachineGame> iterator = userMachineGameByMachineId.iterator(); iterator.hasNext(); ) {
            UserMachineGame userMachineGame = iterator.next();
            List<UserMachineGame> userMachineGames = machinePlayerUserMap.get(userMachineGame.getMachineId());
            if(userMachineGames == null) {
                userMachineGames = new ArrayList<>();
                machinePlayerUserMap.put(userMachineGame.getMachineId(), userMachineGames);
            }
            userMachineGames.add(userMachineGame);
        }
        return machinePlayerUserMap;
    }

    @Override
    @Cacheable(value = "FOREVER", key = "'getRecentlyPlayUserMachineGameList-' + #channelId")
    public List<UserMachineGame> getRecentlyPlayUserMachineGameList(Integer channelId) {
        return userMachineGameMapper.getRecentlyPlayUserMachineGameList(20, channelId);
    }

    @Override
    @CacheEvict(value = "FOREVER", key = "'getRecentlyPlayUserMachineGameList-' + #channelId")
    public void clearRecentlyPlayUserMachineGameListCache(Integer channelId) {

    }

    @Override
    public UserMachineGame getUserPlayMachine(String userCode) {
        List<UserMachineGame> userMachineGameList = userMachineGameMapper.selectByCondition(Condition.builder(UserMachineGame.class).where(
                Sqls.custom().andEqualTo("userCode", userCode)
                        .andEqualTo("isGame", "1")
        ).build());
        if(userMachineGameList.isEmpty()) return null;
        return userMachineGameList.get(0);
    }

    @Override
    public UserMachineGame getUserMachineGameInfo(String userCode, String machineId) {
        List<UserMachineGame> userMachineGames = userMachineGameMapper.selectByCondition(Condition.builder(UserMachineGame.class).where(
                Sqls.custom().andEqualTo("userCode", userCode)
                        .andEqualTo("machineId", machineId)
        ).build());
        if(userMachineGames.isEmpty()) return null;
        return userMachineGames.get(0);
    }

    @Override
    public int insertSelectiveUserMachineGame(UserMachineGame userMachineGame) {
        if(userMachineGame == null) return 0;
        machineMainService.refreshMachineGroupVersion(userMachineGame.getMachineId());

        return userMachineGameMapper.insertSelective(userMachineGame);
    }

    @Override
    public int updateUserMachineGameSelective(UserMachineGame update, String machineId, String userCode, String oldIsGame) {
        if(update == null) return 0;

        Sqls sqls = Sqls.custom().andEqualTo("machineId", machineId)
                .andEqualTo("userCode", userCode);
        if(oldIsGame != null) {
            sqls.andEqualTo("isGame", oldIsGame);
        }
        return userMachineGameMapper.updateByConditionSelective(update, Condition.builder(UserMachineGame.class).where(
                sqls
        ).build());
    }

    @Override
    public int swithcUserMachineGameSelective(String machineId, String userCode, String newMachineId) {
        return userMachineGameMapper.updateByConditionSelective(UserMachineGame.builder().machineId(newMachineId).build(), Condition.builder(UserMachineGame.class).where(
                Sqls.custom().andEqualTo("userCode", userCode)
                        .andEqualTo("machineId", machineId)
                        .andEqualTo("isGame", "0")
        ).build());
    }

    @Override
    public int batchUpdateUserMachineGameGxsj(Collection<String> gameIds) {
        UserMachineGame update = new UserMachineGame();
        update.setGxsj(LocalDateTimeUtil.formatNormal(LocalDateTime.now()));
        return userMachineGameMapper.updateByConditionSelective(update, Condition.builder(UserMachineGame.class).where(
                Sqls.custom().andIn("gameId", gameIds)
        ).build());
    }

    @Override
    public int deleteUserMachineGame(String userCode, String machineId) {
        return userMachineGameMapper.deleteByCondition(Condition.builder(UserMachineGame.class).where(
                Sqls.custom().andEqualTo("userCode", userCode)
                        .andEqualTo("machineId", machineId)
        ).build());
    }

    @Override
    public List<String> getGroupMachineIdByGxsjRecord(String gxsj) {
        if(gxsj == null) return Collections.emptyList();
        return userMachineGameMapper.getGroupMachineIdByGxsjRecord(gxsj);
    }

    @Override
    public List<UserMachineGame> getUserMachineGameList(Sqls sqls) {
        return userMachineGameMapper.selectByCondition(Condition.builder(UserMachineGame.class).where(
                sqls
        ).build());
    }

    @Override
    public int deleteUserMachineGameRecord(Sqls sqls) {
        return userMachineGameMapper.deleteByCondition(Condition.builder(UserMachineGame.class).where(
                sqls
        ).build());
    }

    @Override
    public int deleteUserMachineGameRecordById(String id) {
        return userMachineGameMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void returnTicketOver(String machineId, String machineAlias) {
        UserMachineGame userMachineGameInfo = userMachineGameService.getUserMachineGameInfo(ConstantGlobal.getSystemPlaceholderMachineUserCode(), machineId);
        if(userMachineGameInfo == null) {
            
            return;
        }
        returnTicketOver(machineId, machineAlias,
                userMachineGameInfo.getUserCodeSrc(),
                userMachineGameInfo.getBz());
    }

    @Override
    public void returnTicketOver(String machineId, String machineAlias, String userCode, String logId) {
        int deleteSystemRecord = userMachineGameService.deleteUserMachineGame(ConstantGlobal.getSystemPlaceholderMachineUserCode(), machineId);
        if(deleteSystemRecord < 1) {
            
        } else {
            CacheUtil.delete(RedisConst.USER_PLAYMACHINE.getKey(machineId));
            CacheUtil.delete(RedisConst.MACHINE_RETURNTICKET.getKey(machineAlias));
            AbstractMachineOperateService.removeMachineStartTag(machineId);
            machineMainService.refreshMachineGroupVersion(machineId);
            SpringContextHolder.publishEvent(new UserMachineDownEvent(machineId, userCode, logId));
            
        }
    }

    @Override
    public Collection<String> clearUserLookGameRecord(String userCode) {
        List<UserMachineGame> userMachineGameList = userMachineGameService.getUserMachineGameList(Sqls.custom().andEqualTo("userCode", userCode)
                .andEqualTo("isGame", "0"));
        if(userMachineGameList.isEmpty()) return Collections.emptyList();
        int delUserLookMachineRecord = deleteUserMachineGameRecord(Sqls.custom()
                .andIn("gameId", userMachineGameList.stream()
                        .map(UserMachineGame::getGameId).collect(Collectors.toList())));
        if(delUserLookMachineRecord > 0) {
            
        }
        userMachineGameList.stream().forEach(userMachineGame -> SpringContextHolder.publishEvent(new MachineVersionChangeEvent(userMachineGame.getMachineId())));
        return userMachineGameList.stream().map(UserMachineGame::getMachineId).collect(Collectors.toList());
    }
}
