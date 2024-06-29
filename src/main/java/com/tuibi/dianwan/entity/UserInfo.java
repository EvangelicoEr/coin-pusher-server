package com.tuibi.dianwan.entity;

import java.time.LocalDateTime;
import javax.persistence.*;

import com.tuibi.dianwan.config.PayUserInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

@Table(name = "user_info")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserInfo implements PayUserInfo {
    /**
     * 用户主键
     */
    @Id
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户编码
     */
    @Column(name = "user_code")
    private String userCode;

    /**
     * 微信open_id
     */
    @Column(name = "user_openid")
    private String userOpenid;

    /**
     * user_union_id
     */
    @Column(name = "user_union_id")
    private String userUnionId;

    /**
     * 用户苹果id
     */
    @Column(name = "user_appleid")
    private String userAppleid;

    /**
     * 上级用户
     */
    @Column(name = "user_up_id")
    private String userUpId;

    /**
     * 手机号码
     */
    @Column(name = "user_phone")
    private String userPhone;

    /**
     * 用户昵称
     */
    @Column(name = "user_nickname")
    private String userNickname;

    /**
     * 注册时昵称
     */
    @Column(name = "register_user_nickname")
    private String registerUserNickname;

    /**
     * 用户头像
     */
    @Column(name = "user_img")
    private String userImg;

    /**
     * 注册时头像
     */
    @Column(name = "register_user_img")
    private String registerUserImg;

    /**
     * 用户性别   0表示保密，1表示男，2女表示女
     */
    @Column(name = "user_sex")
    private String userSex;

    /**
     * 会员等级id
     */
    @Column(name = "member_level_id")
    private Integer memberLevelId;

    /**
     * 会员累计值
     */
    @Column(name = "member_cumulative_value")
    private Double memberCumulativeValue;

    /**
     * 经验等级id
     */
    @Column(name = "experience_level_id")
    private Integer experienceLevelId;

    /**
     * 经验累计值
     */
    @Column(name = "experience_cumulative_value")
    private Integer experienceCumulativeValue;

    /**
     * 用户总获取币
     */
    @Column(name = "user_cost_get")
    private Integer userCostGet;

    /**
     * 用户总消耗币
     */
    @Column(name = "user_cost_lose")
    private Integer userCostLose;

    /**
     * 用户总获取积分
     */
    @Column(name = "user_integral_get")
    private Integer userIntegralGet;

    /**
     * 用户总消耗积分
     */
    @Column(name = "user_integral_lose")
    private Integer userIntegralLose;

    /**
     * 代理状态  0不开启   1开启代理
     */
    @Column(name = "user_agent")
    private Integer userAgent;

    /**
     * 录入时间
     */
    private String lrsj;

    /**
     * 录入账号
     */
    private String lrzh;

    /**
     * 2正常   1禁用   0已注销  5申请注销   3封号
     */
    private Integer zt;

    /**
     * 备注
     */
    private String bz;

    /**
     * 更新时间
     */
    private String gxsj;

    /**
     * 是否实名认证 0 -- 未实名认证 1-- 已实名认证
     */
    @Column(name = "is_real_name")
    private Integer isRealName;

    /**
     * 真实名称
     */
    @Column(name = "user_real_name")
    private String userRealName;

    /**
     * 认证身份证
     */
    @Column(name = "user_real_idcard")
    private String userRealIdcard;

    /**
     * 充值天数
     */
    @Column(name = "recharge_day")
    private Integer rechargeDay;

    /**
     * 最后的充值时间
     */
    @Column(name = "recharge_time")
    private String rechargeTime;

    /**
     * 是否充值
     */
    @Column(name = "is_recharge")
    private Integer isRecharge;

    /**
     * 0-self
     */
    @Column(name = "channel_id")
    private Integer channelId;

    @Column(name = "login_day")
    private Integer loginDay;

    /**
     * 推广员等级
     */
    @Column(name = "promote_level")
    private Integer promoteLevel;

    /**
     * 上级推广员
     */
    @Column(name = "up_promote")
    private Integer upPromote;

    /**
     * 最后登录时间
     */
    @Column(name = "last_logintime")
    private LocalDateTime lastLogintime;

    /**
     * 最后登录ip
     */
    @Column(name = "last_loginip")
    private String lastLoginip;

    /**
     * 客户端版本号
     */
    @Column(name = "client_version")
    private String clientVersion;

    /**
     * 客户端lua版本
     */
    @Column(name = "client_lua_version")
    private String clientLuaVersion;

    /**
     * 登录平台
     */
    @Column(name = "login_platform")
    private String loginPlatform;

    /**
     * 获取玩家剩余金币
     * @return
     */
    public int getLastMoney() {
        return Math.max(0, getUserCostGet() - getUserCostLose());
    }

    /**
     * 获取玩家剩余积分
     * @return
     */
    public int getLastIntegral() {
        return Math.max(0, getUserIntegralGet() - getUserIntegralLose());
    }

    public boolean isDisable() {
        return zt != null && zt.intValue() == 3;
    }

    public boolean isLogout() {
        return zt != null && zt.intValue() == 0;
    }
}