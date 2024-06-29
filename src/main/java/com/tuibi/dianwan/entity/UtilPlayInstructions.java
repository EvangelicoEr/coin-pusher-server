package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "util_play_instructions")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilPlayInstructions {
    /**
     * 玩法说明主键
     */
    @Id
    @Column(name = "instructions_id")
    private Integer instructionsId;

    /**
     * 机器类型    1推币机  2街机 3万圣夜   4新机器
     */
    @Column(name = "instructions_type")
    private Integer instructionsType;

    /**
     * 机器id
     */
    @Column(name = "machine_id")
    private String machineId;

    /**
     * 玩法说明标题
     */
    @Column(name = "instructions_name")
    private String instructionsName;

    /**
     * 玩法说明内容
     */
    @Column(name = "instructions_content")
    private String instructionsContent;

    /**
     * 排序
     */
    @Column(name = "instructions_sort")
    private Integer instructionsSort;

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

    @Column(name = "link_url")
    private String linkUrl;
}