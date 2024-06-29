package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "util_reward")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilReward {
    /**
     * 任务主键
     */
    @Id
    @Column(name = "reward_id")
    private Integer rewardId;

    /**
     * 奖励名称
     */
    @Column(name = "reward_name")
    private String rewardName;

    /**
     * 1 手机验证   2 充值
     */
    @Column(name = "reward_type")
    private Integer rewardType;

    /**
     * 需达成次数
     */
    @Column(name = "reward_achieve")
    private Integer rewardAchieve;

    /**
     * 奖励金币数
     */
    @Column(name = "reward_num")
    private Integer rewardNum;

    /**
     * 排序
     */
    private Integer sort;

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

    @Column(name = "reward_time")
    private Integer rewardTime;
}