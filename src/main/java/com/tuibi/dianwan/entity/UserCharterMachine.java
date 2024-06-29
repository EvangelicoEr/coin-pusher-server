package com.tuibi.dianwan.entity;

import cn.hutool.core.date.DatePattern;
import cn.hutool.core.date.LocalDateTimeUtil;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.Duration;
import java.time.LocalDateTime;

@Table(name = "user_charter_machine")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserCharterMachine {
    @Id
    private Integer id;

    /**
     * 用户码
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 包机金币
     */
    @Column(name = "user_cost_get")
    private Integer userCostGet;

    /**
     * 包机消耗
     */
    @Column(name = "user_cost_lose")
    private Integer userCostLose;

    /**
     * 录入时间
     */
    private String lrsj;

    /**
     * 总时间
     */
    private String zsj;

    /**
     * 购买的币
     */
    @Column(name = "src_num")
    private Integer srcNum;

    @Column(name = "user_code")
    private Integer userCode;

    /**
     * 机器ID
     */
    @Column(name = "machine_id")
    private String machineId;

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
     * 包机时间 分钟
     */
    @Column(name = "voucher_time")
    private Integer voucherTime;

    /**
     * 主动离开
     */
    @Column(name = "is_leave")
    private Integer isLeave;

    @Column(name = "machine_group_num")
    private String machineGroupNum;

    /**
     * 即user_machine_log的log_id
     */
    @Column(name = "machine_log_id")
    private String machineLogId;

    public int getLastMoney() {
        return userCostGet - userCostLose;
    }

    public boolean isOver() {
        return Duration.between(LocalDateTime.now(),
                LocalDateTimeUtil.parse(getZsj(), DatePattern.NORM_DATETIME_FORMATTER)).toMillis() <= 0;
    }

    public long getLastTimeMSeconds() {
        return Duration.between(LocalDateTime.now(),
                LocalDateTimeUtil.parse(getZsj(), DatePattern.NORM_DATETIME_FORMATTER)).toMillis();
    }
}