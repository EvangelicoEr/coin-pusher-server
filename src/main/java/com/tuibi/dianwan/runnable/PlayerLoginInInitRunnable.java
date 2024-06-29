package com.tuibi.dianwan.runnable;

import com.tuibi.dianwan.listener.event.SysParamNotifyEvent;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.config.SysParamDictConfig;
import com.tuibi.common.juc.thread.ThreadManager;
import com.tuibi.common.juc.thread.runnable.BaseRunnable;
import com.tuibi.common.util.SpringContextHolder;
import org.springframework.util.Assert;

/**
 * @author: xx
 * 
 * @email: 
 */
public class PlayerLoginInInitRunnable extends BaseRunnable {

    private DianwanUserLoginInfo DianwanUserLoginInfo;
    public PlayerLoginInInitRunnable(DianwanUserLoginInfo DianwanUserLoginInfo) {
        this.DianwanUserLoginInfo = DianwanUserLoginInfo;
        Assert.notNull(DianwanUserLoginInfo);
    }

    @Override
    public String getName() {
        return "玩家登录初始化线程-" + DianwanUserLoginInfo.getUserCode();
    }

    @Override
    public void execute() {
        SpringContextHolder.publishEvent(new SysParamNotifyEvent(DianwanUserLoginInfo.getUserCode(), SysParamDictConfig.getInstance().getSendClientSystemParams()));
        ThreadManager.executeIoTask(new RefreshReddotRunnable(DianwanUserLoginInfo));
    }
}
