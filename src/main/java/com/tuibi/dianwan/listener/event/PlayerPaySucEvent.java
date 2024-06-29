package com.tuibi.dianwan.listener.event;

import com.tuibi.dianwan.entity.UserCostRecharge;
import org.springframework.context.ApplicationEvent;

/**
 * @author: xx
 * 
 * @email: 
 */
public class PlayerPaySucEvent extends ApplicationEvent {

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param userOrder the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    private String userCode;
    private String shopName;
    public PlayerPaySucEvent(UserCostRecharge userOrder, String userCode, String shopName) {
        super(userOrder);
        this.userCode = userCode;
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public String getUserCode() {
        return userCode;
    }
}
