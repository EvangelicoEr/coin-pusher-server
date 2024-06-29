package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.UtilSigninCumulative;
import com.tuibi.dianwan.mapper.UtilSigninCumulativeMapper;
import com.tuibi.dianwan.service.UtilSigninCumulativeService;
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
public class UtilSigninCumulativeServiceImpl implements UtilSigninCumulativeService {

    @Autowired
    private UtilSigninCumulativeMapper utilSigninCumulativeMapper;
    @Autowired
    private UtilSigninCumulativeService utilSigninCumulativeService;

    @Override
    @Cacheable(value = "FOREVER", key = "'getAllSigninCumulative'")
    public List<UtilSigninCumulative> getAllSigninCumulative() {
        return utilSigninCumulativeMapper.selectAll().stream()
                .sorted(Comparator.comparingInt(UtilSigninCumulative::getCumulativeTime)).collect(Collectors.toList());
    }

    @Override
    @CacheEvict(value = "FOREVER", key = "'getAllSigninCumulative'")
    public void clearAllSigninCumulativeCache() {

    }

    @Override
    public int getTotSigninDay() {
        return utilSigninCumulativeService.getAllSigninCumulative().size();
    }

    @Override
    public UtilSigninCumulative getSigninCumulativeByDay(Integer dayNum) {
        List<UtilSigninCumulative> allSigninCumulative = utilSigninCumulativeService.getAllSigninCumulative();
        if(allSigninCumulative.size() >= dayNum) {
            return allSigninCumulative.get(dayNum - 1);
        }
        return null;
    }
}
