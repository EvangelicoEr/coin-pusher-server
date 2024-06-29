package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.UtilAnnouncement;
import com.tuibi.dianwan.mapper.UtilAnnouncementMapper;
import com.tuibi.dianwan.service.UtilAnnouncementService;
import com.tuibi.dianwan.vo.WinningAnnouncementResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 * 中将公告
 */
@Service
public class UtilAnnouncementServiceImpl implements UtilAnnouncementService {

    @Autowired
    private UtilAnnouncementMapper utilAnnouncementMapper;

    @Override
    @Cacheable(value = "WEEK", key = "'getWinningAnnouncement'")
    public List<WinningAnnouncementResp> getWinningAnnouncement() {
        return utilAnnouncementMapper.getWinningAnnouncementList();
    }

    @Override
    @CacheEvict(value = "WEEK", key = "'getWinningAnnouncement'")
    public void clearWinningAnnouncementCache() {

    }
}
