package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UtilQuestionsGroup;
import com.tuibi.dianwan.entity.UtilQuestionsGroupExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UtilQuestionsGroupMapper extends BaseMapper<UtilQuestionsGroup> {
    long countByExample(UtilQuestionsGroupExample example);

    int deleteByExample(UtilQuestionsGroupExample example);

    List<UtilQuestionsGroup> selectByExample(UtilQuestionsGroupExample example);

    int updateByExampleSelective(@Param("record") UtilQuestionsGroup record, @Param("example") UtilQuestionsGroupExample example);

    int updateByExample(@Param("record") UtilQuestionsGroup record, @Param("example") UtilQuestionsGroupExample example);
}