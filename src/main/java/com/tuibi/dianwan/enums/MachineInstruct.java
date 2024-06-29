package com.tuibi.dianwan.enums;

/**
 * @author: xx
 * 
 * @email: 
 * 机器操作指令
 */
public interface MachineInstruct {

    String getInstruct();

    int getType();

    String getDesc();

    default boolean refreshTime() {
        return true;
    }
}
