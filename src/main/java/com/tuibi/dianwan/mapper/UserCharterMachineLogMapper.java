package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UserCharterMachineLog;
import com.tuibi.dianwan.entity.UserCharterMachineLogExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserCharterMachineLogMapper extends BaseMapper<UserCharterMachineLog> {
    long countByExample(UserCharterMachineLogExample example);

    int deleteByExample(UserCharterMachineLogExample example);

    List<UserCharterMachineLog> selectByExample(UserCharterMachineLogExample example);

    int updateByExampleSelective(@Param("record") UserCharterMachineLog record, @Param("example") UserCharterMachineLogExample example);

    int updateByExample(@Param("record") UserCharterMachineLog record, @Param("example") UserCharterMachineLogExample example);
}