package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "user_mail")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserMail {
    /**
     * 用户邮箱id
     */
    @Id
    @Column(name = "mail_id")
    private Long mailId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 标题
     */
    @Column(name = "mail_name")
    private String mailName;

    /**
     * 邮箱内容
     */
    @Column(name = "mail_content")
    private String mailContent;

    /**
     * 附件金币
     */
    @Column(name = "mail_cost")
    private Integer mailCost;

    /**
     * 附件积分
     */
    @Column(name = "mail_integral")
    private Integer mailIntegral;

    /**
     * 录入时间  发放时间
     */
    private String lrsj;

    /**
     * 录入账号
     */
    private String lrzh;

    /**
     * 2待查看  1待领取  0已领取/没有附件的直接为0
     */
    private Integer zt;

    /**
     * 备注  来源说明
     */
    private String bz;

    /**
     * 更新时间
     */
    private String gxsj;

    @Column(name = "login_tip")
    private Integer loginTip;

    /**
     * 卡券id
     */
    @Column(name = "voucher_id")
    private Integer voucherId;

    /**
     * 数量
     */
    @Column(name = "voucher_num")
    private Integer voucherNum;

    /**
     * 是否删除
     */
    private Boolean del;

    public boolean canRecever() {
        return mailCost > 0 || mailIntegral > 0 || (voucherId > 0 && voucherNum > 0);
    }
}