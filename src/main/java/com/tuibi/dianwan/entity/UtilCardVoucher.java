package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "util_card_voucher")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilCardVoucher {
    /**
     * 卡券id
     */
    @Id
    @Column(name = "voucher_id")
    private Integer voucherId;

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

    @Column(name = "voucher_time")
    private Integer voucherTime;

    /**
     * 录入时间
     */
    private String lrsj;

    /**
     * 录入账号
     */
    private String lrzh;

    private Integer zt;

    /**
     * 备注
     */
    private String bz;

    /**
     * 更新时间
     */
    private String gxsj;
}