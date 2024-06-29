package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.UtilInitData;
import com.tuibi.dianwan.mapper.UtilInitDataMapper;
import com.tuibi.dianwan.service.UtilInitDataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
@Slf4j
public class UtilInitDataServiceImpl implements UtilInitDataService {

    @Autowired
    private UtilInitDataMapper utilInitDataMapper;
    @Autowired
    private UtilInitDataService utilInitDataService;


    @Override
    @Cacheable(value = "FOREVER", key = "'getInitDataById-' + #initId")
    public UtilInitData getInitDataById(Integer initId) {
        return utilInitDataMapper.selectByPrimaryKey(initId);
    }

    @Override
    @CacheEvict(value = "FOREVER", key = "'getInitDataById-' + #initId")
    public void clearInitDataCache(Integer initId) {

    }

}
