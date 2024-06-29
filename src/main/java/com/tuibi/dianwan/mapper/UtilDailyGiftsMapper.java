package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UtilDailyGifts;
import com.tuibi.dianwan.entity.UtilDailyGiftsExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UtilDailyGiftsMapper extends BaseMapper<UtilDailyGifts> {
    long countByExample(UtilDailyGiftsExample example);

    int deleteByExample(UtilDailyGiftsExample example);

    List<UtilDailyGifts> selectByExample(UtilDailyGiftsExample example);

    int updateByExampleSelective(@Param("record") UtilDailyGifts record, @Param("example") UtilDailyGiftsExample example);

    int updateByExample(@Param("record") UtilDailyGifts record, @Param("example") UtilDailyGiftsExample example);
}