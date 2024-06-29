package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UtilSigninCumulative;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UtilSigninCumulativeService {

    List<UtilSigninCumulative> getAllSigninCumulative();

    void clearAllSigninCumulativeCache();

    int getTotSigninDay();

    UtilSigninCumulative getSigninCumulativeByDay(Integer dayNum);
}
