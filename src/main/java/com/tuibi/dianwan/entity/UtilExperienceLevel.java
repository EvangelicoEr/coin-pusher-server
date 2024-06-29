package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "util_experience_level")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilExperienceLevel {
    /**
     * 会员等级主键
     */
    @Id
    @Column(name = "experience_level_id")
    private Integer experienceLevelId;

    /**
     * 等级logo
     */
    @Column(name = "experience_level_logo")
    private String experienceLevelLogo;

    /**
     * 等级名称
     */
    @Column(name = "experience_level_name")
    private String experienceLevelName;

    /**
     * 等级级别
     */
    @Column(name = "experience_level_num")
    private String experienceLevelNum;

    /**
     * 达成经验数
     */
    @Column(name = "experience_level_experience")
    private Integer experienceLevelExperience;

    /**
     * 奖励类型 1积分  2金币
     */
    @Column(name = "experience_reward_type")
    private Integer experienceRewardType;

    /**
     * 奖励数
     */
    @Column(name = "experience_reward_num")
    private Integer experienceRewardNum;

    /**
     * 是否绑定卡券 1绑定   0未绑定
     */
    @Column(name = "is_card")
    private Integer isCard;

    /**
     * 卡券id
     */
    @Column(name = "voucher_id")
    private Integer voucherId;

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
}