package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UtilPlayInstructions;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UtilPlayInstructionsService {
    /**
     * 获取机器玩法说明
     * @param machineId
     * @return
     */
    List<UtilPlayInstructions> getMachinePlayInstructions(String machineId);

    void clearMachinePlayInstructionsCache(String machineId);

}
