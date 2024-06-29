package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.UtilRechargeList;
import com.tuibi.dianwan.mapper.UtilRechargeListMapper;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.UtilRechargeListService;
import com.tuibi.dianwan.vo.RechargeShopResp;
import com.tuibi.common.framework.config.RedisConst;
import com.tuibi.common.framework.util.cache.CacheUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
@Slf4j
public class UtilRechargeListServiceImpl implements UtilRechargeListService {

    @Autowired
    private UtilRechargeListMapper utilRechargeListMapper;
    @Autowired
    private UtilRechargeListService utilRechargeListService;

    @Override
    @Cacheable(value = "FOREVER", key = "'getRechargeList-' + #channelId")
    public List<UtilRechargeList> getRechargeList(Integer channelId) {
        return utilRechargeListMapper.selectByCondition(Condition.builder(UtilRechargeList.class).where(
                Sqls.custom().andEqualTo("listChannel", channelId)
        ).orderByAsc("listSort").build());
    }

    @Override
    @CacheEvict(value = "FOREVER", key = "'getRechargeList-' + #channelId")
    public void clearRechargeListCache(Integer channelId) {

    }

    @Override
    @Cacheable(value = "FOREVER", key = "'getRecharge-' + #id")
    public UtilRechargeList getRecharge(Integer id) {
        return utilRechargeListMapper.selectByPrimaryKey(id);
    }

    @Override
    @CacheEvict(value = "FOREVER", key = "'getRecharge-' + #id")
    public void clearRechargeCache(Integer id) {
        UtilRechargeList recharge = utilRechargeListService.getRecharge(id);
        if(recharge == null) {
            recharge = getRecharge(id);
        }
        if(recharge != null)
            utilRechargeListService.clearRechargeListCache(recharge.getListChannel());
    }

    @Override
    public List<RechargeShopResp> getRechargeShopList(Integer channelId) {
        List<UtilRechargeList> rechargeList = utilRechargeListService.getRechargeList(channelId);
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        List<RechargeShopResp> rechargeShopRespList = rechargeList.stream().filter(utilRechargeList -> utilRechargeList.getVoucherId() <= 0)
                .map(recharge -> {
            RechargeShopResp rechargeShopResp = new RechargeShopResp();
            rechargeShopResp.setName(recharge.getListName());
            rechargeShopResp.setId(recharge.getListId());
            rechargeShopResp.setIosId(recharge.getListIosId());
            rechargeShopResp.setPrice(recharge.getListMoney());
            rechargeShopResp.setMoney(recharge.getListGetNum());
            rechargeShopResp.setExtraMoney(recharge.getListDataNum());
            rechargeShopResp.setState(recharge.getIsMended());
            rechargeShopResp.setIcon(recharge.getListImg());
            return rechargeShopResp;
        }).collect(Collectors.toList());
        if(!rechargeShopRespList.isEmpty()) {
            String[] fields = new String[rechargeShopRespList.size()];
            for(int i=0; i<fields.length; i++) {
                fields[i] = rechargeShopRespList.get(i).getId().toString();
            }
            String buyKey = RedisConst.USER_RECHARGE_SHOP.getKey(DianwanUserLoginInfo.getUserCode());
            Map<String, Object> buyShopMap = CacheUtil.getClient().hmgetQuietly(buyKey, fields);
            if(!buyShopMap.isEmpty()) {
                rechargeShopRespList.forEach(rechargeShopResp -> {
                    if(buyShopMap.get(rechargeShopResp.getId().toString()) == null) {
                        rechargeShopResp.setFirstRecharge(true);
                    }
                });
            }
        }
        return rechargeShopRespList;
    }
}
