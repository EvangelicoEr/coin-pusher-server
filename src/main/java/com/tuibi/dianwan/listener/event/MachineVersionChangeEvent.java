package com.tuibi.dianwan.listener.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author: xx
 * 
 * @email: 
 * 机器版本变动
 */
public class MachineVersionChangeEvent extends ApplicationEvent {

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param machineId the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public MachineVersionChangeEvent(String machineId) {
        super(machineId);
    }
}
