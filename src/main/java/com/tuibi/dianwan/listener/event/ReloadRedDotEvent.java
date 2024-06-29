package com.tuibi.dianwan.listener.event;

import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import org.springframework.context.ApplicationEvent;

/**
 * @author: xx
 * 
 * @email: 
 */
public class ReloadRedDotEvent extends ApplicationEvent {

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param userInfo the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public ReloadRedDotEvent(DianwanUserLoginInfo userInfo) {
        super(userInfo);
    }
}
