package com.tuibi.dianwan.listener.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.util.Assert;

/**
 * @author: xx
 * 
 * @email: 
 * 玩家开始包机事件
 */
public class UserCharterMachineEvent extends ApplicationEvent {

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    private String userCode;
    public UserCharterMachineEvent(String machineId, String userCode) {
        super(machineId);
        Assert.notNull(userCode, "玩家编号不能为空");
        this.userCode = userCode;
    }

    public String getUserCode() {
        return userCode;
    }

    public String getMachineId() {
        return (String) source;
    }
}
