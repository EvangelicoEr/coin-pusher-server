package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "user_cost_log")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserCostLog {
    /**
     * 记录主键
     */
    @Id
    @Column(name = "log_id")
    private String logId;

    /**
     * 用户主键
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 1 加  2减
     */
    @Column(name = "log_operation")
    private Integer logOperation;

    /**
     *  1每日签到  2游戏 3每日任务  4普通会员奖励   5充值 6我填写了邀请码得到金币 7首冲奖励 8输入福利码得到金币 9上机费用（查询不做显示，10，平台充值 11 邮箱领取 15 积分兑换 20 充值每日礼包
     */
    @Column(name = "log_type")
    private String logType;

    /**
     * 1积分  2金币   3推点
     */
    @Column(name = "log_cost_type")
    private String logCostType;

    /**
     * 记录内容
     */
    @Column(name = "log_content")
    private String logContent;

    /**
     * 记录值
     */
    @Column(name = "log_num")
    private Integer logNum;

    /**
     * 余额
     */
    @Column(name = "log_balance")
    private Integer logBalance;

    /**
     * 任务id
     */
    @Column(name = "log_join_id")
    private String logJoinId;

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
    private String zt;

    /**
     * 备注
     */
    private String bz;

    /**
     * 更新时间
     */
    private String gxsj;

    @Column(name = "channel_id")
    private Integer channelId;
}