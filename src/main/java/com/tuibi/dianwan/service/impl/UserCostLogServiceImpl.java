package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.UserCostLog;
import com.tuibi.dianwan.enums.RewardSourceTypeEnum;
import com.tuibi.dianwan.mapper.UserCostLogMapper;
import com.tuibi.dianwan.pojo.UserMoneyRecordQueryReq;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.UserCostLogService;
import com.tuibi.dianwan.vo.UserMoneyRecordResp;
import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import com.tuibi.common.base.api.PageInfo;
import com.tuibi.common.base.util.PageInfoUtil;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;
import java.util.Set;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
public class UserCostLogServiceImpl implements UserCostLogService {

    @Autowired
    private UserCostLogMapper userCostLogMapper;
    private static final List<String> IGNORE_TYPES = Lists.newArrayList(
            RewardSourceTypeEnum.MACHINE_SETTLEMENT_REWARD.getSourceStr(),
            RewardSourceTypeEnum.MACHINE_COIN_CONSUMPTION.getSourceStr()
    );

    @Override
    public PageInfo<UserMoneyRecordResp> getUserMoneyRecord(UserMoneyRecordQueryReq req) {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        PageHelper.startPage(req.getPageNum(), req.getPageSize());
        Sqls sqls = Sqls.custom().andEqualTo("userId", DianwanUserLoginInfo.getUserInfo().getUserId().toString())
                .andNotIn("logType", IGNORE_TYPES)
                .andEqualTo("logCostType", req.getValueType())
                .andEqualTo("zt", "2");
        if("2".equals(req.getValueType())) {
            
            sqls.andEqualTo("logOperation", 1);
        }
        List<UserCostLog> userCostLogList = userCostLogMapper.selectByCondition(Condition.builder(UserCostLog.class).where(
                sqls
        ).orderByDesc("lrsj").build());
        return PageInfoUtil.makePageInfo(userCostLogList, userCostLog -> {
            UserMoneyRecordResp resp = new UserMoneyRecordResp();
            resp.setContent(userCostLog.getLogContent());
            resp.setOperator(userCostLog.getLogOperation());
            resp.setChangeNum(userCostLog.getLogNum());
            resp.setCreateTime(userCostLog.getLrsj());
            resp.setLastBalance(userCostLog.getLogBalance());
            return resp;
        });
    }

    @Override
    public int insertUserCostLogSelective(UserCostLog userCostLog) {
        if(userCostLog == null) return 0;
        return userCostLogMapper.insertSelective(userCostLog);
    }

    @Override
    public List<UserCostLog> getUserCostLogByType(Integer userId, String logType, Set<String> joinIds) {
        Sqls sqls = Sqls.custom().andEqualTo("userId", userId)
                .andEqualTo("logType", logType);
        if(CollectionUtils.isNotEmpty(joinIds)) {
            sqls.andIn("logJoinId", joinIds);
        }
        return userCostLogMapper.selectByCondition(Condition.builder(UserCostLog.class).where(
                sqls
        ).build());
    }
}
