package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UserCharterMachine;
import com.tuibi.dianwan.entity.UserCharterMachineExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserCharterMachineMapper extends BaseMapper<UserCharterMachine> {
    long countByExample(UserCharterMachineExample example);

    int deleteByExample(UserCharterMachineExample example);

    List<UserCharterMachine> selectByExample(UserCharterMachineExample example);

    int updateByExampleSelective(@Param("record") UserCharterMachine record, @Param("example") UserCharterMachineExample example);

    int updateByExample(@Param("record") UserCharterMachine record, @Param("example") UserCharterMachineExample example);

    int addUserCostLost(@Param("userCode") String userCode, @Param("machineId") String machineId, @Param("costValue") Integer costValue);

    int addUserCostGet(@Param("userCode") String userCode, @Param("machineId") String machineId, @Param("getValue") Integer getValue);
}