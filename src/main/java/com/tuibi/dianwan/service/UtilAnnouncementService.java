package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UtilAnnouncement;
import com.tuibi.dianwan.vo.WinningAnnouncementResp;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 * 中将公告
 */
public interface UtilAnnouncementService {

    List<WinningAnnouncementResp> getWinningAnnouncement();

    void clearWinningAnnouncementCache();
}
