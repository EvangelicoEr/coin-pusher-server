package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UtilCardVoucher;
import com.tuibi.dianwan.vo.CouponInfoResp;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UtilCardVoucherService {
    /**
     * 获取券信息
     * @param type  卡券类型  1充值加成券  2包机券
     * @return
     */
    List<UtilCardVoucher> getCardVoucherByType(Integer type);

    /**
     * 清除该类型券缓存
     * @param type
     */
    void clearCardVoucherByType(Integer type);

    UtilCardVoucher getCardVoucher(Integer id);
    /**
     * 获取券信息
     * @param type  卡券类型  1充值加成券  2包机券
     * @param platform  1安卓 2苹果
     * @return
     */
    List<CouponInfoResp> getCouponInfoList(Integer type, Integer platform);
}
