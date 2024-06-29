package com.tuibi.dianwan.listener.event;

import com.tuibi.dianwan.entity.UserInfo;
import org.springframework.context.ApplicationEvent;

/**
 * @author: xx
 * 
 * @email: 
 */
public class UserRegisterEvent extends ApplicationEvent {

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param registerUserInfo the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public UserRegisterEvent(UserInfo registerUserInfo) {
        super(registerUserInfo);
    }
}
