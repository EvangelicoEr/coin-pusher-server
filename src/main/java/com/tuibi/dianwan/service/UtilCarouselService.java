package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UtilCarousel;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 * banner图
 */
public interface UtilCarouselService {

    /**
     *
     * @param location  1首页 2榜单  3社区
     * @return
     */
    List<UtilCarousel> getBanner(int location);

    /**
     * 清除banner缓存
     * @param location
     */
    void clearBannerCache(int location);
}
