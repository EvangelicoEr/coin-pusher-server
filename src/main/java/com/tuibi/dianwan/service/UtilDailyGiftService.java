package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UtilDailyGifts;
import com.tuibi.dianwan.vo.ContinuousRushInfoResp;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UtilDailyGiftService {

    List<UtilDailyGifts> getAllDailyGift();

    void clearAllDailyGiftCache();

    UtilDailyGifts getDailyGift(Integer id);

    /**
     * 返回超值连冲数据
     * @return
     */
    List<ContinuousRushInfoResp> getUserContinuousRushInfoResp();
}
