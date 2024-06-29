package com.tuibi.dianwan.runnable;

import com.tuibi.dianwan.nio.PlayerSessionManager;
import com.tuibi.common.juc.thread.runnable.BaseRunnable;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: xx
 * 
 * @email: 
 */
@Slf4j
public class PlayerSessionCheckRunnable extends BaseRunnable {

    @Override
    public String getName() {
        return "玩家连接检测任务";
    }

    @Override
    public void execute() {
        PlayerSessionManager.checkSessionConnect();
    }
}
