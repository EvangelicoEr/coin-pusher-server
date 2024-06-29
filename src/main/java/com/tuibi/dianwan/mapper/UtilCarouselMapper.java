package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UtilCarousel;
import com.tuibi.dianwan.entity.UtilCarouselExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UtilCarouselMapper extends BaseMapper<UtilCarousel> {
    long countByExample(UtilCarouselExample example);

    int deleteByExample(UtilCarouselExample example);

    List<UtilCarousel> selectByExampleWithBLOBs(UtilCarouselExample example);

    List<UtilCarousel> selectByExample(UtilCarouselExample example);

    int updateByExampleSelective(@Param("record") UtilCarousel record, @Param("example") UtilCarouselExample example);

    int updateByExampleWithBLOBs(@Param("record") UtilCarousel record, @Param("example") UtilCarouselExample example);

    int updateByExample(@Param("record") UtilCarousel record, @Param("example") UtilCarouselExample example);
}