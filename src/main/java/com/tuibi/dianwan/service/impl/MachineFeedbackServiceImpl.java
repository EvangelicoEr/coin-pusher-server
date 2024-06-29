package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.MachineMain;
import com.tuibi.dianwan.entity.TMachineFeedback;
import com.tuibi.dianwan.mapper.TMachineFeedbackMapper;
import com.tuibi.dianwan.service.MachineFeedbackService;
import com.tuibi.dianwan.service.MachineMainService;
import com.tuibi.dianwan.vo.MachineFeedbackInfoResp;
import com.tuibi.common.base.error.BizException;
import com.tuibi.common.base.model.ResultCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class MachineFeedbackServiceImpl implements MachineFeedbackService {

    @Autowired
    private TMachineFeedbackMapper machineFeedbackMapper;
    @Autowired
    private MachineFeedbackService machineFeedbackService;
    @Autowired
    private MachineMainService machineMainService;

    @Override
    @Cacheable(value = "FOREVER", key = "'getMachineFeedback-' + #machineGroupId")
    public List<TMachineFeedback> getMachineFeedback(String machineGroupId) {
        if(machineGroupId == null) return Collections.emptyList();
        List<TMachineFeedback> machineFeedbacks = machineFeedbackMapper.selectByCondition(Condition.builder(TMachineFeedback.class).where(
                Sqls.custom().andEqualTo("machineGroupId", machineGroupId)
                        .andEqualTo("del", false)
        ).build());
        return machineFeedbacks.stream().sorted(Comparator.comparingInt(TMachineFeedback::getSortNum))
                .collect(Collectors.toList());
    }

    @Override
    @CacheEvict(value = "FOREVER", key = "'getMachineFeedback-' + #machineGroupId")
    public void clearMachineFeedback(String machineGroupId) {

    }

    @Override
    public TMachineFeedback getMachineFeedbackById(String machineGroupId, Integer feedbackId) {
        List<TMachineFeedback> machineFeedback = machineFeedbackService.getMachineFeedback(machineGroupId);
        return machineFeedback.stream().filter(feedback -> feedback.getId().equals(feedbackId))
                .findFirst().orElse(null);
    }

    @Override
    public List<MachineFeedbackInfoResp> getMachineFeedbackResp(String machineId) {
        MachineMain machineMain = machineMainService.getMachineMainById(machineId);
        if(machineMain == null) {
            throw new BizException(ResultCode.FAIL, "机器不存在!");
        }
        List<TMachineFeedback> machineFeedbackResp = machineFeedbackService.getMachineFeedback(machineMain.getGroupId());
        if(machineFeedbackResp.isEmpty()) return Collections.emptyList();
        return machineFeedbackResp.stream().map(feedback -> {
            MachineFeedbackInfoResp resp = new MachineFeedbackInfoResp();
            resp.setId(feedback.getId());
            resp.setContent(feedback.getContent());
            return resp;
        }).collect(Collectors.toList());
    }
}
