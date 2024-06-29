package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UserCostLog;
import com.tuibi.dianwan.pojo.UserMoneyRecordQueryReq;
import com.tuibi.dianwan.vo.UserMoneyRecordResp;
import com.tuibi.common.base.api.PageInfo;

import java.util.List;
import java.util.Set;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UserCostLogService {

    PageInfo<UserMoneyRecordResp> getUserMoneyRecord(UserMoneyRecordQueryReq req);

    int insertUserCostLogSelective(UserCostLog userCostLog);

    List<UserCostLog> getUserCostLogByType(Integer userId, String logType, Set<String> joinIds);
}
