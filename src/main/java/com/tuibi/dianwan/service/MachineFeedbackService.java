package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.TMachineFeedback;
import com.tuibi.dianwan.vo.MachineFeedbackInfoResp;

import java.util.List;

public interface MachineFeedbackService {

    List<TMachineFeedback> getMachineFeedback(String machineGroupId);

    void clearMachineFeedback(String machineGroupId);

    TMachineFeedback getMachineFeedbackById(String machineGroupId, Integer feedbackId);

    List<MachineFeedbackInfoResp> getMachineFeedbackResp(String machineId);
}
