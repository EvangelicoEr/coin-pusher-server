package com.tuibi.dianwan.listener.event;

import com.tuibi.dianwan.vo.CurrencyBaseResp;
import org.springframework.context.ApplicationEvent;

/**
 * @author: xx
 * 
 * @email: 
 */
public class UserCurrencyChangeEvent extends ApplicationEvent {

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    private String userCode;
    
    private boolean charterFlight;
    public UserCurrencyChangeEvent(CurrencyBaseResp source, String userCode) {
        this(source, userCode, false);
    }

    public UserCurrencyChangeEvent(CurrencyBaseResp source, String userCode, boolean charterFlight) {
        super(source);
        this.userCode = userCode;
        this.charterFlight = charterFlight;
    }

    public String getUserCode() {
        return userCode;
    }

    public boolean isCharterFlight() {
        return charterFlight;
    }

}
