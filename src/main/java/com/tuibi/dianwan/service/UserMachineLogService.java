package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UserMachineLog;
import com.tuibi.dianwan.pojo.PlayGameRecordQueryReq;
import com.tuibi.dianwan.vo.PlayGameRecordInfoResp;
import com.tuibi.dianwan.vo.RankUserInfoResp;
import com.tuibi.common.base.api.PageInfo;

import java.util.List;
import java.util.Set;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UserMachineLogService {

    int insertUserMachineLogSelective(UserMachineLog userMachineLog);

    int updateMachineLogTuiBiNum(String logId, Integer num, Integer logDown);

    int updateMachineGrantNum(String logId, Integer num);

    int updateMachineLogSelectiveByPk(UserMachineLog userMachineLog);

    UserMachineLog getLastMachineLogRecord(String machineId, String userCode);

    int updateSettlementLogRecord(UserMachineLog userMachineLog);

    List<RankUserInfoResp> getMachineConsumptionRanking(String groupId, Integer rankType, Set<String> machineIds);

    List<RankUserInfoResp> getMachineRanking(Set<String> machineIds, int topNum,
                                             String stime, String etime, int type);
    /**
     * 查询游戏记录
     * @param req
     * @return
     */
    PageInfo<PlayGameRecordInfoResp> getPlayerGameRecordInfoList(PlayGameRecordQueryReq req);
}
