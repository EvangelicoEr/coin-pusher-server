package com.tuibi.dianwan.service;

import cn.hutool.core.lang.Pair;
import com.tuibi.dianwan.entity.UtilExperienceLevel;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.vo.CurrencyBaseResp;
import com.tuibi.dianwan.vo.UserExperienceLevelResp;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UtilExperienceLevelService {

    List<UtilExperienceLevel> getAllUtilExperienceLevel();

    void clearAllUtilExperienceLevel();

    /**
     * 根据消耗计算等级
     * @param userCostLose
     * @return
     */
    
    Pair<UtilExperienceLevel, UtilExperienceLevel> calcUserExperienceLevel(Integer userCostLose);

    UtilExperienceLevel getExperienceLevelById(Integer levelId);

    UserExperienceLevelResp getUserExperienceLevelResp(DianwanUserLoginInfo DianwanUserLoginInfo);

    /**
     * 领取经验等级奖励
     * @param levelId
     * @return
     */
    CurrencyBaseResp receverExperienceLevelReward(Integer levelId);
}
