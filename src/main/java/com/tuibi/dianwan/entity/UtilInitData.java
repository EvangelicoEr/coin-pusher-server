package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "util_init_data")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilInitData {
    /**
     * 主键
     */
    @Id
    @Column(name = "init_id")
    private Integer initId;

    /**
     * 姓名
     */
    @Column(name = "init_name")
    private String initName;

    /**
     * 功能类型  用余区分导航栏显示
     */
    @Column(name = "init_type_id")
    private Integer initTypeId;

    /**
     * 录入时间
     */
    private String lrsj;

    /**
     * 录入账号
     */
    private String lrzh;

    /**
     * 1 编辑器   2 图片   3 文本输入  4文本域   5 单选 6视频
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

    /**
     * 0-self
     */
    @Column(name = "channel_id")
    private Integer channelId;

    /**
     * 值
     */
    @Column(name = "init_key")
    private String initKey;
}