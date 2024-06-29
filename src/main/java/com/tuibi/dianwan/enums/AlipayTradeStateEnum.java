package com.tuibi.dianwan.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: xx
 * 
 * @email: 
 */
@AllArgsConstructor
@Getter
public enum AlipayTradeStateEnum {
    TRADE_SUCCESS("支付成功"),
    WAIT_BUYER_PAY("未支付"),
    TRADE_CLOSED("支付超时"),
    TRADE_FINISHED("交易结束,不可退款"),
    ;
    private String desc;

    public static AlipayTradeStateEnum match(String state) {
        for(AlipayTradeStateEnum alipayTradeStateEnum : values()) {
            if(alipayTradeStateEnum.name().equals(state)) {
                return alipayTradeStateEnum;
            }
        }
        return null;
    }
}
