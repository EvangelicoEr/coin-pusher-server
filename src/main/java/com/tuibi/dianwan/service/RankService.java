package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UtilInitData;
import com.tuibi.dianwan.vo.RankGroupResp;
import com.tuibi.dianwan.vo.RankUserInfoResp;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface RankService {

    List<RankUserInfoResp> getRankList(String groupId);

    List<UtilInitData> getRankRewards();

    RankGroupResp getRankGroup();
}
