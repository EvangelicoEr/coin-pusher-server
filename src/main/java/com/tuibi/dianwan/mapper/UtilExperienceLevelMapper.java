package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UtilExperienceLevel;
import com.tuibi.dianwan.entity.UtilExperienceLevelExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UtilExperienceLevelMapper extends BaseMapper<UtilExperienceLevel> {
    long countByExample(UtilExperienceLevelExample example);

    int deleteByExample(UtilExperienceLevelExample example);

    List<UtilExperienceLevel> selectByExample(UtilExperienceLevelExample example);

    int updateByExampleSelective(@Param("record") UtilExperienceLevel record, @Param("example") UtilExperienceLevelExample example);

    int updateByExample(@Param("record") UtilExperienceLevel record, @Param("example") UtilExperienceLevelExample example);
}