package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.UtilGiftCode;
import com.tuibi.dianwan.enums.AccessMarkEnum;
import com.tuibi.dianwan.enums.RewardSourceTypeEnum;
import com.tuibi.dianwan.global.ConstantGlobal;
import com.tuibi.dianwan.mapper.UtilGiftCodeMapper;
import com.tuibi.dianwan.pojo.UserAccessMark;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.AccessService;
import com.tuibi.dianwan.service.UserInfoService;
import com.tuibi.dianwan.service.UtilGiftCodeService;
import com.tuibi.dianwan.vo.CurrencyBaseResp;
import com.tuibi.common.base.error.BizException;
import com.tuibi.common.base.model.ResultCode;
import com.tuibi.common.framework.config.RedisConst;
import com.tuibi.common.framework.util.cache.CacheUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
@Slf4j
public class UtilGiftCodeServiceImpl implements UtilGiftCodeService {

    @Autowired
    private UtilGiftCodeMapper utilGiftCodeMapper;
    @Autowired
    private UtilGiftCodeService utilGiftCodeService;
    @Autowired
    private AccessService accessService;
    @Autowired
    private UserInfoService userInfoService;

    @Override
    public CurrencyBaseResp redeemCode(String code) {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        UserAccessMark accessMark = accessService.getFiveSecAccessMark(AccessMarkEnum.REDEEM_CODE, DianwanUserLoginInfo.getUserCode());
        if(!accessMark.canAccess()) {
            throw new BizException(ResultCode.FAIL, "请求频繁,请稍后再试!");
        }
        UtilGiftCode giftCode = utilGiftCodeService.getGiftCode(code);
        if(!giftCode.open() || (giftCode.getChannelId() != -1
                && !DianwanUserLoginInfo.getChannelId().equals(giftCode.getChannelId()))) {
            throw new BizException(ResultCode.FAIL, "兑换码不存在!");
        }
        String key = RedisConst.USER_GIFTCODE.getKey(giftCode.getCodeId());
        if(!CacheUtil.notReentrantHKeyScript(key, DianwanUserLoginInfo.getUserCode(),
                String.valueOf(System.currentTimeMillis()), RedisConst.USER_GIFTCODE.getExpireSecs())) {
            throw new BizException(ResultCode.FAIL, "您已兑换过,敬请关注更多福利哦!");
        }
        if(giftCode.getRewardGoldNum() > 0)
            userInfoService.addMonetaryRewards(DianwanUserLoginInfo.getUserCode(), 2, "兑换码兑换获得奖励:" + giftCode.getRewardGoldNum() + "金币",
                    giftCode.getRewardGoldNum(), giftCode.getCodeId().toString(), RewardSourceTypeEnum.GIFT_CODE);
        if(giftCode.getRewardDiamondsNum() > 0)
            userInfoService.addMonetaryRewards(DianwanUserLoginInfo.getUserCode(), 1, "兑换码兑换获得奖励:" + giftCode.getRewardGoldNum() + "积分",
                    giftCode.getRewardDiamondsNum(), giftCode.getCodeId().toString(), RewardSourceTypeEnum.GIFT_CODE);
        return CurrencyBaseResp.builder().money(giftCode.getRewardGoldNum())
                .integral(giftCode.getRewardDiamondsNum()).build();
    }

    @Override
    @Cacheable(value = "VERYLONG", key = "'getGiftCode-' + #code")
    public UtilGiftCode getGiftCode(String code) {
        return Optional.ofNullable(utilGiftCodeMapper.selectOne(UtilGiftCode.builder().codeNum(code).build()))
                .orElse(ConstantGlobal.CLOSE_GIFTCODE);
    }

    @Override
    @CacheEvict(value = "VERYLONG", key = "'getGiftCode-' + #code")
    public void clearGiftCodeCache(String code) {

    }
}
