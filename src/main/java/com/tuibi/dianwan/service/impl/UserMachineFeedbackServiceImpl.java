package com.tuibi.dianwan.service.impl;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.tuibi.dianwan.entity.MachineMain;
import com.tuibi.dianwan.entity.TMachineFeedback;
import com.tuibi.dianwan.entity.TUserMachineFeedback;
import com.tuibi.dianwan.entity.UserMachineRepairLog;
import com.tuibi.dianwan.enums.AccessMarkEnum;
import com.tuibi.dianwan.life.DwcSystemLifeCycle;
import com.tuibi.dianwan.mapper.TUserMachineFeedbackMapper;
import com.tuibi.dianwan.mapper.UserMachineRepairLogMapper;
import com.tuibi.dianwan.pojo.MachineFeedbackNotifyReq;
import com.tuibi.dianwan.pojo.UserAccessMark;
import com.tuibi.dianwan.pojo.UserMachineFeedbackReq;
import com.tuibi.dianwan.runnable.MachineFeedbackNotifyRunnable;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.AccessService;
import com.tuibi.dianwan.service.MachineFeedbackService;
import com.tuibi.dianwan.service.MachineMainService;
import com.tuibi.dianwan.service.UserMachineFeedbackService;
import com.google.common.collect.Lists;
import com.robert.vesta.service.intf.IdService;
import com.tuibi.common.base.error.BizException;
import com.tuibi.common.base.model.ResultCode;
import com.tuibi.common.juc.queue.QueueManagerFactory;
import com.tuibi.common.juc.queue.ResizeLinkedBlockingQueue;
import com.tuibi.common.juc.thread.ThreadManager;
import com.tuibi.common.juc.thread.runnable.BaseRunnable;
import com.tuibi.common.juc.timer.Timeout;
import com.tuibi.common.juc.timer.TimerTask;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Slf4j
@Service
public class UserMachineFeedbackServiceImpl implements UserMachineFeedbackService, DwcSystemLifeCycle, TimerTask {

    @Autowired
    private TUserMachineFeedbackMapper userMachineFeedbackMapper;
    @Autowired
    private UserMachineRepairLogMapper userMachineRepairLogMapper;
    @Autowired
    private MachineMainService machineMainService;
    @Autowired
    private MachineFeedbackService machineFeedbackService;
    @Autowired
    private IdService idService;
    @Autowired
    private AccessService accessService;
    private ResizeLinkedBlockingQueue<UserMachineRepairLog> userMachineFeedbackQueue = QueueManagerFactory.createQueue(ResizeLinkedBlockingQueue.class,
            2000, "usermachine-feedback", true);

    @Override
    public void userFeedback(UserMachineFeedbackReq req) {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        UserAccessMark access = accessService.getHalfOneMinAccessMark(AccessMarkEnum.USER_MACHINE_FEEDBACK, DianwanUserLoginInfo.getUserCode());
        if(!access.canAccess())
            throw new BizException(ResultCode.FAIL, "反馈频繁,请稍后再试!");
        MachineMain machineMain = machineMainService.getMachineMainById(req.getMachineId());
        if(machineMain == null)
            throw new BizException(ResultCode.FAIL, "反馈机器不存在!");
        TMachineFeedback machineFeedback = machineFeedbackService.getMachineFeedbackById(machineMain.getGroupId(), req.getFeedbackId());
        if(machineFeedback == null)
            throw new BizException(ResultCode.FAIL, "反馈类型不存在!");









        UserMachineRepairLog userMachineFeedback = new UserMachineRepairLog();
        userMachineFeedback.setLogId(String.valueOf(idService.genId()));
        userMachineFeedback.setMachineId(machineMain.getMachineId());
        userMachineFeedback.setUserId(DianwanUserLoginInfo.getUserId());
        userMachineFeedback.setUserContext(machineFeedback.getContent());
        userMachineFeedback.setBz(machineFeedback.getId().toString());
        userMachineFeedback.setMachineName(machineMain.getMachineName());
        String curTimestr = LocalDateTimeUtil.formatNormal(LocalDateTime.now());
        userMachineFeedback.setLrsj(curTimestr);
        userMachineFeedback.setGxsj(curTimestr);
        userMachineFeedback.setZt("2");
        userMachineFeedback.setLrzh(DianwanUserLoginInfo.getUserCode());
        userMachineFeedback.setJixiuAccount(machineMain.getJixiuAccount());
        boolean ret = userMachineFeedbackQueue.add(userMachineFeedback);
        
                machineMain.getMachineId(), machineMain.getMachineName(), machineFeedback.getContent());
        
        String jixiuOpenids = machineMain.getJixiuAccount();
        if(StringUtils.isNotBlank(jixiuOpenids)) {
            String[] notifyUsers = jixiuOpenids.split(",");
            for(String openid : notifyUsers) {
                MachineFeedbackNotifyReq notifyReq = new MachineFeedbackNotifyReq();
                notifyReq.setOpenId(openid);
                notifyReq.setNote(DianwanUserLoginInfo.getUserInfo().getNickname());
                notifyReq.setCreateTime(curTimestr);
                notifyReq.setDeviceModel(machineMain.getMachineNumber());
                notifyReq.setDeviceName(machineMain.getMachineName());
                notifyReq.setFaultReason(machineFeedback.getContent());
                ThreadManager.executeIoTask(new MachineFeedbackNotifyRunnable(notifyReq));
            }
        }
        if(!ret)
            throw new BizException(ResultCode.FAIL, "反馈人数过多,请稍后再试!");
    }

    @Override
    public int batchInsertUserFeedback(List<TUserMachineFeedback> userMachineFeedbacks) {
        return userMachineFeedbackMapper.insertList(userMachineFeedbacks);
    }

    @Override
    public int batchInsertUserMachineRepair(List<UserMachineRepairLog> userMachineFeedbacks) {
        return userMachineRepairLogMapper.insertList(userMachineFeedbacks);
    }

    private void run0() {
        if(!userMachineFeedbackQueue.isEmpty()) {
            int drainToSize = userMachineFeedbackQueue.size();
            ArrayList<UserMachineRepairLog> userMachineFeedbacks = Lists.newArrayListWithCapacity(drainToSize);
            int insCnt = userMachineFeedbackQueue.drainTo(userMachineFeedbacks, drainToSize);
            if(insCnt > 0) {
                ThreadManager.executeIoDBTask(new BaseRunnable() {
                    @Override
                    public void execute() {
                        int batchInsCnt = batchInsertUserMachineRepair(userMachineFeedbacks);
                        if(batchInsCnt > 0)
                            
                    }

                    @Override
                    public String getName() {
                        return "批量插入玩家反馈数据";
                    }
                });
            }
        }
    }

    @Override
    public void run(Timeout timeout) throws Exception {
        run0();
        ThreadManager.newFastTimeout(this, 10, TimeUnit.SECONDS);
    }

    @Override
    public void start() {
        ThreadManager.newFastTimeout(this, 20, TimeUnit.SECONDS);
    }

    @Override
    public void down() {
        run0();
    }
}
