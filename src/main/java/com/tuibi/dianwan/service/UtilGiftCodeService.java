package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UtilGiftCode;
import com.tuibi.dianwan.vo.CurrencyBaseResp;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UtilGiftCodeService {
    /**
     * 玩家兑换兑换码
     * @param code
     */
    CurrencyBaseResp redeemCode(String code);

    /**
     * 获取兑换码
     * @param code
     * @return
     */
    UtilGiftCode getGiftCode(String code);
    /**
     * 清除兑换码缓存
     * @param code
     * @return
     */
    void clearGiftCodeCache(String code);
}
