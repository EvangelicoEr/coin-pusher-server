package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UserMachineGame;
import com.tuibi.dianwan.vo.EnterMachineResp;
import com.tuibi.dianwan.vo.MachineRoomDataResp;
import tk.mybatis.mapper.util.Sqls;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UserMachineGameService {

    List<UserMachineGame> getUserMachineGameByMachineId(List<String> machineIds, String[] properties);

    Map<String, List<UserMachineGame>> getGroupUserMachineGameByMachineId(List<String> machineIds, String[] properties);

    /**
     * 获取最近在玩的机器玩家信息
     * @param channelId 渠道id
     * @return
     */
    List<UserMachineGame> getRecentlyPlayUserMachineGameList(Integer channelId);

    /**
     * 清除最近在玩机器玩家信息缓存
     * @param channelId
     */
    void clearRecentlyPlayUserMachineGameListCache(Integer channelId);

    /**
     * 获取玩家正在游戏的机器信息
     * @param userCode
     * @return
     */
    UserMachineGame getUserPlayMachine(String userCode);

    /**
     * 获取玩家机器房间信息
     * @param userCode
     * @param machineId
     * @return
     */
    UserMachineGame getUserMachineGameInfo(String userCode, String machineId);

    /**
     * 进入房间
     * @param machineId
     * @param resp
     */
    void enterMachine(String machineId, MachineRoomDataResp resp);

    /**
     * 插入一条记录
     * @param userMachineGame
     * @return
     */
    int insertSelectiveUserMachineGame(UserMachineGame userMachineGame);

    int updateUserMachineGameSelective(UserMachineGame update, String machineId, String userCode, String oldIsGame);

    int swithcUserMachineGameSelective(String machineId, String userCode, String newMachineId);

    int batchUpdateUserMachineGameGxsj(Collection<String> gameIds);

    /**
     * 删除玩家机器访问记录
     * @param userCode
     * @param machineId
     * @return
     */
    int deleteUserMachineGame(String userCode, String machineId);
    List<String> getGroupMachineIdByGxsjRecord(String gxsj);

    List<UserMachineGame> getUserMachineGameList(Sqls sqls);

    int deleteUserMachineGameRecord(Sqls sqls);

    int deleteUserMachineGameRecordById(String id);

    void returnTicketOver(String machineId, String machineAlias, String userCode, String logId);

    void returnTicketOver(String machineId, String machineAlias);

    Collection<String> clearUserLookGameRecord(String userCode);

}
