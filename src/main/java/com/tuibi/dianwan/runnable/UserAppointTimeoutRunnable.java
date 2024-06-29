package com.tuibi.dianwan.runnable;

import com.tuibi.dianwan.pojo.MachineRoomBaseVersionReq;
import com.tuibi.dianwan.service.MachineMainService;
import com.tuibi.common.juc.thread.runnable.BaseRunnable;
import com.tuibi.common.util.SpringContextHolder;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: xx
 * 
 * @email: 
 */
@Slf4j
public class UserAppointTimeoutRunnable extends BaseRunnable {

    private String machineId;
    private String userCode;
    public UserAppointTimeoutRunnable(String userCode, String machineId) {
        this.machineId = machineId;
        this.userCode = userCode;
    }

    @Override
    public String getName() {
        return "玩家预约未游戏等待超时线程-"+machineId+"-"+userCode;
    }

    @Override
    public void execute() {
        MachineRoomBaseVersionReq cancelReservationMachineReq = new MachineRoomBaseVersionReq();
        cancelReservationMachineReq.setVersion(Long.MAX_VALUE);
        cancelReservationMachineReq.setMachineId(machineId);
        SpringContextHolder.getBean(MachineMainService.class).cancelReservationMachine(userCode, cancelReservationMachineReq);
        
    }
}
