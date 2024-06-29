package com.tuibi.dianwan.service;

import com.tuibi.dianwan.vo.CurrencyBaseResp;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UserSigninService {
    /**
     * 获取玩家签到天数
     * @return
     */
    int getUserSigninDayNum(String userCode);

    /**
     * 查询玩家当日是否签到
     * @return
     */
    boolean getTodayUserSignin(String userCode);

    /**
     * 玩家签到
     */
    CurrencyBaseResp doUserSignin();
}
