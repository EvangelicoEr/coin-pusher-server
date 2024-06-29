package com.tuibi.dianwan.listener.event;

import org.springframework.context.ApplicationEvent;

public class MachineDisConnectEvent extends ApplicationEvent {

    public MachineDisConnectEvent(String machineAlias) {
        super(machineAlias);
    }
}
