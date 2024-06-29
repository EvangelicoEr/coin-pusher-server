package com.tuibi.dianwan.listener.event;

import com.tuibi.dianwan.enums.UserMachineActionEnum;
import org.springframework.context.ApplicationEvent;
import org.springframework.util.Assert;

/**
 * @author: xx
 * 
 * @email: 
 */
public class UserMachineActionEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param action the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    private String userCode;
    private String machineId;
    public UserMachineActionEvent(UserMachineActionEnum action, String userCode, String machineId) {
        super(action);
        this.userCode = userCode;
        this.machineId = machineId;
        Assert.notNull(action);
        Assert.notNull(userCode);
        Assert.notNull(machineId);
    }

    public String getUserCode() {
        return userCode;
    }

    public String getMachineId() {
        return machineId;
    }
}
