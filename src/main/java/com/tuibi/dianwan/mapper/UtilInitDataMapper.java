package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UtilInitData;
import com.tuibi.dianwan.entity.UtilInitDataExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UtilInitDataMapper extends BaseMapper<UtilInitData> {
    long countByExample(UtilInitDataExample example);

    int deleteByExample(UtilInitDataExample example);

    List<UtilInitData> selectByExampleWithBLOBs(UtilInitDataExample example);

    List<UtilInitData> selectByExample(UtilInitDataExample example);

    int updateByExampleSelective(@Param("record") UtilInitData record, @Param("example") UtilInitDataExample example);

    int updateByExampleWithBLOBs(@Param("record") UtilInitData record, @Param("example") UtilInitDataExample example);

    int updateByExample(@Param("record") UtilInitData record, @Param("example") UtilInitDataExample example);
}