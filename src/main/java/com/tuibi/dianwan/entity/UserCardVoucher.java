package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "user_card_voucher")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserCardVoucher {
    /**
     * 卡券id
     */
    @Id
    @Column(name = "voucher_id")
    private Integer voucherId;

    @Column(name = "user_id")
    private Integer userId;

    /**
     * 平台卡券id
     */
    @Column(name = "voucher_src_id")
    private Integer voucherSrcId;

    /**
     * 卡券类型  1充值加成券  2包机券
     */
    @Column(name = "voucher_type")
    private Integer voucherType;

    /**
     * 卡券名称
     */
    @Column(name = "voucher_name")
    private String voucherName;

    /**
     * 使用说明
     */
    @Column(name = "voucher_explain")
    private String voucherExplain;

    /**
     * 加成比例   xxx%/包机时长  xx小时
     */
    @Column(name = "voucher_num")
    private Integer voucherNum;

    /**
     * 使用时限 0 无期限  单位小时
     */
    @Column(name = "voucher_time")
    private Integer voucherTime;

    /**
     * 到期时间
     */
    @Column(name = "voucher_expire_time")
    private String voucherExpireTime;

    /**
     * 录入时间
     */
    private String lrsj;

    /**
     * 录入账号
     */
    private String lrzh;

    /**
     * 2未使用  1已使用   0已过期
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
}