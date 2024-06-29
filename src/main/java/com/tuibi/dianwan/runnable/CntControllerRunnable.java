package com.tuibi.dianwan.runnable;

import com.tuibi.common.juc.thread.runnable.BaseRunnable;

/**
 * @author: xx
 * 
 * @email: 
 */
public abstract class CntControllerRunnable extends BaseRunnable {

    private int cnt;
    private int limit;

    public CntControllerRunnable(int limit) {
        this.cnt = limit;
        this.limit = limit;
    }

    @Override
    public void run() {
        if(cnt <= 0) {
            exceededLimitOfTimes();
            return;
        }
        super.run();
        cnt--;
    }

    protected abstract void exceededLimitOfTimes();

    protected void reset() {
        cnt = limit;
    }

    public void reset(int mulitple) {
        cnt = limit * mulitple;
    }
}
