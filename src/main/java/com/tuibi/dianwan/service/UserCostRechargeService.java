package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UserCostRecharge;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UserCostRechargeService {

    List<UserCostRecharge> getUserRecharge(Sqls sqls);

    /**
     * 插入未支付的订单
     * @param unpaidOrder
     * @return
     */
    int insertUnpaidUserCostRecharge(UserCostRecharge unpaidOrder);

    UserCostRecharge getUserCostRechargeById(String orderId);

    int updateOrderPaySuccessById(UserCostRecharge payOrder);
}
