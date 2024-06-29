package com.tuibi.dianwan.runnable;

import com.tuibi.dianwan.enums.TuiBiJiOperateTypeEnum;
import com.tuibi.dianwan.nio.MachineSessionManager;
import com.tuibi.common.juc.thread.ThreadManager;
import com.tuibi.common.juc.thread.timer.AbstractTimeTask;
import com.tuibi.common.juc.timer.Timeout;
import com.tuibi.common.juc.timer.TimerTask;

import java.io.Closeable;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class TbjExitQueryTimerTask extends AbstractTimeTask implements Closeable {

    private static final Map<String, TbjExitQueryTimerTask> machineExitQueryManager =
            new ConcurrentHashMap<>();
    private String machineAlias;
    private volatile boolean close;
    private TbjExitQueryTimerTask(String machineAlias) {
        this.machineAlias = machineAlias;
    }

    @Override
    public void run0(Timeout timeout) throws Exception {
        if(close) return;
        MachineSessionManager.sendMsg(machineAlias, TuiBiJiOperateTypeEnum.EXIT);
        timeout.timer().newTimeout(this, 2, TimeUnit.SECONDS);
    }

    public static void newTask(String machineAlias) {
        TbjExitQueryTimerTask task = new TbjExitQueryTimerTask(machineAlias);
        ThreadManager.newFastTimeout(task, 2, TimeUnit.SECONDS);
        TbjExitQueryTimerTask oldTimerTask = machineExitQueryManager.put(machineAlias, task);
        if(oldTimerTask != null) {
            oldTimerTask.close();
        }
    }

    public static void stopTask(String machineAlias) {
        TbjExitQueryTimerTask timerTask = machineExitQueryManager.remove(machineAlias);
        if(timerTask != null) {
            timerTask.close();
        }
    }

    @Override
    public void close() {
        close = true;
    }
}
