package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.MachineGroup;
import com.tuibi.dianwan.mapper.MachineGroupMapper;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.MachineGroupService;
import com.tuibi.common.base.api.UserLoginInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
public class MachineGroupServiceImpl implements MachineGroupService {

    @Autowired
    private MachineGroupMapper machineGroupMapper;
    @Autowired
    private MachineGroupService machineGroupService;

    @Override
    public List<MachineGroup> getChannelAllMachineGroup(Integer channelId) {
        List<MachineGroup> allMachineGroup = machineGroupService.getAllMachineGroup();
        return allMachineGroup.stream().filter(group -> group.constainChannel(channelId)).collect(Collectors.toList());
    }

    @Override
    @Cacheable(value = "MONTH", key = "'getAllMachineGroup'")
    public List<MachineGroup> getAllMachineGroup() {
        List<MachineGroup> machineGroups = machineGroupMapper.selectByCondition(Condition.builder(MachineGroup.class).where(
                Sqls.custom().andEqualTo("zt", "2")).orderByAsc("groupOrder").build());
        return machineGroups;
    }

    @Override
    public MachineGroup getMachineGroupById(String groupId) {
        return machineGroupService.getAllMachineGroup().stream()
                .filter(group -> group.getGroupId().equals(groupId)).findFirst().orElse(null);
    }

    @Override
    @CacheEvict(value = "MONTH", key = "'getAllMachineGroup'")
    public void clearMachineGroupCache() {}

}
