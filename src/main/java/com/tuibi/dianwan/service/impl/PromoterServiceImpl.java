package com.tuibi.dianwan.service.impl;

import com.alibaba.fastjson.JSON;
import com.tuibi.dianwan.config.CustomProperties;
import com.tuibi.dianwan.service.PromoterService;
import com.tuibi.dianwan.util.HttpUtils;
import com.tuibi.common.juc.thread.ThreadManager;
import com.tuibi.common.juc.thread.runnable.BaseRunnable;
import com.tuibi.common.util.SpringContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.util.Map;

@Slf4j
@Service
public class PromoterServiceImpl implements PromoterService {

    @Autowired
    private CustomProperties customProperties;

    @Override
    public void notifyBackend(Map<String, Object> parame) {
        ThreadManager.executeIoTask(new BaseRunnable() {
            @Override
            public void execute() {
                try {
                    long sysTime = System.currentTimeMillis();
                    String url = SpringContextHolder.getBean(CustomProperties.class).getAdminDomain();
                    parame.put("sign", new String(DigestUtils.md5Digest((customProperties.getAdminKey() + sysTime).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8));
                    parame.put("time", sysTime);
                    String reqJson = JSON.toJSONString(parame);
                    String httpResponse = HttpUtils.httpPostWithJSON(url + "/recommentWeb.do", reqJson, null);
                    
                } catch (Exception e) {
                    
                } finally {
                    
                }
            }

            @Override
            public String getName() {
                return "推广员系统推送线程";
            }
        });
    }

}
