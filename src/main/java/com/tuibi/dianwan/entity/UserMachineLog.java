package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "user_machine_log")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserMachineLog {
    /**
     * 记录主键
     */
    @Id
    @Column(name = "log_id")
    private String logId;

    /**
     * 用户主键
     */
    @Column(name = "user_code")
    private String userCode;

    /**
     * 机器主键
     */
    @Column(name = "machine_id")
    private String machineId;

    /**
     * 机器名称
     */
    @Column(name = "machine_name")
    private String machineName;

    /**
     * 进入余额
     */
    @Column(name = "log_num1")
    private Integer logNum1;

    /**
     * 离开余额
     */
    @Column(name = "log_num2")
    private Integer logNum2;

    /**
     * 离开截图
     */
    @Column(name = "log_img")
    private String logImg;

    /**
     * 只针对万圣夜，是否已发放 0否1是 ，默认1，赚1000以上的 为 0
     */
    @Column(name = "is_grant")
    private Integer isGrant;

    /**
     * 仅针对于娃娃机 0--没抓到 ，1 -- 抓到
     */
    @Column(name = "catch_w")
    private String catchW;

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

    /**
     * 进入截图
     */
    @Column(name = "in_log_img")
    private String inLogImg;

    @Column(name = "log_num3")
    private Integer logNum3;

    @Column(name = "log_num4")
    private Integer logNum4;

    @Column(name = "log_toubi_num")
    private Integer logToubiNum;

    @Column(name = "log_img_in")
    private String logImgIn;

    /**
     * 渠道ID
     */
    @Column(name = "channel_id")
    private Integer channelId;

    @Column(name = "log_down")
    private Integer logDown;

    /**
     * 机器底分
     */
    @Column(name = "machine_price")
    private Integer machinePrice;
}