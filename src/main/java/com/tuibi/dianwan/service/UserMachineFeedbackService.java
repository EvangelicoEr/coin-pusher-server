package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.TUserMachineFeedback;
import com.tuibi.dianwan.entity.UserMachineRepairLog;
import com.tuibi.dianwan.pojo.UserMachineFeedbackReq;

import java.util.List;

public interface UserMachineFeedbackService {

    void userFeedback(UserMachineFeedbackReq req);

    int batchInsertUserFeedback(List<TUserMachineFeedback> userMachineFeedbacks);

    int batchInsertUserMachineRepair(List<UserMachineRepairLog> userMachineFeedbacks);
}
