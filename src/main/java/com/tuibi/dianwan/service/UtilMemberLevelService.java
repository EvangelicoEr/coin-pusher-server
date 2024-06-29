package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UtilMemberLevel;
import com.tuibi.dianwan.vo.MemberCenterInfoResp;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UtilMemberLevelService {

    List<UtilMemberLevel> getAllMemberLevel();

    void clearMemberLevelCache();

    UtilMemberLevel getMemberLevelById(Integer id);

    MemberCenterInfoResp getUserMemberCenterInfo();
}
