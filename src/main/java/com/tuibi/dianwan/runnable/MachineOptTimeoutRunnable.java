package com.tuibi.dianwan.runnable;

import com.tuibi.dianwan.entity.MachineMain;
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
public class MachineOptTimeoutRunnable extends BaseRunnable {

    private String machineId;
    private String userCode;
    private Integer channelId;
    public MachineOptTimeoutRunnable(String machineId, String userCode, Integer channelId) {
        this.machineId = machineId;
        this.userCode = userCode;
        this.channelId = channelId;
    }

    @Override
    public String getName() {
        return "机器占用超时-"+machineId+"-"+userCode;
    }

    @Override
    public void execute() {
        MachineMainService machineMainService = SpringContextHolder.getBean(MachineMainService.class);
        MachineMain machineMain = machineMainService.getMachineMainById(machineId);
        machineMainService.returnMachineTicket(machineMain, userCode, channelId);
        
    }

}
