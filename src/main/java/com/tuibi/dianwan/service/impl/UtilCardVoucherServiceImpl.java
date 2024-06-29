package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.UtilCardVoucher;
import com.tuibi.dianwan.entity.UtilRechargeList;
import com.tuibi.dianwan.mapper.UtilCardVoucherMapper;
import com.tuibi.dianwan.service.UtilCardVoucherService;
import com.tuibi.dianwan.service.UtilRechargeListService;
import com.tuibi.dianwan.vo.CouponInfoResp;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
public class UtilCardVoucherServiceImpl implements UtilCardVoucherService {

    @Autowired
    private UtilCardVoucherMapper utilCardVoucherMapper;
    @Autowired
    private UtilCardVoucherService utilCardVoucherService;
    @Autowired
    private UtilRechargeListService utilRechargeListService;

    @Override
    @Cacheable(value = "MONTH", key = "'getCardVoucherByType-' + #type")
    public List<UtilCardVoucher> getCardVoucherByType(Integer type) {
        return utilCardVoucherMapper.selectByCondition(Condition.builder(UtilCardVoucher.class).where(
                Sqls.custom().andEqualTo("voucherType", type)
                        .andEqualTo("zt", "2")
        ).build());
    }

    @Override
    @CacheEvict(value = "MONTH", key = "'getCardVoucherByType-' + #type")
    public void clearCardVoucherByType(Integer type) {

    }

    @Override
    public UtilCardVoucher getCardVoucher(Integer id) {
        return utilCardVoucherMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<CouponInfoResp> getCouponInfoList(Integer type, Integer platform) {
        List<UtilRechargeList> rechargeList = utilRechargeListService.getRechargeList(platform);
        List<UtilCardVoucher> cardVoucherList = utilCardVoucherService.getCardVoucherByType(type);
        List<CouponInfoResp> respList = Lists.newArrayListWithCapacity(cardVoucherList.size());
        for(int i=0; i<cardVoucherList.size(); i++) {
            UtilCardVoucher utilCardVoucher = cardVoucherList.get(i);
            Optional<UtilRechargeList> findRecharge = rechargeList.stream().filter(recharge -> utilCardVoucher.getVoucherId().equals(recharge.getVoucherId())).findFirst();
            if(findRecharge.isPresent()) {
                CouponInfoResp resp = new CouponInfoResp();
                resp.setCouponName(utilCardVoucher.getVoucherName());
                resp.setCouponId(findRecharge.get().getListId());
                resp.setIosId(findRecharge.get().getListIosId());
                resp.setCouponExplain(utilCardVoucher.getVoucherExplain());
                resp.setCouponType(utilCardVoucher.getVoucherType());
                resp.setCouponValue(utilCardVoucher.getVoucherNum());
                resp.setEffectiveMinutes(utilCardVoucher.getVoucherTime());
                resp.setPrice(findRecharge.get().getListMoney());
                respList.add(resp);
            }
        }
        return respList;
    }
}
