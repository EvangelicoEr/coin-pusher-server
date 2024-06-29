package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "user_signin")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserSignin {
    /**
     * 签到记录主键
     */
    @Id
    @Column(name = "signin_id")
    private Integer signinId;

    /**
     * 用户主键
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 签到时间   yyyy-mm-dd
     */
    @Column(name = "signin_time")
    private String signinTime;

    /**
     * 连续签到天数
     */
    @Column(name = "signin_day")
    private Integer signinDay;

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
}