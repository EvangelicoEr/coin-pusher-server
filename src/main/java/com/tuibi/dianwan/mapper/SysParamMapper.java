package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.SysParam;
import com.tuibi.dianwan.entity.SysParamExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysParamMapper extends BaseMapper<SysParam> {
    long countByExample(SysParamExample example);

    int deleteByExample(SysParamExample example);

    List<SysParam> selectByExample(SysParamExample example);

    int updateByExampleSelective(@Param("record") SysParam record, @Param("example") SysParamExample example);

    int updateByExample(@Param("record") SysParam record, @Param("example") SysParamExample example);
}