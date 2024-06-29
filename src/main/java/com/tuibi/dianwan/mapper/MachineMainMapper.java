package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.MachineMain;
import com.tuibi.dianwan.entity.MachineMainExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MachineMainMapper extends BaseMapper<MachineMain> {
    long countByExample(MachineMainExample example);

    int deleteByExample(MachineMainExample example);

    List<MachineMain> selectByExample(MachineMainExample example);

    int updateByExampleSelective(@Param("record") MachineMain record, @Param("example") MachineMainExample example);

    int updateByExample(@Param("record") MachineMain record, @Param("example") MachineMainExample example);
}