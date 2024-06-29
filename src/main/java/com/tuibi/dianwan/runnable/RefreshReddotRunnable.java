package com.tuibi.dianwan.runnable;

import com.tuibi.dianwan.enums.RedDotTypeEnum;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.common.juc.thread.runnable.BaseRunnable;

/**
 * @author: xx
 * 
 * @email: 
 */
public class RefreshReddotRunnable extends BaseRunnable {

    private DianwanUserLoginInfo DianwanUserLoginInfo;
    public RefreshReddotRunnable(DianwanUserLoginInfo DianwanUserLoginInfo) {
        this.DianwanUserLoginInfo = DianwanUserLoginInfo;
    }

    @Override
    public String getName() {
        return "刷新玩家红点任务-" + DianwanUserLoginInfo.getUserCode();
    }

    @Override
    public void execute() {
        RedDotTypeEnum.refreshEveryDay(DianwanUserLoginInfo);
    }
}
