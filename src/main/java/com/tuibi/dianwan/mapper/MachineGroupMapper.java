package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.MachineGroup;
import com.tuibi.dianwan.entity.MachineGroupExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MachineGroupMapper extends BaseMapper<MachineGroup> {
    long countByExample(MachineGroupExample example);

    int deleteByExample(MachineGroupExample example);

    List<MachineGroup> selectByExample(MachineGroupExample example);

    int updateByExampleSelective(@Param("record") MachineGroup record, @Param("example") MachineGroupExample example);

    int updateByExample(@Param("record") MachineGroup record, @Param("example") MachineGroupExample example);
}