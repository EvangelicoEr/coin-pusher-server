package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UserInfo;
import com.tuibi.dianwan.enums.RewardSourceTypeEnum;
import com.tuibi.dianwan.pojo.UserInfoChangeReq;
import com.tuibi.dianwan.pojo.UserVerifiedReq;
import com.tuibi.dianwan.vo.CurrencyBaseResp;
import com.tuibi.dianwan.vo.IntegralExchangeInfoResp;
import com.tuibi.dianwan.vo.UserSimpleInfoResp;
import tk.mybatis.mapper.util.Sqls;

import java.util.Map;
import java.util.Set;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UserInfoService {

    Map<String, UserSimpleInfoResp> getUserHeadPicInfo(Set<String> userCodes);

    UserSimpleInfoResp getUserSimpleInfo(String userCode);

    UserInfo getUserCacheInfo(String userCode);
    UserInfo getUserInfoByUnionId(String unionId);

    void clearUserCacheInfo(String userCode);

    /**
     * 获取玩家信息
     * @param userCode
     * @return
     */
    UserInfo getUserInfo(String userCode);
    /**
     * 获取玩家信息
     * @param userId
     * @return
     */
    UserInfo getUserInfo(Integer userId);

    /**
     * 增加玩家金币消耗值
     * @param userCode
     * @param costValue
     * @return
     */
    int addUserMoneyCost(String userCode, Integer costValue);

    int addUserMoneyGet(String userCode, Integer getValue);

    /**
     * 增加玩家积分
     * @param userCode
     * @param getValue
     * @return
     */
    int addUserIntegralGet(String userCode, Integer getValue);

    /**
     * 扣除玩家积分
     * @param userCode
     * @param costValue
     * @return
     */
    int addUserIntegralCost(String userCode, Integer costValue);

    /**
     *
     * @param userCode      玩家code
     * @param rewardType    奖励类型    1积分  2金币
     * @param desc          奖励描述
     * @param rewardNum     奖励数量
     * @param sourceId      关联id
     * @param rewardSourceType  奖励来源类型
     */
    void addMonetaryRewards(String userCode, Integer rewardType, String desc, Integer rewardNum, String sourceId, RewardSourceTypeEnum rewardSourceType);
    void addMonetaryRewards(String userCode, Integer rewardType, String desc, Integer rewardNum, String sourceId, RewardSourceTypeEnum rewardSourceType, boolean show);

    /**
     * 修改玩家经验等级
     * @param userCode
     * @param levelId
     * @return
     */
    int updateUserExperienceLevel(String userCode, Integer levelId);

    /**
     * 获取积分兑换数据
     * @return
     */
    IntegralExchangeInfoResp getIntegralExchangeInfo();

    /**
     * 进行积分兑换
     * @param exchangeMoney  兑换的金币数
     * @return
     */
    CurrencyBaseResp integralExchange(Integer exchangeMoney);

    /**
     * 玩家实名认证
     * @param req
     */
    void userVerified(UserVerifiedReq req);

    /**
     * 用户信息修改
     * @param req
     */
    UserInfoChangeReq userInfoChange(UserInfoChangeReq req);

    /**
     * 修改玩家信息
     * @param userInfo
     * @return
     */
    int updateUserInfo(UserInfo userInfo, Sqls sql, String userCode);

    /**
     * 玩家绑定手机号
     * @param phone
     * @param smsCoed
     * @return
     */
    String bindPhone(String phone, String smsCoed);

    /**
     * 发送绑定手机验证码
     * @param phone
     */
    void sendBindPhoneVerificationCode(String phone);

    /**
     * 发放邀请玩家成功奖励
     * @param beInviteUserInfo
     * @param inviteUser
     */
    CurrencyBaseResp bindUserReward(UserInfo beInviteUserInfo, UserInfo inviteUser);

    /**
     * 绑定玩家
     * @param inviteUserCode
     */
    CurrencyBaseResp bindUser(String inviteUserCode);

    CurrencyBaseResp bindUser(Integer curUserId, String curUserCode,
                              String curUserUpId, String curNickName, String inviteUserCode);

    /**
     * 更新玩家登录天数
     * @param userCode
     * @return
     */
    int updateUserLoginDay(String userCode);

    /**
     * 插入新用户
     * @param userInfo
     * @return
     */
    int insertUserInfo(UserInfo userInfo);
}
