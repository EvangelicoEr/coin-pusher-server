package com.tuibi.dianwan.service.impl;

import cn.hutool.core.lang.Pair;
import com.tuibi.dianwan.entity.UserCostLog;
import com.tuibi.dianwan.entity.UserInfo;
import com.tuibi.dianwan.entity.UtilExperienceLevel;
import com.tuibi.dianwan.enums.AccessMarkEnum;
import com.tuibi.dianwan.enums.PlayerRespTypeEnum;
import com.tuibi.dianwan.enums.RedDotTypeEnum;
import com.tuibi.dianwan.enums.RewardSourceTypeEnum;
import com.tuibi.dianwan.global.ConstantGlobal;
import com.tuibi.dianwan.mapper.UtilExperienceLevelMapper;
import com.tuibi.dianwan.nio.PlayerSession;
import com.tuibi.dianwan.nio.PlayerSessionManager;
import com.tuibi.dianwan.pojo.UserAccessMark;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.AccessService;
import com.tuibi.dianwan.service.UserCostLogService;
import com.tuibi.dianwan.service.UserInfoService;
import com.tuibi.dianwan.service.UtilExperienceLevelService;
import com.tuibi.dianwan.vo.CurrencyBaseResp;
import com.tuibi.dianwan.vo.ExperienceLevelInfoResp;
import com.tuibi.dianwan.vo.UserExperienceLevelResp;
import com.tuibi.proto.Notify;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.robert.vesta.service.intf.IdService;
import com.tuibi.common.base.error.BizException;
import com.tuibi.common.base.model.ResultCode;
import com.tuibi.common.juc.thread.ThreadManager;
import com.tuibi.common.juc.thread.runnable.BaseRunnable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
@Slf4j
public class UtilExperienceLevelServiceImpl implements UtilExperienceLevelService {

    @Autowired
    private UtilExperienceLevelMapper utilExperienceLevelMapper;
    @Autowired
    private UtilExperienceLevelService utilExperienceLevelService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserCostLogService userCostLogService;
    @Autowired
    private AccessService accessService;
    @Autowired
    private IdService idService;

    @Override
    @Cacheable(value = "FOREVER", key = "'getAllUtilExperienceLevel'")
    public List<UtilExperienceLevel> getAllUtilExperienceLevel() {
        return utilExperienceLevelMapper.selectAll().stream()
                .sorted(Comparator.comparingInt(UtilExperienceLevel::getExperienceLevelExperience))
                .collect(Collectors.toList());
    }

    @Override
    @CacheEvict(value = "FOREVER", key = "'getAllUtilExperienceLevel'")
    public void clearAllUtilExperienceLevel() {

    }

    @Override
    public Pair<UtilExperienceLevel, UtilExperienceLevel> calcUserExperienceLevel(Integer userCostLose) {
        int curIndex = 0;
        List<UtilExperienceLevel> allUtilExperienceLevel = utilExperienceLevelService.getAllUtilExperienceLevel();
        for(int i=0; i<allUtilExperienceLevel.size(); i++) {
            UtilExperienceLevel experienceLevel = allUtilExperienceLevel.get(i);
            if(userCostLose >= experienceLevel.getExperienceLevelExperience()) {
                curIndex = i;
            } else {
                break;
            }
        }
        UtilExperienceLevel curLevel = allUtilExperienceLevel.get(curIndex), nextLevel;
        if(curIndex != allUtilExperienceLevel.size() - 1) {
            nextLevel = allUtilExperienceLevel.get(curIndex + 1);
        } else {
            nextLevel = curLevel;
        }
        return Pair.of(curLevel, nextLevel);
    }

    @Override
    public UtilExperienceLevel getExperienceLevelById(Integer levelId) {
        return utilExperienceLevelService.getAllUtilExperienceLevel().stream()
                .filter(utilExperienceLevel -> utilExperienceLevel.getExperienceLevelId().equals(levelId)).findFirst().orElse(null);
    }

    @Override
    public UserExperienceLevelResp getUserExperienceLevelResp(DianwanUserLoginInfo DianwanUserLoginInfo) {
        List<UtilExperienceLevel> allUtilExperienceLevel = utilExperienceLevelService.getAllUtilExperienceLevel();
        if(allUtilExperienceLevel.isEmpty()) {
            return ConstantGlobal.EMPTY_GIFTCODE;
        }
        UserInfo userInfo = userInfoService.getUserInfo(DianwanUserLoginInfo.getUserCode());
        int curIndex = 0;
        List<ExperienceLevelInfoResp> levelList = Lists.newArrayListWithCapacity(allUtilExperienceLevel.size());
        Set<ExperienceLevelInfoResp> experienceLevelIds = new HashSet<>();
        for(int i=0; i<allUtilExperienceLevel.size(); i++) {
            UtilExperienceLevel experienceLevel = allUtilExperienceLevel.get(i);
            if(userInfo.getUserCostLose() >= experienceLevel.getExperienceLevelExperience()) {
                curIndex = i;
            }
            ExperienceLevelInfoResp levelInfoResp = new ExperienceLevelInfoResp();
            levelInfoResp.setId(experienceLevel.getExperienceLevelId());
            levelInfoResp.setIcon(experienceLevel.getExperienceLevelLogo());
            levelInfoResp.setName(experienceLevel.getExperienceLevelName());
            levelInfoResp.setRewardValue(experienceLevel.getExperienceRewardNum());
            levelInfoResp.setRewardType(experienceLevel.getExperienceRewardType());
            if(experienceLevel.getExperienceLevelExperience() > userInfo.getUserCostLose()) {
                levelInfoResp.setState(0);
            } else {
                
                if(experienceLevel.getExperienceRewardNum() <= 0) {
                    levelInfoResp.setState(2);
                } else {
                    levelInfoResp.setState(1);
                    experienceLevelIds.add(levelInfoResp);
                }
            }
            levelList.add(levelInfoResp);
        }
        UtilExperienceLevel curLevel = allUtilExperienceLevel.get(curIndex), nextLevel = null;
        if(curIndex != allUtilExperienceLevel.size() - 1) {
            nextLevel = allUtilExperienceLevel.get(curIndex + 1);
        }
        if(!experienceLevelIds.isEmpty()) {
            List<UserCostLog> receverTypeList = userCostLogService.getUserCostLogByType(DianwanUserLoginInfo.getUserId(),
                    RewardSourceTypeEnum.EXPERIENCE_LEVEL.getSourceStr(), experienceLevelIds.stream().map(ExperienceLevelInfoResp::getId)
                            .map(String::valueOf).collect(Collectors.toSet()));
            if(!receverTypeList.isEmpty()) {
                for(Iterator<ExperienceLevelInfoResp> iterator = experienceLevelIds.iterator(); iterator.hasNext(); ) {
                    ExperienceLevelInfoResp experienceLevelInfoResp = iterator.next();
                    if(receverTypeList.stream()
                            .filter(userCostLog -> experienceLevelInfoResp.getId().toString().equals(userCostLog.getLogJoinId()))
                            .findFirst().isPresent()) {
                        experienceLevelInfoResp.setState(2);
                    }
                }
            }
        }
        UserExperienceLevelResp resp = new UserExperienceLevelResp();
        resp.setLevelName(curLevel.getExperienceLevelName());
        resp.setNextExperience(Optional.ofNullable(nextLevel).map(UtilExperienceLevel::getExperienceLevelExperience)
                .orElse(userInfo.getUserCostLose()));
        resp.setCurExperience(userInfo.getUserCostLose());
        resp.setLevelList(levelList);
        if(userInfo.getExperienceLevelId() != curLevel.getExperienceLevelId()) {
            
            userInfoService.updateUserExperienceLevel(DianwanUserLoginInfo.getUserCode(), curLevel.getExperienceLevelId());
            PlayerSession playerSession = PlayerSessionManager.getSession(userInfo.getUserCode());
            if(playerSession != null) {
                playerSession.sendMsg(PlayerRespTypeEnum.USER_INFO.build(String.valueOf(idService.genId()),
                        Notify.UserInfoChangeResp.newBuilder()
                                .setExperienceLevelName(curLevel.getExperienceLevelName())
                                .setExperienceLevelIcon(curLevel.getExperienceLevelLogo())
                                .build().toByteString()));
            }
        }
        return resp;
    }

    @Override
    public CurrencyBaseResp receverExperienceLevelReward(Integer levelId) {
        UtilExperienceLevel experienceLevel = getExperienceLevelById(levelId);
        if(experienceLevel == null)
            throw new BizException(ResultCode.FAIL, "等级奖励不存在,无法领取!");
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        UserAccessMark accessMark = accessService.getFiveSecAccessMark(AccessMarkEnum.EXPERIENCE_LEVEL, DianwanUserLoginInfo.getUserCode() + "-" + levelId);
        if(!accessMark.canAccess()) {
            throw new BizException(ResultCode.FAIL, "请求频繁,请稍后再试!");
        }
        List<UserCostLog> findReward = userCostLogService.getUserCostLogByType(DianwanUserLoginInfo.getUserId(),
                RewardSourceTypeEnum.EXPERIENCE_LEVEL.getSourceStr(), Sets.newHashSet(experienceLevel.getExperienceLevelId().toString()));
        if(!findReward.isEmpty()) {
            throw new BizException(ResultCode.FAIL, "奖励已领取,请继续加油哦!");
        }
        CurrencyBaseResp resp = new CurrencyBaseResp();
        if(experienceLevel.getExperienceRewardNum() > 0) {
            String valueName;
            if(experienceLevel.getExperienceRewardType() == 1) {
                valueName = "积分";
                resp.setIntegral(experienceLevel.getExperienceRewardNum());
            } else {
                valueName = "金币";
                resp.setMoney(experienceLevel.getExperienceRewardNum());
            }
            userInfoService.addMonetaryRewards(DianwanUserLoginInfo.getUserCode(), experienceLevel.getExperienceRewardType(),
                    "领取经验等级获得奖励:" + experienceLevel.getExperienceRewardNum() + valueName,
                    experienceLevel.getExperienceRewardNum(), levelId.toString(), RewardSourceTypeEnum.EXPERIENCE_LEVEL);
        }
        ThreadManager.executeOrderIoTask(DianwanUserLoginInfo.getUserId(), new BaseRunnable() {
            @Override
            public void execute() {
                RedDotTypeEnum.EXPERIENCE_LEVEL.operateRedDotAndNotify(DianwanUserLoginInfo.getUserCode(), true);
            }

            @Override
            public String getName() {
                return "经验等级减少红点数-" + DianwanUserLoginInfo.getUserCode();
            }
        });
        return resp;
    }
}
