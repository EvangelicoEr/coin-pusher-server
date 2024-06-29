package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UtilNoviceWelfare;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.vo.CurrencyBaseResp;
import com.tuibi.dianwan.vo.WeekCardDataResp;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface WeekCardService {

    List<UtilNoviceWelfare> getAllWeekCard();

    void clearAllWeekCardCache();

    UtilNoviceWelfare getWeekCard(Integer id);

    List<WeekCardDataResp> getUserWeekCardData(DianwanUserLoginInfo DianwanUserLoginInfo);

    /**
     * 领取周卡奖励
     */
    CurrencyBaseResp receverWeekCardReward(Integer id);
}
