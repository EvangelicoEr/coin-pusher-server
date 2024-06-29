package com.tuibi.dianwan.listener.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author: xx
 * 
 * @email: 
 * 重载玩家信息事件
 */
public class ReloadUserEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public ReloadUserEvent(String userCode) {
        super(userCode);
    }
}
