package com.tuibi.dianwan.enums;

import lombok.Getter;

/**
 * @author: xx
 * 
 * @email: 
 * 所有奖励来源类型
 */
@Getter
public enum RewardSourceTypeEnum {
    
    WEEKCARD(1),
    
    MAIL(2),
    
    TASK(3),
    
    SIGNIN(4),
    
    GIFT_CODE(5),
    
    EXPERIENCE_LEVEL(6),
    
    REGISTER(7, false),
    
    INVITE_USER(8),
    
    BE_INVITE_USER(9),
    
    PAY_COIN_GIFTPACK(10),
    
    PAY_VOUCHER(11),
    
    PAY_DAILYGIFT(12),
    
    VIP_UPGRADE(13),
    
    MACHINE_SETTLEMENT_REWARD(14),
    
    MACHINE_COIN_CONSUMPTION(15, false),
    
    CHARTERMACHINE_SETTLEMENT_REWARD(16),
    
    BACKSTAGE_GIFT(17),
    
    BACKEND_DEDUCTION(18, false),
    
    BIND_PHONE(19),
    
    EXCHNAGE_MONEY(20),
    ;
    private int source;
    private boolean show;

    RewardSourceTypeEnum(int source) {
        this(source, true);
    }

    RewardSourceTypeEnum(int source, boolean show) {
        this.source = source;
        this.show = show;
    }

    public String getSourceStr() {
        return String.valueOf(source);
    }

    public static RewardSourceTypeEnum match(int source) {
        for(RewardSourceTypeEnum sourceType : values()) {
            if(sourceType.source == source) {
                return sourceType;
            }
        }
        return null;
    }
}
