package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "util_questions")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilQuestions {
    /**
     * 帮助中心主键
     */
    @Id
    @Column(name = "questions_id")
    private Integer questionsId;

    /**
     * 问题分组id
     */
    @Column(name = "group_id")
    private Integer groupId;

    /**
     * 标题
     */
    private String questions;

    /**
     * 排序
     */
    private Integer sort;

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

    /**
     * 内容
     */
    private String frequently;
}