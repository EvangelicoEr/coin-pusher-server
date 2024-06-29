package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.UserCharterMachineLog;
import com.tuibi.dianwan.mapper.UserCharterMachineLogMapper;
import com.tuibi.dianwan.service.UserCharterMachineLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
public class UserCharterMachineLogServiceImpl implements UserCharterMachineLogService {

    @Autowired
    private UserCharterMachineLogMapper userCharterMachineLogMapper;

    @Override
    public int insertUserCharterMachineLog(UserCharterMachineLog userCharterMachineLog) {
        return userCharterMachineLogMapper.insertSelective(userCharterMachineLog);
    }

}
