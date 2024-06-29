package com.tuibi.dianwan.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: xx
 * 
 * @email: 
 */
@AllArgsConstructor
@Getter
public enum PlayerReqTypeEnum {
    LOGIN(100, "登录"),
    PING(101, "心跳包"),
    MACHINE_SCENE_MONITOR(102, "机器场景监听"),
    ;
    private int type;
    private String desc;
}
