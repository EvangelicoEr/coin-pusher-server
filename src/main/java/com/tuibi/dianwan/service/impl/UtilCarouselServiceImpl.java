package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.UtilCarousel;
import com.tuibi.dianwan.mapper.UtilCarouselMapper;
import com.tuibi.dianwan.service.UtilCarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 * banner图
 */
@Service
public class UtilCarouselServiceImpl implements UtilCarouselService {

    @Autowired
    private UtilCarouselMapper utilCarouselMapper;

    @Override
    @Cacheable(value = "FOREVER", key = "'getMachineByGroup-' + #location")
    public List<UtilCarousel> getBanner(int location) {
        return utilCarouselMapper.selectByCondition(Condition.builder(UtilCarousel.class).where(
                        Sqls.custom().andEqualTo("zt", "2")
                                .andEqualTo("carouselPosition", location)
                ).orderByAsc("carouselSort").build());
    }

    @Override
    @CacheEvict(value = "FOREVER", key = "'getMachineByGroup-' + #location")
    public void clearBannerCache(int location) {

    }
}
