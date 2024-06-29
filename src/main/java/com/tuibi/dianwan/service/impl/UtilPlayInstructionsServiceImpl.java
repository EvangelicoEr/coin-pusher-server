package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.UtilPlayInstructions;
import com.tuibi.dianwan.mapper.UtilPlayInstructionsMapper;
import com.tuibi.dianwan.service.UtilPlayInstructionsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
@Slf4j
public class UtilPlayInstructionsServiceImpl implements UtilPlayInstructionsService {

    @Autowired
    private UtilPlayInstructionsMapper utilPlayInstructionsMapper;

    @Override
    @Cacheable(value = "FOREVER", key = "'getMachinePlayInstructions-' + #machineId")
    public List<UtilPlayInstructions> getMachinePlayInstructions(String machineId) {
        return utilPlayInstructionsMapper.selectByCondition(Condition.builder(UtilPlayInstructions.class).where(
                Sqls.custom().andEqualTo("machineId", machineId)
        ).build()).stream().sorted(Comparator.comparingInt(UtilPlayInstructions::getInstructionsSort))
                .collect(Collectors.toList());
    }

    @Override
    @CacheEvict(value = "FOREVER", key = "'getMachinePlayInstructions-' + #machineId")
    public void clearMachinePlayInstructionsCache(String machineId) {

    }
}
