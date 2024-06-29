package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.UserCostRecharge;
import com.tuibi.dianwan.mapper.UserCostRechargeMapper;
import com.tuibi.dianwan.service.UserCostRechargeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
@Slf4j
public class UserCostRechargeServiceImpl implements UserCostRechargeService {

    @Autowired
    private UserCostRechargeMapper userCostRechargeMapper;

    @Override
    public List<UserCostRecharge> getUserRecharge(Sqls sqls) {
        return userCostRechargeMapper.selectByCondition(Condition.builder(UserCostRecharge.class).where(sqls).build());
    }

    @Override
    public int insertUnpaidUserCostRecharge(UserCostRecharge unpaidOrder) {
        return userCostRechargeMapper.insertSelective(unpaidOrder);
    }

    @Override
    public UserCostRecharge getUserCostRechargeById(String orderId) {
        return userCostRechargeMapper.selectByPrimaryKey(orderId);
    }

    @Override
    public int updateOrderPaySuccessById(UserCostRecharge payOrder) {
        if(payOrder == null || payOrder.getRechargeId() == null) return 0;
        return userCostRechargeMapper.updateByConditionSelective(payOrder, Condition.builder(UserCostRecharge.class)
                .where(Sqls.custom().andEqualTo("rechargeId", payOrder.getRechargeId())
                        .andEqualTo("zt", "2")).build());
    }
}
