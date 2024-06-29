package com.tuibi.dianwan.listener.event;

import com.tuibi.dianwan.entity.MachineMain;
import org.springframework.context.ApplicationEvent;

public class MachineDisConnectNotifyWxPublicEvent extends ApplicationEvent {

    public MachineDisConnectNotifyWxPublicEvent(MachineMain machineMain) {
        super(machineMain);
    }
}
