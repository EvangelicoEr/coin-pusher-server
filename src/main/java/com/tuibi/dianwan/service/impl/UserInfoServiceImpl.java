package com.tuibi.dianwan.service.impl;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.tuibi.dianwan.config.SysParamDictConfig;
import com.tuibi.dianwan.entity.*;
import com.tuibi.dianwan.enums.AccessMarkEnum;
import com.tuibi.dianwan.enums.PlayerRespTypeEnum;
import com.tuibi.dianwan.enums.RedDotTypeEnum;
import com.tuibi.dianwan.enums.RewardSourceTypeEnum;
import com.tuibi.dianwan.global.ConstantGlobal;
import com.tuibi.dianwan.listener.event.ReloadUserEvent;
import com.tuibi.dianwan.listener.event.UserCurrencyChangeEvent;
import com.tuibi.dianwan.listener.event.UserInfoChangeEvent;
import com.tuibi.dianwan.mapper.UserInfoMapper;
import com.tuibi.dianwan.nio.PlayerSessionManager;
import com.tuibi.dianwan.pojo.UserAccessMark;
import com.tuibi.dianwan.pojo.UserInfoChangeReq;
import com.tuibi.dianwan.pojo.UserVerifiedReq;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.*;
import com.tuibi.dianwan.sms.enums.SmsChannelEnum;
import com.tuibi.dianwan.sms.service.SmsService;
import com.tuibi.dianwan.util.IdentityCodeUtil;
import com.tuibi.dianwan.vo.CurrencyBaseResp;
import com.tuibi.dianwan.vo.IntegralExchangeInfoResp;
import com.tuibi.dianwan.vo.UserSimpleInfoResp;
import com.tuibi.proto.Notify;
import com.google.protobuf.ByteString;
import com.robert.vesta.service.intf.IdService;
import com.tuibi.common.base.error.BizException;
import com.tuibi.common.base.model.ResultCode;
import com.tuibi.common.framework.config.RedisConst;
import com.tuibi.common.framework.util.cache.CacheUtil;
import com.tuibi.common.juc.thread.ThreadManager;
import com.tuibi.common.juc.thread.runnable.BaseRunnable;
import com.tuibi.common.util.SpringContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
@Slf4j
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UtilMemberLevelService utilMemberLevelService;
    @Autowired
    private UserCostLogService userCostLogService;
    @Autowired
    private IdService idService;
    @Autowired
    private AccessService accessService;
    @Autowired
    private SmsService smsService;
    @Autowired
    private UtilInitDataService utilInitDataService;
    @Autowired
    private UserMailService userMailService;
    @Autowired
    private PromoterService promoterService;
    private static final ByteString InsufficientMoney = Notify.InsufficientMoneyResp.newBuilder().setType(2).build().toByteString();
    private static final ByteString InsufficientIntegral = Notify.InsufficientMoneyResp.newBuilder().setType(1).build().toByteString();
    private static final Pattern REALNAME_MATCH = Pattern.compile("^[\\u4e00-\\u9fa5.·\\u36c3\\u4DAE]{2,}$");

    @Override
    public Map<String, UserSimpleInfoResp> getUserHeadPicInfo(Set<String> userCodes) {
        return userCodes.stream().parallel().map(userInfoService::getUserSimpleInfo)
                .collect(Collectors.toMap(UserSimpleInfoResp::getUserCode, u -> u));
    }

    @Override
    public UserSimpleInfoResp getUserSimpleInfo(String userCode) {
        UserInfo userInfo = userInfoService.getUserCacheInfo(userCode);
        if(userInfo == null) {
            return null;
        }
        UserSimpleInfoResp resp = new UserSimpleInfoResp();
        resp.setUserId(userInfo.getUserId());
        resp.setUserCode(userInfo.getUserCode());
        resp.setNickname(userInfo.getUserNickname());
        resp.setHeadImg(userInfo.getUserImg());
        resp.setVipExperience(userInfo.getMemberCumulativeValue());
        UtilMemberLevel memberLevel = utilMemberLevelService.getMemberLevelById(userInfo.getMemberLevelId());
        resp.setVipLevel(memberLevel.getMemberLevelNum());
        resp.setVipIcon(memberLevel.getMemberLevelLogo());
        return resp;
    }

    @Override
    @Cacheable(value = "WEEK", key = "'getUserCacheInfo-' + #userCode")
    public UserInfo getUserCacheInfo(String userCode) {
        List<UserInfo> userInfos = userInfoMapper.selectByCondition(Condition.builder(UserInfo.class).where(
                Sqls.custom().andEqualTo("userCode", userCode)
        ).select(ConstantGlobal.CACHE_USER_PROPERTIES).build());
        if(userInfos.isEmpty()) {
            return null;
        }
        return userInfos.get(0);
    }

    @Override
    public UserInfo getUserInfoByUnionId(String unionId) {
        if(unionId == null) return null;
        List<UserInfo> userInfos = userInfoMapper.selectByCondition(Condition.builder(UserInfo.class).where(
                Sqls.custom().andEqualTo("userUnionId", unionId)
        ).select(ConstantGlobal.CACHE_USER_PROPERTIES).build());
        if(userInfos.isEmpty()) return null;
        return userInfos.get(0);
    }

    @Override
    @CacheEvict(value = "WEEK", key = "'getUserCacheInfo-' + #userCode")
    public void clearUserCacheInfo(String userCode) {

    }

    private UserInfo getUserInfo(Sqls sqls) {
        List<UserInfo> userInfoList = userInfoMapper.selectByCondition(Condition.builder(UserInfo.class).where(
                sqls
        ).select(ConstantGlobal.PRIMARY_USER_PROPERTIES).build());
        if(userInfoList.isEmpty()) {
            return null;
        }
        return userInfoList.get(0);
    }

    @Override
    public UserInfo getUserInfo(String userCode) {
        
        return getUserInfo(Sqls.custom().andEqualTo("userCode", userCode));
    }

    @Override
    public UserInfo getUserInfo(Integer userId) {
        return getUserInfo(Sqls.custom().andEqualTo("userId", userId));
    }

    @Override
    public int addUserMoneyCost(String userCode, Integer costValue) {
        if(costValue == 0) return 1;
        return userInfoMapper.addUserMoneyCost(userCode, costValue);
    }

    @Override
    public int addUserMoneyGet(String userCode, Integer getValue) {
        if(getValue == 0) return 1;
        if(getValue < 0) throw new BizException(ResultCode.FAIL, "无法扣除金币");
        return userInfoMapper.addUserMoneyGet(userCode, getValue);
    }

    @Override
    public int addUserIntegralGet(String userCode, Integer getValue) {
        if(getValue <= 0) throw new BizException(ResultCode.FAIL, "无法扣除积分");
        return userInfoMapper.addUserIntegralGet(userCode, getValue);
    }

    @Override
    public int addUserIntegralCost(String userCode, Integer costValue) {
        if(costValue == 0) return 1;
        return userInfoMapper.addUserIntegralCost(userCode, costValue);
    }

    @Override
    public void addMonetaryRewards(String userCode, Integer rewardType, String desc, Integer rewardNum, String sourceId, RewardSourceTypeEnum rewardSourceType) {
        addMonetaryRewards(userCode, rewardType, desc, rewardNum, sourceId, rewardSourceType, rewardSourceType.isShow());
    }

    @Override
    public int updateUserExperienceLevel(String userCode, Integer levelId) {
        
        return updateUserInfo(UserInfo.builder().experienceLevelId(levelId).build(),
                Sqls.custom().andEqualTo("userCode", userCode), userCode);
    }

    @Override
    public IntegralExchangeInfoResp getIntegralExchangeInfo() {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        UserInfo userInfo = userInfoService.getUserInfo(DianwanUserLoginInfo.getUserCode());
        UtilMemberLevel memberLevel = utilMemberLevelService.getMemberLevelById(userInfo.getMemberLevelId());
        IntegralExchangeInfoResp resp = new IntegralExchangeInfoResp();
        resp.setExchangeRate(memberLevel.getRechargeGiftNum());
        resp.setIntegralNum(userInfo.getLastIntegral());
        resp.setMaxExchangeMoneyNum((int) (userInfo.getLastIntegral() / memberLevel.getRechargeGiftNum()));
        return resp;
    }

    @Override
    public CurrencyBaseResp integralExchange(Integer exchangeMoney) {
        if(exchangeMoney <= 0) throw new BizException(ResultCode.FAIL, "兑换金币数量不能小于0");
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        UserInfo userInfo = userInfoService.getUserInfo(DianwanUserLoginInfo.getUserCode());
        UtilMemberLevel memberLevel = utilMemberLevelService.getMemberLevelById(userInfo.getMemberLevelId());
        int consumerIntegral = BigDecimal.valueOf(exchangeMoney)
                .multiply(BigDecimal.valueOf(memberLevel.getRechargeGiftNum()))
                .setScale(0, BigDecimal.ROUND_UP).intValue();
        if(consumerIntegral > userInfo.getLastIntegral()) {
            throw new BizException(ResultCode.FAIL, "积分不足,兑换失败!");
        }
        addMonetaryRewards(DianwanUserLoginInfo.getUserCode(), 1, "积分兑换金币扣除:" + consumerIntegral + "积分",
                -consumerIntegral, exchangeMoney.toString(), RewardSourceTypeEnum.EXCHNAGE_MONEY);
        addMonetaryRewards(DianwanUserLoginInfo.getUserCode(), 2, "积分兑换金币获得:" + exchangeMoney + "金币",
                exchangeMoney, String.valueOf(consumerIntegral), RewardSourceTypeEnum.EXCHNAGE_MONEY);
        return CurrencyBaseResp.builder().integral(-consumerIntegral)
                .money(exchangeMoney).build();
    }

    @Override
    public void userVerified(UserVerifiedReq req) {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        if(DianwanUserLoginInfo.getUserInfo().isRealNameAuthentication()) {
            throw new BizException(ResultCode.FAIL, "已实名认证");
        }
        if (!REALNAME_MATCH.matcher(req.getRealName()).matches()) {
            throw new BizException(ResultCode.FAIL, "姓名不正确!");
        }
        if (!IdentityCodeUtil.validateIdNumber(req.getIdCard())) {
            throw new BizException(ResultCode.FAIL, "身份证号不正确!");
        }
        updateUserInfo(UserInfo.builder()
                .isRealName(1)
                .userRealName(req.getRealName())
                .userRealIdcard(req.getIdCard()).build(),
                Sqls.custom().andEqualTo("userCode", DianwanUserLoginInfo.getUserCode()), DianwanUserLoginInfo.getUserCode());
    }

    @Override
    public UserInfoChangeReq userInfoChange(UserInfoChangeReq req) {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        UserAccessMark accessMark = accessService.getFiveSecAccessMark(AccessMarkEnum.USER_INFO_CHANGE, DianwanUserLoginInfo.getUserCode());
        if(!accessMark.canAccess()) {
            throw new BizException(ResultCode.FAIL, "操作频繁,请稍后再试!");
        }
        Optional<SysParam> userChangeMaterialConfig = SysParamDictConfig.getInstance().getUserChangeMaterialConfig(DianwanUserLoginInfo.getChannelId());
        if(StringUtils.isNotBlank(req.getNickName())) {
            Long changeCnt = CacheUtil.getClient().incrQuietly(RedisConst.USER_CHANGE_MATERIAL.getKey(DianwanUserLoginInfo.getUserCode()),
                    1, SysParamDictConfig.getInstance().getUserChangeMaterialNickNameTime(userChangeMaterialConfig), TimeUnit.SECONDS);
            int maxChangeCnt = SysParamDictConfig.getInstance().getUserChangeMaterialNickNameCnt(userChangeMaterialConfig);
            if(changeCnt > maxChangeCnt) {
                throw new BizException(ResultCode.FAIL, "更新失败," + SysParamDictConfig.getInstance().getUserChangeMaterialNickNameTimeDesc(userChangeMaterialConfig)
                        + "内最多更改" + maxChangeCnt + "次!");
            }
            updateUserInfo(UserInfo.builder().userNickname(req.getNickName()).build(),
                    Sqls.custom().andEqualTo("userCode", DianwanUserLoginInfo.getUserCode()), DianwanUserLoginInfo.getUserCode());
        } else if(StringUtils.isNotBlank(req.getHeadImg())) {
            Long changeCnt = CacheUtil.getClient().incrQuietly(RedisConst.USER_CHANGE_MATERIAL_HEADIMG.getKey(DianwanUserLoginInfo.getUserCode()),
                    1, SysParamDictConfig.getInstance().getUserChangeMaterialHeadImgTime(userChangeMaterialConfig), TimeUnit.SECONDS);
            int maxChangeCnt = SysParamDictConfig.getInstance().getUserChangeMaterialHeadImgCnt(userChangeMaterialConfig);
            if(changeCnt > maxChangeCnt) {
                throw new BizException(ResultCode.FAIL, "更新失败," + SysParamDictConfig.getInstance().getUserChangeMaterialHeadImgTimeDesc(userChangeMaterialConfig)
                        + "内最多更改" + maxChangeCnt + "次!");
            }
            updateUserInfo(UserInfo.builder().userImg(req.getHeadImg()).build(),
                    Sqls.custom().andEqualTo("userCode", DianwanUserLoginInfo.getUserCode()), DianwanUserLoginInfo.getUserCode());
        } else {
            throw new BizException(ResultCode.FAIL, "修改内容不能为空");
        }
        return req;
    }

    @Override
    public int updateUserInfo(UserInfo userInfo, Sqls sql, String userCode) {
        if(userInfo == null || sql == null) return 0;
        int upLine = userInfoMapper.updateByConditionSelective(userInfo, Condition.builder(UserInfo.class).where(
                sql
        ).build());
        if(upLine > 0) {
            SpringContextHolder.publishEvent(new UserInfoChangeEvent(userInfo, userCode));
        }
        return upLine;
    }

    @Override
    public String bindPhone(String phone, String smsCode) {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        UserInfo userCacheInfo = userInfoService.getUserCacheInfo(DianwanUserLoginInfo.getUserCode());
        if(StringUtils.isNotBlank(userCacheInfo.getUserPhone())) {
            throw new BizException(ResultCode.FAIL, "已绑定手机号");
        }
        String phonebindKey = RedisConst.SMS_PHONEBIND.getKey(DianwanUserLoginInfo.getUserCode());
        String serverSmsCode = CacheUtil.get(phonebindKey);
        if(serverSmsCode == null) {
            throw new BizException(ResultCode.FAIL, "短信验证码已失效,请重新发送!");
        }
        if(!serverSmsCode.equals(smsCode)) {
            throw new BizException(ResultCode.FAIL, "短信验证码不正确!");
        }
        CacheUtil.delete(phonebindKey);
        if(updateUserInfo(UserInfo.builder().userPhone(phone).build(), Sqls.custom()
                .andEqualTo("userCode", DianwanUserLoginInfo.getUserCode()), DianwanUserLoginInfo.getUserCode()) > 0) {
            ThreadManager.executeOrderIoTask(DianwanUserLoginInfo.getUserId(), new BaseRunnable() {
                @Override
                public void execute() {
                    RedDotTypeEnum.TASK.operateRedDotAndNotify(DianwanUserLoginInfo.getUserCode(), false);
                }

                @Override
                public String getName() {
                    return "玩家绑定手机号刷新任务红点-" + phone;
                }
            });
        }
        return phone;
    }

    @Override
    public void sendBindPhoneVerificationCode(String phone) {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        UserAccessMark oneMinAccessMark = accessService.getOneMinAccessMark(AccessMarkEnum.SMS_VERIFICATION_CODE, DianwanUserLoginInfo.getUserCode());
        if(!oneMinAccessMark.canAccess()) {
            throw new BizException(ResultCode.FAIL, "发送频繁,请1分钟后再试!");
        }
        String smsCode = smsService.generateVerificationCode(4);
        smsService.sendSMSVerificationCode(SmsChannelEnum.HUAWEI_OS, phone, smsCode);
        CacheUtil.set(RedisConst.SMS_PHONEBIND.getKey(DianwanUserLoginInfo.getUserCode()),
                smsCode, RedisConst.SMS_PHONEBIND.getExpireSecs());
    }

    @Override
    public CurrencyBaseResp bindUserReward(UserInfo beInviteUserInfo, UserInfo inviteUser) {
        
        int inviteNum = Optional.ofNullable(utilInitDataService.getInitDataById(301))
                .map(UtilInitData::getInitKey).map(Integer::parseInt).orElse(0);
        int beInviteNum = Optional.ofNullable(utilInitDataService.getInitDataById(302))
                .map(UtilInitData::getInitKey).map(Integer::parseInt).orElse(0);

        String curTimestr = LocalDateTimeUtil.formatNormal(LocalDateTime.now());
        
        userMailService.sendMail(UserMail.builder()
                .userId(beInviteUserInfo.getUserId())
                .del(false)
                .lrsj(curTimestr)
                .gxsj(curTimestr)
                .zt(2)
                .mailName("成功绑定玩家")
                .mailContent("恭喜你成功绑定玩家[ "+ inviteUser.getUserNickname() +" ]")
                .build(), beInviteUserInfo.getUserCode());
        String inviteMailContent = "成功邀请玩家[ "+ beInviteUserInfo.getUserNickname() +" ]";
        if(inviteNum > 0) {
            int maxInvitePersonNum = SysParamDictConfig.getInstance().getMaxInvitePersonNum();
            if(Integer.MAX_VALUE != maxInvitePersonNum) {
                int inviteCnt = userInfoMapper.selectCountByCondition(Condition.builder(UserInfo.class).where(
                        Sqls.custom().andEqualTo("userUpId", beInviteUserInfo.getUserUpId())
                ).build());
                if(inviteCnt > maxInvitePersonNum) {
                    inviteNum = 0;
                    inviteMailContent += ", 邀请人数已达上限,无法获取奖励!";
                }
            }
            if(inviteNum > 0) {
                userInfoService.addMonetaryRewards(beInviteUserInfo.getUserUpId(), 2, "邀请玩家" + beInviteUserInfo.getUserNickname() + ",获得奖励:" + inviteNum + "金币",
                        inviteNum, beInviteUserInfo.getUserCode(), RewardSourceTypeEnum.INVITE_USER);
            }
        }
        
        userMailService.sendMail(UserMail.builder()
                .userId(inviteUser.getUserId())
                .del(false)
                .lrsj(curTimestr)
                .gxsj(curTimestr)
                .zt(2)
                .mailName("邀请玩家注册")
                .mailContent(inviteMailContent)
                .build(), inviteUser.getUserCode());
        if(beInviteNum > 0) {
            userInfoService.addMonetaryRewards(beInviteUserInfo.getUserCode(), 2, "被玩家" + inviteUser.getUserNickname() + "邀请,获得奖励:" + beInviteNum + "金币",
                    beInviteNum, beInviteUserInfo.getUserUpId(), RewardSourceTypeEnum.BE_INVITE_USER);
        }
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("type", 1);
        paramMap.put("upPromote", inviteUser.getUserCode());
        paramMap.put("userCode", beInviteUserInfo.getUserCode());
        promoterService.notifyBackend(paramMap);
        return CurrencyBaseResp.builder().money(beInviteNum).build();
    }

    @Override
    public CurrencyBaseResp bindUser(String inviteUserCode) {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        return bindUser(DianwanUserLoginInfo.getUserId(), DianwanUserLoginInfo.getUserCode(),
                DianwanUserLoginInfo.getUserInfo().getTopAgentId(), DianwanUserLoginInfo.getUserInfo().getNickname(),
                inviteUserCode);
    }

    @Override
    public CurrencyBaseResp bindUser(Integer curUserId, String curUserCode, String curUserUpId,
                                     String curNickName, String inviteUserCode) {
        if (StringUtils.isNotBlank(curUserUpId)
                && !"0".equals(curUserUpId)) {
            throw new BizException(ResultCode.FAIL, "您已经绑定用户,无法修改!");
        }
        if("0".equals(inviteUserCode) || "10000".equals(inviteUserCode)) {
            throw new BizException(ResultCode.FAIL, "绑定的玩家不存在!");
        }
        if(curUserCode.equals(inviteUserCode)) {
            throw new BizException(ResultCode.FAIL, "绑定的玩家不能是自己!");
        }
        UserInfo inviteUser = userInfoService.getUserCacheInfo(inviteUserCode);
        if(inviteUser == null) {
            throw new BizException(ResultCode.FAIL, "绑定的玩家不存在!");
        }
        if(curUserCode.equals(inviteUser.getUserUpId())) {
            throw new BizException(ResultCode.FAIL, "绑定的玩家不能是你的下级!");
        }
        int upLine = updateUserInfo(UserInfo.builder().userUpId(inviteUserCode).build(), Sqls.custom()
                .andEqualTo("userCode", curUserCode)
                .andEqualTo("userUpId", "0"), curUserCode);
        if(upLine < 1) {
            throw new BizException(ResultCode.FAIL, "您已经绑定用户,无法修改!");
        }
        return bindUserReward(UserInfo.builder().userId(curUserId)
                        .userCode(curUserCode)
                        .userUpId(inviteUserCode)
                        .userNickname(curNickName)
                        .build(),
                inviteUser);
    }

    @Override
    public int updateUserLoginDay(String userCode) {
        int upLine = userInfoMapper.updateUserLoginDay(userCode, LocalDateTimeUtil.formatNormal(LocalDateTime.now()));
        if(upLine > 1)
            SpringContextHolder.publishEvent(new ReloadUserEvent(userCode));
        return upLine;
    }

    @Override
    public int insertUserInfo(UserInfo userInfo) {
        return userInfoMapper.insertUserInfo(userInfo);
    }

}
