package com.tuibi.dianwan.listener;

import com.tuibi.dianwan.life.DwcSystemLifeCycle;
import com.tuibi.common.juc.thread.ThreadManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 * spring启动完成listener
 */
@Component
public class ApplicationReadyListener implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private List<DwcSystemLifeCycle> lifeCycleList;
    private static final Logger logger = LoggerFactory.getLogger(ApplicationReadyListener.class);

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        
        applicationStart();
        applicationStop();
    }

    private void applicationStart() {
        lifeCycleList.forEach(DwcSystemLifeCycle::start);
    }

    private void applicationStop() {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            
            lifeCycleList.forEach(DwcSystemLifeCycle::down);
            
            ThreadManager.systemStop();
        }));
    }
}
