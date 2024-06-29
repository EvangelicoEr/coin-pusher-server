package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "util_announcement")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilAnnouncement {
    /**
     * 公告Id
     */
    @Id
    @Column(name = "announcement_id")
    private Integer announcementId;

    /**
     * 公告标题
     */
    @Column(name = "announcement_title")
    private String announcementTitle;

    /**
     * 浏览量
     */
    @Column(name = "announcement_flow_num")
    private Integer announcementFlowNum;

    /**
     * 关联id  机器id
     */
    @Column(name = "join_id")
    private String joinId;

    @Column(name = "user_code")
    private Integer userCode;

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

    /**
     * 公告内容
     */
    @Column(name = "announcement_content")
    private String announcementContent;
}