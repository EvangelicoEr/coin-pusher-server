package com.tuibi.dianwan.listener.event;

import com.tuibi.dianwan.entity.UserInfo;
import org.springframework.context.ApplicationEvent;

/**
 * @author: xx
 * 
 * @email: 
 */
public class UserInfoChangeEvent extends ApplicationEvent {

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    private String userCode;
    public UserInfoChangeEvent(UserInfo source, String userCode) {
        super(source);
        this.userCode = userCode;
    }

    public String getUserCode() {
        return userCode;
    }
}
