package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "user_machine_game")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserMachineGame {
    /**
     * 游戏主键
     */
    @Id
    @Column(name = "game_id")
    private String gameId;

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
     * 是否游戏   1游戏   0围观
     */
    @Column(name = "is_game")
    private String isGame;

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
     * 更新时间
     */
    private String gxsj;

    @Column(name = "user_code_src")
    private String userCodeSrc;

    @Column(name = "data_id")
    private String dataId;

    @Column(name = "user_cost_log_id")
    private String userCostLogId;

    /**
     * 游戏排队
     */
    private String sxsj;

    /**
     * 上线状态，1上线
     */
    @Column(name = "sx_status")
    private String sxStatus;

    /**
     * 第一用户，等待入场时间
     */
    private String ddrcsj;

    /**
     * 排队名次
     */
    private Integer rank;

    /**
     * 渠道ID
     */
    @Column(name = "channel_id")
    private Integer channelId;

    /**
     * 备注
     */
    private String bz;

    @Column(name = "game_sendData")
    private String gameSenddata;
}