package com.tuibi.dianwan.runnable;

import com.tuibi.dianwan.nio.PlayerSessionManager;
import com.tuibi.proto.Protocol;
import com.tuibi.common.juc.thread.ThreadManager;
import com.tuibi.common.juc.thread.runnable.BaseRunnable;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class SendMsgToAllPlayerRunnable extends BaseRunnable {
    private Protocol.Response resp;
    private List<String> userCodes;
    private Integer sendCnt;
    private Integer interval;
    public SendMsgToAllPlayerRunnable(Protocol.Response resp, List<String> userCodes, Integer sendCnt, Integer interval) {
        this.resp = resp;
        this.userCodes = userCodes;
        this.sendCnt = Optional.ofNullable(sendCnt).orElse(1);
        this.interval = Optional.ofNullable(interval).orElse(10);
    }
    @Override
    public String getName() {
        return "给所有玩家发送消息线程";
    }

    @Override
    public void execute() {
        if(CollectionUtils.isEmpty(userCodes))
            PlayerSessionManager.sendMsgAllUser(resp);
        else
            userCodes.parallelStream().map(PlayerSessionManager::getSession)
                    .filter(Objects::nonNull).forEach(session -> session.sendMsg(resp));
        if(--sendCnt > 0) {
            ThreadManager.scheduleCommonTask(this, interval, TimeUnit.SECONDS);
        }
    }
}
