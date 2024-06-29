package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UtilSigninCumulative;
import com.tuibi.dianwan.entity.UtilSigninCumulativeExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UtilSigninCumulativeMapper extends BaseMapper<UtilSigninCumulative> {
    long countByExample(UtilSigninCumulativeExample example);

    int deleteByExample(UtilSigninCumulativeExample example);

    List<UtilSigninCumulative> selectByExample(UtilSigninCumulativeExample example);

    int updateByExampleSelective(@Param("record") UtilSigninCumulative record, @Param("example") UtilSigninCumulativeExample example);

    int updateByExample(@Param("record") UtilSigninCumulative record, @Param("example") UtilSigninCumulativeExample example);
}