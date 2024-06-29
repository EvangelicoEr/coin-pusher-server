package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.UtilDailyGifts;
import com.tuibi.dianwan.global.ConstantGlobal;
import com.tuibi.dianwan.mapper.UtilDailyGiftsMapper;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.UtilDailyGiftService;
import com.tuibi.dianwan.vo.ContinuousRushInfoResp;
import com.tuibi.common.framework.config.RedisConst;
import com.tuibi.common.framework.util.cache.CacheUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
@Slf4j
public class UtilDailyGiftServiceImpl implements UtilDailyGiftService {

    @Autowired
    private UtilDailyGiftsMapper utilDailyGiftsMapper;
    @Autowired
    private UtilDailyGiftService utilDailyGiftService;

    @Override
    @Cacheable(value = "FOREVER", key = "'getAllDailyGift'")
    public List<UtilDailyGifts> getAllDailyGift() {
        return utilDailyGiftsMapper.selectAll().stream()
                .sorted(Comparator.comparingInt(UtilDailyGifts::getGiftsDay)).collect(Collectors.toList());
    }

    @Override
    @CacheEvict(value = "FOREVER", key = "'getAllDailyGift'")
    public void clearAllDailyGiftCache() {

    }

    @Override
    public UtilDailyGifts getDailyGift(Integer id) {
        return utilDailyGiftService.getAllDailyGift().stream()
                .filter(utilDailyGifts -> utilDailyGifts.getDailyGiftsId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public List<ContinuousRushInfoResp> getUserContinuousRushInfoResp() {
        List<UtilDailyGifts> allDailyGift = utilDailyGiftService.getAllDailyGift();
        if(allDailyGift.isEmpty()) {
            return Collections.emptyList();
        }
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        String key = RedisConst.USER_RECHARGE_DAILYGIFT.getKey(DianwanUserLoginInfo.getUserCode());
        Long redisVal = CacheUtil.getClient().getNoIncr(key);
        long buyDayNum = Math.min(Optional.ofNullable(redisVal).orElse(0L), allDailyGift.size() -1);
        List<ContinuousRushInfoResp> respList = new ArrayList<>();
        for(int i=0; i<allDailyGift.size(); i++) {
            UtilDailyGifts utilDailyGifts = allDailyGift.get(i);
            ContinuousRushInfoResp resp = new ContinuousRushInfoResp();
            resp.setId(utilDailyGifts.getDailyGiftsId());
            resp.setIosId(utilDailyGifts.getListIosId());
            resp.setPrice(utilDailyGifts.getGiftsMoney());
            resp.setRewardMoney(utilDailyGifts.getGiftsNum());
            if(i == buyDayNum) {
                int state = 2;
                if(redisVal != null) {
                    Long ttl = CacheUtil.getClient().ttl(key);
                    if (ttl != null && ttl > ConstantGlobal.ONEDAY_SECONDS) {
                        state = 4;
                    }
                }
                resp.setState(state);
            } else if(i < buyDayNum) {
                resp.setState(1);
            } else {
                resp.setState(3);
            }
            respList.add(resp);
        }
        return respList;
    }
}
