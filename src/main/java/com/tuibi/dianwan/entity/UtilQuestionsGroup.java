package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "util_questions_group")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilQuestionsGroup {
    /**
     * 问题分类id
     */
    @Id
    @Column(name = "group_id")
    private Integer groupId;

    /**
     * 问题分类名称
     */
    @Column(name = "group_name")
    private String groupName;

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
}