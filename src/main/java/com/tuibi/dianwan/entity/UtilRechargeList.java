package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "util_recharge_list")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilRechargeList {
    /**
     * 列表主键
     */
    @Id
    @Column(name = "list_id")
    private Integer listId;

    /**
     * 充值类型  1每日礼包  2新人特惠  3充值列表 4包机券
     */
    @Column(name = "list_type")
    private String listType;

    /**
     * 1安卓  2苹果
     */
    @Column(name = "list_channel")
    private Integer listChannel;

    /**
     * 苹果充值id  
     */
    @Column(name = "list_ios_id")
    private String listIosId;

    /**
     * 充值标签
     */
    @Column(name = "list_label")
    private String listLabel;

    /**
     * 充值名称
     */
    @Column(name = "list_name")
    private String listName;

    /**
     * 消耗金额
     */
    @Column(name = "list_money")
    private Double listMoney;

    /**
     * 得到推点
     */
    @Column(name = "list_get_num")
    private Integer listGetNum;

    /**
     * 得到积分
     */
    @Column(name = "list_get_integral")
    private Integer listGetIntegral;

    /**
     * 充值排序
     */
    @Column(name = "list_sort")
    private Integer listSort;

    /**
     * 额外送金币
     */
    @Column(name = "list_data_num")
    private Integer listDataNum;

    /**
     * 充值列表图片
     */
    @Column(name = "list_img")
    private String listImg;

    /**
     * 是否加活动标签  0否  1是
     */
    @Column(name = "is_mended")
    private Integer isMended;

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

    /**
     * 包机ID
     */
    @Column(name = "voucher_id")
    private Integer voucherId;

    @Column(name = "nick_name")
    private String nickName;

    @Column(name = "is_limit")
    private Integer isLimit;

    @Column(name = "org_list_money")
    private Integer orgListMoney;

    @Column(name = "now_money")
    private Integer nowMoney;
}