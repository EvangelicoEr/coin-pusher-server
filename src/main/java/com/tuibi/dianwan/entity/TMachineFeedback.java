package com.tuibi.dianwan.entity;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "t_machine_feedback")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TMachineFeedback {
    @Id
    private Integer id;

    /**
     * 内容描述
     */
    private String content;

    /**
     * 机器分类id
     */
    @Column(name = "machine_group_id")
    private String machineGroupId;

    /**
     * 排序值 越小越靠前
     */
    @Column(name = "sort_num")
    private Integer sortNum;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "update_time")
    private LocalDateTime updateTime;

    private Boolean del;
}