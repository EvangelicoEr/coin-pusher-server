package com.tuibi.dianwan.service.impl;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.tuibi.dianwan.entity.UserInfo;
import com.tuibi.dianwan.entity.UtilExperienceLevel;
import com.tuibi.dianwan.entity.UtilInitData;
import com.tuibi.dianwan.entity.UtilMemberLevel;
import com.tuibi.dianwan.enums.RewardSourceTypeEnum;
import com.tuibi.dianwan.listener.event.UserRegisterEvent;
import com.tuibi.dianwan.mapper.UserInfoMapper;
import com.tuibi.dianwan.service.*;
import com.tuibi.dianwan.vo.UserSimpleInfoResp;
import com.vdurmont.emoji.EmojiParser;
import com.tuibi.common.base.error.BizException;
import com.tuibi.common.base.model.ResultCode;
import com.tuibi.common.util.SpringContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

@Service
@Slf4j
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UtilInitDataService utilInitDataService;
    @Autowired
    private UtilMemberLevelService utilMemberLevelService;
    @Autowired
    private UtilExperienceLevelService utilExperienceLevelService;

    @Override
    public UserInfo wxLogin(HttpServletRequest req, Map<String, String> parameter) {
        Sqls custom = Sqls.custom();
        if (StringUtils.isNotBlank(parameter.get("user_union_id"))) {
            custom.andEqualTo("userUnionId", parameter.get("user_union_id"));
        } else if (StringUtils.isNotBlank(parameter.get("user_openid"))) {
            custom.andEqualTo("userOpenid", parameter.get("user_openid"));
        } else {
            throw new BizException(ResultCode.FAIL, "登录失败,缺少必要参数!");
        }

        int channelId = Optional.ofNullable(parameter.get("channel_id")).map(Integer::parseInt).orElse(0);
        List<UserInfo> userInfos = userInfoMapper.selectByCondition(Condition.builder(UserInfo.class).where(
                custom
        ).build());
        UserInfo UserLoginInfo;
        if(userInfos.isEmpty()) {
            String userImg = null;
            UtilInitData defaultImgConfig = utilInitDataService.getInitDataById(102);
            if(defaultImgConfig != null) {
                userImg = defaultImgConfig.getInitKey();
            }
            UtilMemberLevel minMemberLevel = utilMemberLevelService.getAllMemberLevel().get(0);
            UtilExperienceLevel minExperienceLevel = utilExperienceLevelService.getAllUtilExperienceLevel().get(0);
            UserLoginInfo = UserInfo.builder()
                    .userOpenid(Optional.ofNullable(parameter.get("user_openid")).orElse(""))
                    .userUnionId(Optional.ofNullable(parameter.get("user_union_id")).orElse(""))
                    .userNickname(StringUtils.isNotBlank(parameter.get("user_nickname"))
                            ? EmojiParser.removeAllEmojis(parameter.get("user_nickname")) : ("电玩小子:"+ ThreadLocalRandom.current().nextInt(1000, 10000000)))
                    .userImg(StringUtils.isNotBlank(parameter.get("user_img")) ? parameter.get("user_img") : userImg)
                    .userAppleid("")
                    .userUpId("0")
                    .userPhone("")
                    .userSex("0")
                    .channelId(channelId)
                    .userCostGet(0)
                    .userCostLose(0)
                    .userIntegralGet(0)
                    .userIntegralLose(0)
                    .isRecharge(0)
                    .userAgent(0)
                    .isRealName(0)
                    .userRealName("")
                    .userRealIdcard("")
                    .rechargeDay(0)
                    .zt(2)
                    .memberLevelId(minMemberLevel.getMemberLevelId())
                    .memberCumulativeValue(0d)
                    .experienceLevelId(minExperienceLevel.getExperienceLevelId())
                    .experienceCumulativeValue(0)
                    .gxsj(LocalDateTimeUtil.formatNormal(LocalDateTime.now()))
                    .lrsj(LocalDateTimeUtil.formatNormal(LocalDateTime.now()))
                    .loginDay(1)
                    .build();
            UserLoginInfo.setRegisterUserImg(UserLoginInfo.getUserImg());
            UserLoginInfo.setRegisterUserNickname(UserLoginInfo.getUserNickname());
            userInfoService.insertUserInfo(UserLoginInfo);
            int luckyNum = ThreadLocalRandom.current().nextInt(100, 1000);
            UserLoginInfo.setUserCode(UserLoginInfo.getUserId().toString() + luckyNum);
            
            userInfoService.updateUserInfo(UserInfo.builder()
                            .userCode(UserLoginInfo.getUserCode()).build(),
                    Sqls.custom().andEqualTo("userId", UserLoginInfo.getUserId()), null);
            
            UtilInitData registerConfig = utilInitDataService.getInitDataById(300);
            int registerMoney = Integer.parseInt(registerConfig.getInitKey());
            SpringContextHolder.getBean(UserInfoService.class).addMonetaryRewards(UserLoginInfo.getUserCode(), 2, "注册赠送:" + registerConfig.getInitKey() + "金币",
                    registerMoney, "0", RewardSourceTypeEnum.REGISTER);
            UserLoginInfo.setUserCostGet(registerMoney);
            
            String inviteId = parameter.get("inviteId");
            if(StringUtils.isNotBlank(inviteId)) {
                SpringContextHolder.publishEvent(new UserRegisterEvent(UserInfo.builder()
                        .userCode(UserLoginInfo.getUserCode())
                        .channelId(UserLoginInfo.getChannelId())
                        .userUpId(inviteId)
                        .userNickname(UserLoginInfo.getUserNickname())
                        .userId(UserLoginInfo.getUserId()).build()));
            }
            
        } else {
            UserLoginInfo = userInfos.get(0);
            if(UserLoginInfo.isDisable()) {
                throw new BizException(ResultCode.FAIL, "您的账户已被冻结，如需使用请添加客服微信:dwcs987");
            } else if(UserLoginInfo.isLogout()) {
                throw new BizException(ResultCode.FAIL, "您的账号已被注销!");
            }
        }
        return UserLoginInfo;
    }

    @Override
    public UserInfo appleLogin(HttpServletRequest req, Map<String, String> parameter) {
        String userAppleid = parameter.get("user_appleid");
        if (StringUtils.isBlank(userAppleid)) {
            throw new BizException(ResultCode.FAIL, "appleid不能为空!");
        }
        List<UserInfo> userInfos = userInfoMapper.selectByCondition(Condition.builder(UserInfo.class).where(
            Sqls.custom().andEqualTo("userAppleid", userAppleid)
        ).build());
        UserInfo UserLoginInfo;
        if(userInfos.isEmpty()) {
            String userImg = null;
            UtilInitData defaultImgConfig = utilInitDataService.getInitDataById(7102);
            if(defaultImgConfig != null) {
                userImg = defaultImgConfig.getInitKey();
            }
            UtilMemberLevel minMemberLevel = utilMemberLevelService.getAllMemberLevel().get(0);
            UtilExperienceLevel minExperienceLevel = utilExperienceLevelService.getAllUtilExperienceLevel().get(0);
            int channelId = Optional.ofNullable(parameter.get("channel_id")).map(Integer::parseInt).orElse(0);
            UserLoginInfo = UserInfo.builder()
                    .userOpenid("")
                    .userUnionId("")
                    .userNickname(StringUtils.isNotBlank(parameter.get("user_nickname"))
                            ? EmojiParser.removeAllEmojis(parameter.get("user_nickname")) : ("电玩小子:"+ ThreadLocalRandom.current().nextInt(1000, 10000000)))
                    .userImg(StringUtils.isNotBlank(parameter.get("user_img")) ? parameter.get("user_img") : userImg)
                    .userAppleid(userAppleid)
                    .userUpId("0")
                    .userPhone("")
                    .userSex("0")
                    .channelId(channelId)
                    .userCostGet(0)
                    .userCostLose(0)
                    .userIntegralGet(0)
                    .userIntegralLose(0)
                    .isRecharge(0)
                    .userAgent(0)
                    .isRealName(0)
                    .userRealName("")
                    .userRealIdcard("")
                    .rechargeDay(0)
                    .zt(2)
                    .memberLevelId(minMemberLevel.getMemberLevelId())
                    .memberCumulativeValue(0d)
                    .experienceLevelId(minExperienceLevel.getExperienceLevelId())
                    .experienceCumulativeValue(0)
                    .gxsj(LocalDateTimeUtil.formatNormal(LocalDateTime.now()))
                    .lrsj(LocalDateTimeUtil.formatNormal(LocalDateTime.now()))
                    .loginDay(1)
                    .build();
            UserLoginInfo.setRegisterUserImg(UserLoginInfo.getUserImg());
            UserLoginInfo.setRegisterUserNickname(UserLoginInfo.getUserNickname());
            userInfoService.insertUserInfo(UserLoginInfo);
            int luckyNum = ThreadLocalRandom.current().nextInt(100, 1000);
            UserLoginInfo.setUserCode(UserLoginInfo.getUserId().toString() + luckyNum);

            userInfoService.updateUserInfo(UserInfo.builder()
                            .userCode(UserLoginInfo.getUserCode()).build(),
                    Sqls.custom().andEqualTo("userId", UserLoginInfo.getUserId()), null);
            
            UtilInitData registerConfig = utilInitDataService.getInitDataById(300);
            int registerMoney = Integer.parseInt(registerConfig.getInitKey());
            SpringContextHolder.getBean(UserInfoService.class).addMonetaryRewards(UserLoginInfo.getUserCode(), 2, "注册赠送:" + registerConfig.getInitKey() + "金币",
                    registerMoney, "0", RewardSourceTypeEnum.REGISTER);
            UserLoginInfo.setUserCostGet(registerMoney);
            
            String inviteId = parameter.get("inviteId");
            if(StringUtils.isNotBlank(inviteId)) {
                SpringContextHolder.publishEvent(new UserRegisterEvent(UserInfo.builder()
                        .userCode(UserLoginInfo.getUserCode())
                        .channelId(UserLoginInfo.getChannelId())
                        .userUpId(inviteId)
                        .userNickname(UserLoginInfo.getUserNickname())
                        .userId(UserLoginInfo.getUserId()).build()));
            }
            
        } else {
            UserLoginInfo = userInfos.get(0);
            if(UserLoginInfo.isDisable()) {
                throw new BizException(ResultCode.FAIL, "您的账户已被冻结，如需使用请添加客服微信:dwcs987");
            } else if(UserLoginInfo.isLogout()) {
                throw new BizException(ResultCode.FAIL, "您的账号已被注销!");
            }
        }
        return UserLoginInfo;
    }
}
