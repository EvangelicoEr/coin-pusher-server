package com.tuibi.dianwan.listener.event;

import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import org.springframework.context.ApplicationEvent;

/**
 * @author: xx
 * 
 * @email: 
 */
public class PlayerLoginOutEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param UserLoginInfo the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public PlayerLoginOutEvent(DianwanUserLoginInfo UserLoginInfo) {
        super(UserLoginInfo);
    }
}
