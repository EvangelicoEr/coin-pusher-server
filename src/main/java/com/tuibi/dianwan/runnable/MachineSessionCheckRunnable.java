package com.tuibi.dianwan.runnable;

import com.tuibi.dianwan.nio.MachineSessionManager;
import com.tuibi.dianwan.config.SysParamDictConfig;
import com.tuibi.common.juc.thread.runnable.BaseRunnable;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: xx
 * 
 * @email: 
 */
@Slf4j
public class MachineSessionCheckRunnable extends BaseRunnable {

    @Override
    public String getName() {
        return "机器连接检测任务";
    }

    @Override
    public void execute() {
        if(!SysParamDictConfig.getInstance().getCheckMachineSessionTimeout()) return;
        MachineSessionManager.checkSessionConnect();
    }
}
