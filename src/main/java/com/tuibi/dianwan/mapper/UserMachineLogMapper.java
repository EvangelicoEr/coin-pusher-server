package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UserMachineLog;
import com.tuibi.dianwan.entity.UserMachineLogExample;
import com.tuibi.dianwan.vo.RankUserInfoResp;
import com.tuibi.common.framework.mybatis.BaseMapper;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;

@Mapper
public interface UserMachineLogMapper extends BaseMapper<UserMachineLog> {
    long countByExample(UserMachineLogExample example);

    int deleteByExample(UserMachineLogExample example);

    List<UserMachineLog> selectByExample(UserMachineLogExample example);

    int updateByExampleSelective(@Param("record") UserMachineLog record, @Param("example") UserMachineLogExample example);

    int updateByExample(@Param("record") UserMachineLog record, @Param("example") UserMachineLogExample example);

    int updateMachineLogTuiBiNum(@Param("logId") String logId, @Param("num") Integer num, @Param("logDown") Integer logDown);

    int updateMachineGrantNum(@Param("logId") String logId, @Param("num") Integer num);

    UserMachineLog getLastMachineLogRecord(@Param("machineId") String machineId, @Param("userCode") String userCode);

    List<RankUserInfoResp> getMachineConsumptionRanking(@Param("mids") Set<String> machineIds, @Param("topNum") int topNum,
                                                  @Param("stime") String stime, @Param("etime") String etime);

    List<RankUserInfoResp> getMachineWinnerRanking(@Param("mids") Set<String> machineIds, @Param("topNum") int topNum,
                                                  @Param("stime") String stime, @Param("etime") String etime);

    BigDecimal getMachineCostByDay(@Param("userCode") String userCode);

    BigDecimal getMachineCostByWeek(@Param("userCode") String userCode);

    BigDecimal getMachineCostByMonth(@Param("userCode") String userCode);
}