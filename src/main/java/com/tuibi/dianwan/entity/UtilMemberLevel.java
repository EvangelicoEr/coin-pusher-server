package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "util_member_level")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilMemberLevel {
    /**
     * 会员等级主键
     */
    @Id
    @Column(name = "member_level_id")
    private Integer memberLevelId;

    /**
     * 等级logo
     */
    @Column(name = "member_level_logo")
    private String memberLevelLogo;

    /**
     * 等级名称
     */
    @Column(name = "member_level_name")
    private String memberLevelName;

    /**
     * 等级级别
     */
    @Column(name = "member_level_num")
    private Integer memberLevelNum;

    /**
     * 达成推点数
     */
    @Column(name = "member_level_money")
    private Integer memberLevelMoney;

    /**
     * 奖励金币数
     */
    @Column(name = "member_reward_num")
    private Integer memberRewardNum;

    /**
     * 充值额外奖励金币数
     */
    @Column(name = "recharge_gift_num")
    private Double rechargeGiftNum;

    /**
     * 录入时间
     */
    private String lrsj;

    /**
     * 录入账号
     */
    private String lrzh;

    /**
     * 2正常
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

    @Column(name = "member_extra")
    private String memberExtra;

    @Column(name = "member_quicken")
    private String memberQuicken;

    /**
     * 规则
     */
    @Column(name = "level_rules")
    private String levelRules;
}