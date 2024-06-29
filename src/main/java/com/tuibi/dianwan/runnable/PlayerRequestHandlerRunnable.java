package com.tuibi.dianwan.runnable;

import com.tuibi.dianwan.nio.PlayerSession;
import com.tuibi.dianwan.nio.player.PlayerHandler;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.proto.Protocol;
import com.tuibi.common.juc.thread.runnable.BaseRunnable;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: xx
 * 
 * @email: 
 */
@Slf4j
public class PlayerRequestHandlerRunnable extends BaseRunnable {

    private Protocol.Request request;
    private PlayerSession session;
    private PlayerHandler handler;
    public PlayerRequestHandlerRunnable(PlayerHandler handler, Protocol.Request request, PlayerSession session) {
        this.request = request;
        this.session = session;
        this.handler = handler;
    }

    @Override
    public String getName() {
        return "玩家消息处理线程";
    }

    @Override
    public void execute() {
        long start = System.currentTimeMillis();
        Protocol.Response response = handler.handlerRequest(session, request);
        if(response != null) {
            session.sendMsg(response);
        }
        long consumerTime = System.currentTimeMillis() - start;
        if(consumerTime > 50 || log.isDebugEnabled()) {
            
        }
    }

}
