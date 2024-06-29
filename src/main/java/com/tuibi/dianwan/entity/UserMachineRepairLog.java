package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "user_machine_repair_log")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserMachineRepairLog {
    /**
     * 记录主键
     */
    @Id
    @Column(name = "log_id")
    private String logId;

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
     * 用户主键
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 保修内容
     */
    @Column(name = "user_context")
    private String userContext;

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

    @Column(name = "jixiu_account")
    private String jixiuAccount;
}