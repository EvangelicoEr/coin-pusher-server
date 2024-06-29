package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.MachineGroup;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface MachineGroupService {

    List<MachineGroup> getChannelAllMachineGroup(Integer channelId);

    List<MachineGroup> getAllMachineGroup();

    MachineGroup getMachineGroupById(String groupId);

    void clearMachineGroupCache();
}
