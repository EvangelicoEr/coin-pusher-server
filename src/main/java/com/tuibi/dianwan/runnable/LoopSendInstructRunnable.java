package com.tuibi.dianwan.runnable;

import com.tuibi.dianwan.enums.MachineInstruct;
import com.tuibi.dianwan.nio.MachineSessionManager;
import com.tuibi.common.juc.thread.ThreadManager;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: xx
 * 
 * @email: 
 */
@Slf4j
public class LoopSendInstructRunnable implements Runnable {

    private static final int INSTRUCT_UNIT_TIME = 1000;
    private int loopCnt;
    private MachineInstruct instruct;
    private String machineAlias;
    private static Map<String, Map<MachineInstruct, AtomicInteger>> machineInstructCntManager = new ConcurrentHashMap<>();
    private static Map<String, Boolean> machineReturnTicketManager = new ConcurrentHashMap<>();
    private int interval;
    private LoopSendInstructRunnable(int loopCnt, MachineInstruct instruct, String machineAlias, int interval) {
        this.loopCnt = loopCnt;
        this.instruct = instruct;
        this.machineAlias = machineAlias;
        this.interval = interval;
    }

    @Override
    public void run() {
        Boolean returnTicket = machineReturnTicketManager.getOrDefault(machineAlias, false);
        if(returnTicket) {
            machineInstructCntManager.get(machineAlias).get(instruct).set(0);
        } else {
            machineInstructCntManager.get(machineAlias).get(instruct).addAndGet(-interval);
            MachineSessionManager.sendMsg(machineAlias, instruct);
            if(--loopCnt > 0) {
                ThreadManager.scheduleCommonTask(this, interval, TimeUnit.MILLISECONDS);
            }
        }
    }

    public static ScheduledFuture newFutureTask(int loopCnt, MachineInstruct instruct, String machineAlias) {
        if(loopCnt < 1) return null;
        if(loopCnt == 1) {
            MachineSessionManager.sendMsg(machineAlias, instruct);
            return null;
        }
        Map<MachineInstruct, AtomicInteger> machineInstructCntMap = machineInstructCntManager.get(machineAlias);
        if(machineInstructCntMap == null) {
            machineInstructCntMap = new HashMap<>();
            Map<MachineInstruct, AtomicInteger> oldMap = machineInstructCntManager.putIfAbsent(machineAlias, machineInstructCntMap);
            if(oldMap != null) {
                machineInstructCntMap = oldMap;
            }
        }
        AtomicInteger cnt = machineInstructCntMap.get(instruct);
        if(cnt == null) {
            synchronized (machineInstructCntMap) {
                cnt = machineInstructCntMap.get(instruct);
                if (cnt == null) {
                    cnt = new AtomicInteger(0);
                    machineInstructCntMap.put(instruct, cnt);
                }
            }
        }
        int interval = INSTRUCT_UNIT_TIME / loopCnt;
        int lastDelay = cnt.getAndAdd(INSTRUCT_UNIT_TIME);
        return ThreadManager.scheduleCommonTask(new LoopSendInstructRunnable(loopCnt, instruct, machineAlias, interval),
                lastDelay, TimeUnit.MILLISECONDS);
    }

    public static void returnTicket(String machineAlias) {
        machineReturnTicketManager.put(machineAlias, true);
    }

    public static void releaseTicket(String machineAlias) {
        machineReturnTicketManager.put(machineAlias, false);
    }
}
