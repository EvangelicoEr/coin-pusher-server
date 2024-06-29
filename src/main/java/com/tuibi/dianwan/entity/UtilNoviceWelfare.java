package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "util_novice_welfare")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilNoviceWelfare {
    /**
     * 周卡福利Id
     */
    @Id
    @Column(name = "novice_welfare_id")
    private Integer noviceWelfareId;

    /**
     * 周卡名称
     */
    @Column(name = "welfare_name")
    private String welfareName;

    /**
     * 支付金额
     */
    @Column(name = "welfare_money")
    private Double welfareMoney;

    /**
     * 奖励类型 1积分  2金币
     */
    @Column(name = "welfare_type")
    private Integer welfareType;

    /**
     * 每天奖励数
     */
    @Column(name = "welfare_num")
    private Integer welfareNum;

    /**
     * 排序
     */
    @Column(name = "welfare_sort")
    private Integer welfareSort;

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

    @Column(name = "list_ios_id")
    private String listIosId;

    @Column(name = "now_money")
    private Integer nowMoney;

    @Column(name = "day_num")
    private Integer dayNum;
}