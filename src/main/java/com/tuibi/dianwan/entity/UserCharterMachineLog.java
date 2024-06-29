package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "user_charter_machine_log")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserCharterMachineLog {
    @Id
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 机器ID
     */
    @Column(name = "machine_id")
    private String machineId;

    @Column(name = "src_num")
    private Integer srcNum;

    private Integer num;

    /**
     * 积分
     */
    @Column(name = "is_grand")
    private Integer isGrand;

    private String lrsj;

    /**
     * 渠道ID
     */
    @Column(name = "channel_id")
    private Integer channelId;

    /**
     * 支付ID
     */
    @Column(name = "recharge_id")
    private String rechargeId;

    /**
     * 原来的金币
     */
    @Column(name = "src_cost")
    private Integer srcCost;

    /**
     * 最终金币
     */
    @Column(name = "des_cost")
    private Integer desCost;
}