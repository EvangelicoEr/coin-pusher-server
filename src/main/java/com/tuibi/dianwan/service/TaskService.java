package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UtilReward;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.vo.CurrencyBaseResp;
import com.tuibi.dianwan.vo.WelfareActivitiesInfoResp;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface TaskService {

    List<UtilReward> getAllTaskList();

    void clearAllTaskListCache();

    UtilReward getBindPhoneTaskInfo();

    /**
     * 获取福利活动数据
     * @return
     */
    WelfareActivitiesInfoResp getWelfareActivityInfoResp(DianwanUserLoginInfo DianwanUserLoginInfo);

    /**
     * 领取任务奖励
     * @param taskId
     */
    CurrencyBaseResp receverTaskReward(Integer taskId);
}
