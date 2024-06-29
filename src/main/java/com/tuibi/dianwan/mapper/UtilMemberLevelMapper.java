package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UtilMemberLevel;
import com.tuibi.dianwan.entity.UtilMemberLevelExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UtilMemberLevelMapper extends BaseMapper<UtilMemberLevel> {
    long countByExample(UtilMemberLevelExample example);

    int deleteByExample(UtilMemberLevelExample example);

    List<UtilMemberLevel> selectByExampleWithBLOBs(UtilMemberLevelExample example);

    List<UtilMemberLevel> selectByExample(UtilMemberLevelExample example);

    int updateByExampleSelective(@Param("record") UtilMemberLevel record, @Param("example") UtilMemberLevelExample example);

    int updateByExampleWithBLOBs(@Param("record") UtilMemberLevel record, @Param("example") UtilMemberLevelExample example);

    int updateByExample(@Param("record") UtilMemberLevel record, @Param("example") UtilMemberLevelExample example);
}