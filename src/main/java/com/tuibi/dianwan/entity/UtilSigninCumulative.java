package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "util_signin_cumulative")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilSigninCumulative {
    /**
     * 累计签到奖励主键
     */
    @Id
    @Column(name = "cumulative_id")
    private Integer cumulativeId;

    /**
     * 累计签到天数
     */
    @Column(name = "cumulative_time")
    private Integer cumulativeTime;

    /**
     * 1 奖励推点  
     */
    @Column(name = "cumulative_type")
    private Integer cumulativeType;

    /**
     * 奖励数  
     */
    @Column(name = "cumulative_num")
    private Integer cumulativeNum;

    /**
     * 奖励类型id   奖励推点时填0
     */
    @Column(name = "cumulative_type_id")
    private Integer cumulativeTypeId;

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
}