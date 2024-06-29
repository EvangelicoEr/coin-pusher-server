package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UserCharterMachine;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UserCharterMachineService {

    /**
     * 获取机器包机情况
     * @param machineId
     * @return
     */
    UserCharterMachine getUserCharterMachine(String machineId);

    /**
     * 获取所有玩家包机数据
     * @return
     */
    List<UserCharterMachine> getAllUserCharterMachine();

    /**
     * 增加玩家扣除金币
     * @param userCode
     * @param machineId
     * @param costValue
     * @return
     */
    int addUserCostLost(String userCode, String machineId, Integer costValue);

    /**
     * 增加玩家获得金币
     * @param userCode
     * @param machineId
     * @param getValue
     * @return
     */
    int addUserCostGet(String userCode, String machineId, Integer getValue);

    int updateCharterMachineSelective(UserCharterMachine userCharterMachine, String machineId, String userCode);

    /**
     * 包机结束
     * @param machineId
     * @param userCode
     * @param logCostId
     */
    void charterFlightEnd(String machineId, String userCode, String logCostId);

    /**
     * 插入包机数据
     * @param userCharterMachine
     * @return
     */
    int insertUserCharterMachine(UserCharterMachine userCharterMachine);
}
