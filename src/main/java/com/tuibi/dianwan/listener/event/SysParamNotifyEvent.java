package com.tuibi.dianwan.listener.event;

import com.tuibi.dianwan.entity.SysParam;
import org.springframework.context.ApplicationEvent;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public class SysParamNotifyEvent extends ApplicationEvent {

    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    private List<SysParam> systemParamModelList;
    public SysParamNotifyEvent(String userCode, List<SysParam> systemParamModelList) {
        super(userCode);
        this.systemParamModelList = systemParamModelList;
    }

    public List<SysParam> getSystemParamModelList() {
        return systemParamModelList;
    }
}
