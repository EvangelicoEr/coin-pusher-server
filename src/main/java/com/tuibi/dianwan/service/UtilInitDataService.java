package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UtilInitData;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UtilInitDataService {

    UtilInitData getInitDataById(Integer initId);

    void clearInitDataCache(Integer initId);
}
