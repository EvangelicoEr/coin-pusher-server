package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UserMachineRepairLog;
import com.tuibi.dianwan.entity.UserMachineRepairLogExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMachineRepairLogMapper extends BaseMapper<UserMachineRepairLog> {
    long countByExample(UserMachineRepairLogExample example);

    int deleteByExample(UserMachineRepairLogExample example);

    List<UserMachineRepairLog> selectByExample(UserMachineRepairLogExample example);

    int updateByExampleSelective(@Param("record") UserMachineRepairLog record, @Param("example") UserMachineRepairLogExample example);

    int updateByExample(@Param("record") UserMachineRepairLog record, @Param("example") UserMachineRepairLogExample example);
}