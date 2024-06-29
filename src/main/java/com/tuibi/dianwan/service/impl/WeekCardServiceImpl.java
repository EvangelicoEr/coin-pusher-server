package com.tuibi.dianwan.service.impl;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.tuibi.dianwan.entity.UtilNoviceWelfare;
import com.tuibi.dianwan.enums.RedDotTypeEnum;
import com.tuibi.dianwan.enums.RewardSourceTypeEnum;
import com.tuibi.dianwan.mapper.UtilNoviceWelfareMapper;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.UserInfoService;
import com.tuibi.dianwan.service.WeekCardService;
import com.tuibi.dianwan.vo.CurrencyBaseResp;
import com.tuibi.dianwan.vo.WeekCardDataResp;
import com.tuibi.common.base.error.BizException;
import com.tuibi.common.base.model.ResultCode;
import com.tuibi.common.framework.config.RedisConst;
import com.tuibi.common.framework.util.cache.CacheUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
@Slf4j
public class WeekCardServiceImpl implements WeekCardService {

    @Autowired
    private UtilNoviceWelfareMapper utilNoviceWelfareMapper;
    @Autowired
    private WeekCardService weekCardService;
    @Autowired
    private UserInfoService userInfoService;

    @Override
    @Cacheable(value = "FOREVER", key = "'getAllWeekCard'")
    public List<UtilNoviceWelfare> getAllWeekCard() {
        return utilNoviceWelfareMapper.selectByCondition(Condition.builder(UtilNoviceWelfare.class)
                .where(Sqls.custom().andEqualTo("zt", "2")).orderByAsc("welfareSort").build());
    }

    @Override
    @CacheEvict(value = "FOREVER", key = "'getAllWeekCard'")
    public void clearAllWeekCardCache() {

    }

    @Override
    public UtilNoviceWelfare getWeekCard(Integer id) {
        return weekCardService.getAllWeekCard().stream().filter(weekCard -> weekCard.getNoviceWelfareId().equals(id))
                .findFirst().orElse(null);
    }

    @Override
    public List<WeekCardDataResp> getUserWeekCardData(DianwanUserLoginInfo DianwanUserLoginInfo) {
        List<UtilNoviceWelfare> allWeekCard = weekCardService.getAllWeekCard();
        if(allWeekCard.isEmpty()) return Collections.emptyList();
        return allWeekCard.stream().map(weekCard -> {
            WeekCardDataResp resp = new WeekCardDataResp();
            resp.setId(weekCard.getNoviceWelfareId());
            resp.setName(weekCard.getWelfareName());
            resp.setIosId(weekCard.getListIosId());
            resp.setPayPrice(weekCard.getWelfareMoney());
            resp.setRewardType(weekCard.getWelfareType());
            resp.setRewardNum(weekCard.getWelfareNum());
            byte state = 0;
            if(weekCard.getWelfareMoney() > 0) {
                
                if(CacheUtil.getClient().exists(RedisConst.USER_WEEKCARD_PAY.getKey(weekCard.getNoviceWelfareId(), DianwanUserLoginInfo.getUserCode())))
                    state = 1;
            } else {
                state = 1;
            }
            if(state == 1 &&
                    CacheUtil.getClient().hexists(RedisConst.USER_WEEKCARD_RECEVER.getKey(weekCard.getNoviceWelfareId()), DianwanUserLoginInfo.getUserCode())) {
                
                state = 2;
            }
            resp.setState(state);
            return resp;
        }).collect(Collectors.toList());
    }

    @Override
    public CurrencyBaseResp receverWeekCardReward(Integer id) {
        List<UtilNoviceWelfare> allWeekCard = weekCardService.getAllWeekCard();
        UtilNoviceWelfare findWeekCard = allWeekCard.stream().filter(weekcard -> weekcard.getNoviceWelfareId().equals(id)).findFirst().orElseThrow(() -> new BizException(ResultCode.FAIL, "卡不存在!"));
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        if(findWeekCard.getWelfareMoney() > 0 && !CacheUtil.getClient().exists(RedisConst.USER_WEEKCARD_PAY.getKey(findWeekCard.getNoviceWelfareId(), DianwanUserLoginInfo.getUserCode()))) {
            
            throw new BizException(ResultCode.FAIL, "尚未购买该卡,无法领取!");
        }
        LocalDateTime today = LocalDateTimeUtil.now();
        LocalDateTime tomorrow = LocalDateTime.of(today.plusDays(1).toLocalDate(), LocalTime.MIN);
        long expireTime = Duration.between(today, tomorrow).toMillis() / 1000L;
        
        if(!CacheUtil.notReentrantHKeyScript(RedisConst.USER_WEEKCARD_RECEVER.getKey(findWeekCard.getNoviceWelfareId()),
                DianwanUserLoginInfo.getUserCode(), "1", expireTime)) {
            throw new BizException(ResultCode.FAIL, "今日已领取奖励,请勿重复领取!");
        }
        CurrencyBaseResp resp = new CurrencyBaseResp();
        String desc;
        if(findWeekCard.getWelfareType() == 1) {
            desc = "领取" + findWeekCard.getWelfareName() + "奖励: " + findWeekCard.getWelfareNum() +  "积分";
            resp.setIntegral(findWeekCard.getWelfareNum());
        } else {
            desc = "领取" + findWeekCard.getWelfareName() + "奖励: " + findWeekCard.getWelfareNum() +  "金币";
            resp.setMoney(findWeekCard.getWelfareNum());
        }
        
        userInfoService.addMonetaryRewards(DianwanUserLoginInfo.getUserCode(), findWeekCard.getWelfareType(),
                desc,
                findWeekCard.getWelfareNum(), findWeekCard.getNoviceWelfareId().toString(), RewardSourceTypeEnum.WEEKCARD);
        RedDotTypeEnum.RECHARGE.operateRedDotAndNotify(DianwanUserLoginInfo.getUserCode(), true);
        return resp;
    }

}
