package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UtilQuestions;
import com.tuibi.dianwan.entity.UtilQuestionsExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UtilQuestionsMapper extends BaseMapper<UtilQuestions> {
    long countByExample(UtilQuestionsExample example);

    int deleteByExample(UtilQuestionsExample example);

    List<UtilQuestions> selectByExampleWithBLOBs(UtilQuestionsExample example);

    List<UtilQuestions> selectByExample(UtilQuestionsExample example);

    int updateByExampleSelective(@Param("record") UtilQuestions record, @Param("example") UtilQuestionsExample example);

    int updateByExampleWithBLOBs(@Param("record") UtilQuestions record, @Param("example") UtilQuestionsExample example);

    int updateByExample(@Param("record") UtilQuestions record, @Param("example") UtilQuestionsExample example);
}