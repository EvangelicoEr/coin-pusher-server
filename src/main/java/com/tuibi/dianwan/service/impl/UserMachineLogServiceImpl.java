package com.tuibi.dianwan.service.impl;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.tuibi.dianwan.entity.MachineMain;
import com.tuibi.dianwan.entity.UserMachineLog;
import com.tuibi.dianwan.mapper.UserMachineLogMapper;
import com.tuibi.dianwan.pojo.PlayGameRecordQueryReq;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.MachineMainService;
import com.tuibi.dianwan.service.UserMachineLogService;
import com.tuibi.dianwan.vo.PlayGameRecordInfoResp;
import com.tuibi.dianwan.vo.RankUserInfoResp;
import com.github.pagehelper.PageHelper;
import com.tuibi.common.base.api.PageInfo;
import com.tuibi.common.base.util.PageInfoUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
@Slf4j
public class UserMachineLogServiceImpl implements UserMachineLogService {

    @Autowired
    private UserMachineLogMapper userMachineLogMapper;
    @Autowired
    private MachineMainService machineMainService;

    @Override
    public int insertUserMachineLogSelective(UserMachineLog userMachineLog) {
        if(userMachineLog == null) return 0;
        return userMachineLogMapper.insertSelective(userMachineLog);
    }

    @Override
    public int updateMachineLogTuiBiNum(String logId, Integer num, Integer logDown) {
        return userMachineLogMapper.updateMachineLogTuiBiNum(logId, num, logDown);
    }

    @Override
    public int updateMachineGrantNum(String logId, Integer num) {
        if(num == 0) return 1;
        return userMachineLogMapper.updateMachineGrantNum(logId, num);
    }

    @Override
    public int updateMachineLogSelectiveByPk(UserMachineLog userMachineLog) {
        if(userMachineLog == null || userMachineLog.getLogId() == null) return 0;
        return userMachineLogMapper.updateByPrimaryKeySelective(userMachineLog);
    }

    @Override
    public UserMachineLog getLastMachineLogRecord(String machineId, String userCode) {
        return userMachineLogMapper.getLastMachineLogRecord(machineId, userCode);
    }

    @Override
    public int updateSettlementLogRecord(UserMachineLog userMachineLog) {
        return userMachineLogMapper.updateByPrimaryKeySelective(userMachineLog);
    }

    @Override
    @Cacheable(value = "MOMENT", key = "'getMachineConsumptionRanking-' + #groupId")
    public List<RankUserInfoResp> getMachineConsumptionRanking(String groupId, Integer rankType, Set<String> machineIds) {
        if(machineIds == null || machineIds.isEmpty()) return Collections.emptyList();
        LocalDate today = LocalDate.now();
        LocalDateTime stime = LocalDateTime.of(today, LocalTime.MIN);
        LocalDateTime etime = LocalDateTime.of(today, LocalTime.MAX);
        return getMachineRanking(machineIds, 10,
                LocalDateTimeUtil.formatNormal(stime),
                LocalDateTimeUtil.formatNormal(etime), rankType);
    }

    @Override
    public List<RankUserInfoResp> getMachineRanking(Set<String> machineIds, int topNum, String stime, String etime, int type) {
        List<RankUserInfoResp> respList;
        if(type == 1) {
            respList = userMachineLogMapper.getMachineWinnerRanking(machineIds, topNum, stime, etime);
        } else {
            respList = userMachineLogMapper.getMachineConsumptionRanking(machineIds, topNum, stime, etime);
        }
        return respList.stream()
                .filter(resp -> resp.getIntegralNum() != null && resp.getIntegralNum() > 0)
                .collect(Collectors.toList());
    }

    @Override
    public PageInfo<PlayGameRecordInfoResp> getPlayerGameRecordInfoList(PlayGameRecordQueryReq req) {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        List<MachineMain> machineMainList = machineMainService.getMachineByGroup(req.getGroupId());
        if(machineMainList.isEmpty()) {
            return PageInfoUtil.emptyPageInfo();
        }
        PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<UserMachineLog> userMachineLogs = userMachineLogMapper.selectByCondition(Condition.builder(UserMachineLog.class).where(
                Sqls.custom().andEqualTo("zt", "0")
                        .andEqualTo("userCode", DianwanUserLoginInfo.getUserCode())
                        .andIn("machineId", machineMainList.stream().map(MachineMain::getMachineId).collect(Collectors.toList()))
        ).orderByDesc("lrsj").build());
        return PageInfoUtil.makePageInfo(userMachineLogs, machineLog -> {
            PlayGameRecordInfoResp resp = new PlayGameRecordInfoResp();
            resp.setId(machineLog.getLogId());
            resp.setMachineId(machineLog.getMachineId());
            resp.setMachineName(machineLog.getMachineName());
            resp.setStartTime(machineLog.getLrsj());
            resp.setEndTime(machineLog.getGxsj());
            resp.setInImg(machineLog.getInLogImg());
            resp.setOutImg(machineLog.getLogImg());
            resp.setConsumerMoney(machineLog.getLogToubiNum());
            resp.setWinMoney(machineLog.getIsGrant());

            return resp;
        });
    }
}
