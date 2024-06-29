package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.MachineMain;
import com.tuibi.dianwan.pojo.BaseOperateMachineReq;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.vo.OperateMachineResp;
import com.tuibi.common.framework.config.RedisConst;
import com.tuibi.common.juc.thread.ThreadManager;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface MachineOperateService {

    int DEFAULT_RETURN_TICKET_TIMEOUTTIME = 300;

    void gameStart(MachineMain machineMain, DianwanUserLoginInfo DianwanUserLoginInfo);

    void operate(MachineMain machineMain, DianwanUserLoginInfo DianwanUserLoginInfo, BaseOperateMachineReq req, OperateMachineResp resp);

    void cancelAllScheduleFuture(String machineId);

    void returnTicket(MachineMain machineMain, String userCode, Integer channelId);

    void refreshMachineOptTimeoutTime(String machineId, String userCode, Integer channelId, int delaySecond);

    static void cancelReturnTickFuture(String machineAlias) {
        String key = RedisConst.MACHINE_RETURNTICKET.getKey(machineAlias);
        ThreadManager.cancelFuture(key);
    }
}
