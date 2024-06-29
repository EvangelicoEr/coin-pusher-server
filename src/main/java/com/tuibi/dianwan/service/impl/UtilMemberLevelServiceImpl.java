package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.UtilMemberLevel;
import com.tuibi.dianwan.mapper.UtilMemberLevelMapper;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.UserInfoService;
import com.tuibi.dianwan.service.UtilMemberLevelService;
import com.tuibi.dianwan.vo.MemberCenterInfoResp;
import com.tuibi.dianwan.vo.UserSimpleInfoResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
public class UtilMemberLevelServiceImpl implements UtilMemberLevelService {

    @Autowired
    private UtilMemberLevelMapper utilMemberLevelMapper;
    @Autowired
    private UtilMemberLevelService utilMemberLevelService;
    @Autowired
    private UserInfoService userInfoService;

    @Override
    @Cacheable(value = "MONTH", key = "'getAllMemberLevel'")
    public List<UtilMemberLevel> getAllMemberLevel() {
        return utilMemberLevelMapper.selectByCondition(Condition.builder(UtilMemberLevel.class).where(
                Sqls.custom().andEqualTo("zt", "2")
        ).orderByAsc("memberLevelNum").build());
    }

    @Override
    @CacheEvict(value = "MONTH", key = "'getAllMemberLevel'")
    public void clearMemberLevelCache() {

    }

    @Override
    public UtilMemberLevel getMemberLevelById(Integer id) {
        return utilMemberLevelService.getAllMemberLevel().stream()
                .filter(utilMemberLevel -> utilMemberLevel.getMemberLevelId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public MemberCenterInfoResp getUserMemberCenterInfo() {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        UserSimpleInfoResp userSimpleInfo = userInfoService.getUserSimpleInfo(DianwanUserLoginInfo.getUserCode());
        List<UtilMemberLevel> allMemberLevel = utilMemberLevelService.getAllMemberLevel();
        UtilMemberLevel curLevel = null, nextLevel = null;
        for(int i=0; i<allMemberLevel.size(); i++) {
            UtilMemberLevel utilMemberLevel = allMemberLevel.get(i);
            if(userSimpleInfo.getVipLevel().equals(utilMemberLevel.getMemberLevelNum())) {
                curLevel = utilMemberLevel;
                if(i != allMemberLevel.size() - 1) {
                    nextLevel = allMemberLevel.get(i + 1);
                } else {
                    nextLevel = curLevel;
                }
                break;
            }
        }
        MemberCenterInfoResp resp = new MemberCenterInfoResp();
        resp.setVipLevel(userSimpleInfo.getVipLevel());
        resp.setVipExperience(userSimpleInfo.getVipExperience());
        resp.setHeadImg(userSimpleInfo.getHeadImg());
        resp.setUserCode(userSimpleInfo.getUserCode());
        resp.setUserId(userSimpleInfo.getUserId());
        resp.setNickname(userSimpleInfo.getNickname());
        resp.setLastExperience(nextLevel.getMemberLevelMoney() - userSimpleInfo.getVipExperience().intValue());
        int schedule;
        BigDecimal curLevelExp = BigDecimal.valueOf(userSimpleInfo.getVipExperience())
                .subtract(BigDecimal.valueOf(curLevel.getMemberLevelMoney()));
        if(curLevelExp.compareTo(BigDecimal.ZERO) == 0) {
            schedule = 0;
        } else if(curLevel.getMemberLevelMoney().equals(nextLevel.getMemberLevelMoney())) {
            schedule = 100;
        } else {
            schedule = curLevelExp.divide(BigDecimal.valueOf(nextLevel.getMemberLevelMoney() - curLevel.getMemberLevelMoney()),
                    2, BigDecimal.ROUND_DOWN).multiply(BigDecimal.valueOf(100)).intValue();
        }
        resp.setSchedule(schedule);
        resp.setNextVipLevel(nextLevel.getMemberLevelNum());
        resp.setNextVipLevelName(nextLevel.getMemberLevelName());
        resp.setNextVipLevelIcon(nextLevel.getMemberLevelLogo());
        resp.setNextVipIntegralExchangeRate(nextLevel.getRechargeGiftNum());
        resp.setRewardMoney(nextLevel.getMemberRewardNum());
        return resp;
    }
}
