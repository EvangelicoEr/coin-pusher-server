package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "util_daily_gifts")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilDailyGifts {
    /**
     * 每日礼品id
     */
    @Id
    @Column(name = "daily_gifts_id")
    private Integer dailyGiftsId;

    /**
     * 连续天数
     */
    @Column(name = "gifts_day")
    private Integer giftsDay;

    /**
     * 获得金币
     */
    @Column(name = "gifts_num")
    private Integer giftsNum;

    /**
     * 支付金额
     */
    @Column(name = "gifts_money")
    private Double giftsMoney;

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
}