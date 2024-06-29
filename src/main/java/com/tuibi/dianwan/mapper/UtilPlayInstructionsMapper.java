package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UtilPlayInstructions;
import com.tuibi.dianwan.entity.UtilPlayInstructionsExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UtilPlayInstructionsMapper extends BaseMapper<UtilPlayInstructions> {
    long countByExample(UtilPlayInstructionsExample example);

    int deleteByExample(UtilPlayInstructionsExample example);

    List<UtilPlayInstructions> selectByExample(UtilPlayInstructionsExample example);

    int updateByExampleSelective(@Param("record") UtilPlayInstructions record, @Param("example") UtilPlayInstructionsExample example);

    int updateByExample(@Param("record") UtilPlayInstructions record, @Param("example") UtilPlayInstructionsExample example);
}