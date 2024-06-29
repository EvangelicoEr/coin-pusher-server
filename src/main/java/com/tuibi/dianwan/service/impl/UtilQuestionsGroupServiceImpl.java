package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.UtilQuestionsGroup;
import com.tuibi.dianwan.mapper.UtilQuestionsGroupMapper;
import com.tuibi.dianwan.service.UtilQuestionsGroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

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
public class UtilQuestionsGroupServiceImpl implements UtilQuestionsGroupService {

    @Autowired
    private UtilQuestionsGroupMapper utilQuestionsGroupMapper;

    @Override
    @Cacheable(value = "FOREVER", key = "'getAllQuestionsGroup'")
    public List<UtilQuestionsGroup> getAllQuestionsGroup() {
        return utilQuestionsGroupMapper.selectAll().stream()
                .sorted(Comparator.comparingInt(UtilQuestionsGroup::getSort)).collect(Collectors.toList());
    }

    @Override
    @CacheEvict(value = "FOREVER", key = "'getAllQuestionsGroup'")
    public void clearQuestionsGroupCache() {

    }
}
