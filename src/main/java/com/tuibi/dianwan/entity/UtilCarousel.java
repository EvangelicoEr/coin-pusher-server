package com.tuibi.dianwan.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "util_carousel")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UtilCarousel {
    /**
     * 轮播主键
     */
    @Id
    @Column(name = "carousel_id")
    private Integer carouselId;

    /**
     * 轮播名称
     */
    @Column(name = "carousel_name")
    private String carouselName;

    /**
     * 轮播图片
     */
    @Column(name = "carousel_img")
    private String carouselImg;

    /**
     * 轮播排序
     */
    @Column(name = "carousel_sort")
    private Integer carouselSort;

    /**
     * 1首页 2榜单  3社区
     */
    @Column(name = "carousel_position")
    private String carouselPosition;

    /**
     * 1都不显示 2显示详情  3外链  4内链
     */
    @Column(name = "carousel_way")
    private String carouselWay;

    /**
     *  显示方式为  3外链:  自定义跳转地址
     */
    @Column(name = "carousel_url")
    private String carouselUrl;

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
     * 详情说明
     */
    @Column(name = "carousel_details")
    private String carouselDetails;
}