package com.tuibi.dianwan.service.impl;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.tuibi.dianwan.entity.*;
import com.tuibi.dianwan.enums.RewardSourceTypeEnum;
import com.tuibi.dianwan.listener.event.MachineVersionChangeEvent;
import com.tuibi.dianwan.listener.event.UserCharterMachineEvent;
import com.tuibi.dianwan.mapper.UserCharterMachineMapper;
import com.tuibi.dianwan.service.*;
import com.robert.vesta.service.intf.IdService;
import com.tuibi.common.util.SpringContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
@Slf4j
public class UserCharterMachineServiceImpl implements UserCharterMachineService {

    @Autowired
    private UserCharterMachineMapper userCharterMachineMapper;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserMachineLogService userMachineLogService;
    @Autowired
    private UserMachineGameService userMachineGameService;
    @Autowired
    private UserCharterMachineLogService userCharterMachineLogService;
    @Autowired
    private IdService idService;
    @Autowired
    private MachineMainService machineMainService;

    @Override
    public UserCharterMachine getUserCharterMachine(String machineId) {
        List<UserCharterMachine> machineList = userCharterMachineMapper.selectByCondition(Condition.builder(UserCharterMachine.class).where(
                Sqls.custom().andEqualTo("machineId", machineId)
        ).build());
        if(machineList.isEmpty()) return null;
        return machineList.get(0);
    }

    @Override
    public List<UserCharterMachine> getAllUserCharterMachine() {
        return userCharterMachineMapper.selectAll();
    }

    @Override
    public int addUserCostLost(String userCode, String machineId, Integer costValue) {
        return userCharterMachineMapper.addUserCostLost(userCode, machineId, costValue);
    }

    @Override
    public int addUserCostGet(String userCode, String machineId, Integer getValue) {
        if(getValue == 0) return 1;
        return userCharterMachineMapper.addUserCostGet(userCode, machineId, getValue);
    }

    @Override
    public int updateCharterMachineSelective(UserCharterMachine userCharterMachine, String machineId, String userCode) {
        if(userCharterMachine == null || machineId == null || userCode == null) return 0;
        return userCharterMachineMapper.updateByConditionSelective(userCharterMachine, Condition.builder(UserCharterMachine.class).where(
                Sqls.custom().andEqualTo("machineId", machineId)
                        .andEqualTo("userCode", Integer.parseInt(userCode))
        ).build());
    }

    @Override
    public void charterFlightEnd(String machineId, String userCode, String logCostId) {
        if(machineId == null || userCode == null) throw new NullPointerException("包机数据不能为空");
        UserCharterMachine userCharterMachine = getUserCharterMachine(machineId);
        if(userCharterMachine == null || !userCode.equals(userCharterMachine.getUserCode().toString())) return;
        int num = userCharterMachineMapper.deleteByPrimaryKey(userCharterMachine.getId());
        if(num < 1) {
            
            
            return;
        }


"玩家已不在游戏中! userCharterMachine: {}", userCharterMachine);


        String time = LocalDateTimeUtil.formatNormal(LocalDateTime.now());
        UserInfo userInfo = userInfoService.getUserInfo(userCharterMachine.getUserId());
        UserMachineLog settlementUserMachineLog = new UserMachineLog();
        settlementUserMachineLog.setLogId(logCostId);
        settlementUserMachineLog.setLogNum2(userInfo.getLastMoney());
        settlementUserMachineLog.setLogNum4(userInfo.getLastIntegral());
        settlementUserMachineLog.setBz(time);
        settlementUserMachineLog.setGxsj(time);
        int upSettlementLogCnt = userMachineLogService.updateSettlementLogRecord(settlementUserMachineLog);
        if(log.isDebugEnabled())
            
        int getNum = userCharterMachine.getSrcNum();
        if(userCharterMachine.getLastMoney() > getNum) {
            getNum = userCharterMachine.getLastMoney();
        }
        UserCharterMachineLog userCharterMachineLog = new UserCharterMachineLog();
        userCharterMachineLog.setId(idService.genId());
        userCharterMachineLog.setMachineId(userCharterMachine.getMachineId());
        userCharterMachineLog.setUserId(userCharterMachine.getUserId().toString());
        userCharterMachineLog.setLrsj(time);
        userCharterMachineLog.setRechargeId(userCharterMachine.getRechargeId());
        userCharterMachineLog.setIsGrand(0);
        userCharterMachineLog.setNum(getNum);
        userCharterMachineLog.setChannelId(userCharterMachine.getChannelId());
        userCharterMachineLog.setSrcNum(userCharterMachine.getSrcNum());
        userCharterMachineLog.setSrcCost(userInfo.getLastMoney());
        userCharterMachineLog.setDesCost(userCharterMachineLog.getSrcCost() + userCharterMachineLog.getNum());
        int insertUserCharterMachineLog = userCharterMachineLogService.insertUserCharterMachineLog(userCharterMachineLog);
        if(log.isDebugEnabled()) {
            
        }
        MachineMain machineMain = machineMainService.getMachineMainById(machineId);
        userInfoService.addMonetaryRewards(userCharterMachine.getUserCode().toString(), 2,
                "玩家包机(" + machineMain.getMachineName() + ")结算赢得奖励:" + getNum + "金币", getNum,
                userCharterMachineLog.getId().toString(), RewardSourceTypeEnum.CHARTERMACHINE_SETTLEMENT_REWARD);
        SpringContextHolder.publishEvent(new MachineVersionChangeEvent(machineId));
    }

    @Override
    public int insertUserCharterMachine(UserCharterMachine userCharterMachine) {
        int insertSelective = userCharterMachineMapper.insertSelective(userCharterMachine);
        if(insertSelective > 0) {
            SpringContextHolder.publishEvent(new UserCharterMachineEvent(userCharterMachine.getMachineId(), userCharterMachine.getUserCode().toString()));
        }
        return insertSelective;
    }
}
