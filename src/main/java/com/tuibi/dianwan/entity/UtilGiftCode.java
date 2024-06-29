package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "util_gift_code")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilGiftCode {
    /**
     * 礼品兑奖码主键
     */
    @Id
    @Column(name = "code_id")
    private Integer codeId;

    /**
     * 兑奖码名称
     */
    @Column(name = "code_name")
    private String codeName;

    /**
     * 兑奖码编码
     */
    @Column(name = "code_num")
    private String codeNum;

    /**
     * 奖励金币数
     */
    @Column(name = "reward_gold_num")
    private Integer rewardGoldNum;

    /**
     * 奖励钻石数
     */
    @Column(name = "reward_diamonds_num")
    private Integer rewardDiamondsNum;

    /**
     * 录入时间
     */
    private String lrsj;

    /**
     * 录入账号
     */
    private String lrzh;

    /**
     * 2开放 1关闭
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

    @Column(name = "channel_id")
    private Integer channelId;

    public boolean open() {
        return zt == 2;
    }
}