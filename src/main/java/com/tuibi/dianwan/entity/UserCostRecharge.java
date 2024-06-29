package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "user_cost_recharge")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserCostRecharge {
    /**
     * 充值主键
     */
    @Id
    @Column(name = "recharge_id")
    private String rechargeId;

    /**
     * 用户主键
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 充值内容
     */
    @Column(name = "recharge_content")
    private String rechargeContent;

    /**
     * 充值列表Id
     */
    @Column(name = "list_id")
    private String listId;

    /**
     * 充值值
     */
    @Column(name = "recharge_num")
    private Double rechargeNum;

    /**
     * 预计充值值
     */
    @Column(name = "recharge_ynum")
    private Double rechargeYnum;

    /**
     * 获得币数
     */
    @Column(name = "recharge_get_num")
    private Integer rechargeGetNum;

    /**
     * 获得积分
     */
    @Column(name = "recharge_get_integral")
    private Integer rechargeGetIntegral;

    /**
     * 是否抵扣  0否  1是
     */
    @Column(name = "is_deduction")
    private String isDeduction;

    /**
     * 支付方式 1安卓支付宝 2安卓微信  3苹果支付宝 4苹果微信 5苹果内购   6平台支付宝   7平台微信
     */
    @Column(name = "recharge_type")
    private String rechargeType;

    @Column(name = "recharge_join")
    private String rechargeJoin;

    /**
     * 购买类型：1普通充值  2周卡福利  3每日礼品 4包机
     */
    @Column(name = "recharge_purchase")
    private Integer rechargePurchase;

    /**
     * 录入时间
     */
    private String lrsj;

    /**
     * 录入账号
     */
    private String lrzh;

    /**
     * 2正常  0充值成功
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

    public boolean paySuc() {
        return "0".equals(zt);
    }
}