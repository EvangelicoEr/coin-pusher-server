package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UserCostLog;
import com.tuibi.dianwan.entity.UserCostLogExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserCostLogMapper extends BaseMapper<UserCostLog> {
    long countByExample(UserCostLogExample example);

    int deleteByExample(UserCostLogExample example);

    List<UserCostLog> selectByExample(UserCostLogExample example);

    int updateByExampleSelective(@Param("record") UserCostLog record, @Param("example") UserCostLogExample example);

    int updateByExample(@Param("record") UserCostLog record, @Param("example") UserCostLogExample example);
}