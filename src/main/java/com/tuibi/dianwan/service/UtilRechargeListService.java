package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UtilRechargeList;
import com.tuibi.dianwan.vo.RechargeShopResp;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UtilRechargeListService {

    List<UtilRechargeList> getRechargeList(Integer channelId);

    void clearRechargeListCache(Integer channelId);

    UtilRechargeList getRecharge(Integer id);

    void clearRechargeCache(Integer id);

    /**
     * 获取充值商品
     * @param channelId 渠道id 1安卓 2苹果 3代理
     * @return
     */
    List<RechargeShopResp> getRechargeShopList(Integer channelId);
}
