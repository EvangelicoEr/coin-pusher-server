package com.tuibi.dianwan.runnable;

import com.alibaba.fastjson.JSON;
import com.tuibi.dianwan.config.CustomProperties;
import com.tuibi.dianwan.pojo.MachineFeedbackNotifyReq;
import com.tuibi.dianwan.util.HttpUtils;
import com.tuibi.common.juc.thread.runnable.BaseRunnable;
import com.tuibi.common.util.SpringContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.Assert;

@Slf4j
public class MachineFeedbackNotifyRunnable extends BaseRunnable {

    private MachineFeedbackNotifyReq req;
    public MachineFeedbackNotifyRunnable(MachineFeedbackNotifyReq req) {
        Assert.notNull(req);
        this.req = req;
    }

    @Override
    public String getName() {
        return "玩家反馈机器异常通知线程..." + req;
    }

    @Override
    public void execute() {
        String machineFeedbackNotifyUrl = SpringContextHolder.getBean(CustomProperties.class).getMachineFeedbackNotifyUrl();
        if(StringUtils.isBlank(machineFeedbackNotifyUrl)) {
            
            return;
        }
        try {
            String notifyResult = HttpUtils.httpPostWithJSON(machineFeedbackNotifyUrl,
                    JSON.toJSONString(req), null);
            
        } catch (Exception e) {
            
        }
    }
}
