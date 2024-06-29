package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.config.SysParamDictConfig;
import com.tuibi.dianwan.entity.MachineGroup;
import com.tuibi.dianwan.entity.MachineMain;
import com.tuibi.dianwan.entity.UtilInitData;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.*;
import com.tuibi.dianwan.vo.RankGroupInfoResp;
import com.tuibi.dianwan.vo.RankGroupResp;
import com.tuibi.dianwan.vo.RankUserInfoResp;
import com.tuibi.dianwan.vo.UserSimpleInfoResp;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author: xx
 * 
 * @email: 
 * 排行榜
 */
@Service
@Slf4j
public class RankServiceImpl implements RankService {

    @Autowired
    private UtilInitDataService utilInitDataService;
    @Autowired
    private MachineGroupService machineGroupService;
    @Autowired
    private MachineMainService machineMainService;
    @Autowired
    private UserMachineLogService userMachineLogService;
    @Autowired
    private UserInfoService userInfoService;
    private static final List<Integer> rankConfigLists = Lists.newArrayList(501,502,503,504,505,506,507,508,509,510);

    @Override
    public List<RankUserInfoResp> getRankList(String groupId) {
        List<MachineMain> machineByGroup = machineMainService.getMachineByGroup(groupId);
        if(machineByGroup.isEmpty()) {
            return Collections.emptyList();
        }
        List<UtilInitData> initData = getRankRewards();
        if(initData.size() != rankConfigLists.size()) {
            
            return Collections.emptyList();
        }
        MachineGroup machineGroup = machineGroupService.getMachineGroupById(groupId);
        List<RankUserInfoResp> machineConsumptionRanking = userMachineLogService
                .getMachineConsumptionRanking(groupId, machineGroup.getRankType(),
                        machineByGroup.stream().map(MachineMain::getMachineId).collect(Collectors.toSet()));
        for(int i=0; i<machineConsumptionRanking.size(); i++) {
            RankUserInfoResp rankUserInfoResp = machineConsumptionRanking.get(i);
            rankUserInfoResp.setRewardNum(Integer.parseInt(initData.get(i).getInitKey()));
            UserSimpleInfoResp userSimpleInfo = userInfoService.getUserSimpleInfo(rankUserInfoResp.getUserCode());
            rankUserInfoResp.setUserId(userSimpleInfo.getUserId());
            rankUserInfoResp.setNickname(userSimpleInfo.getNickname());
            rankUserInfoResp.setHeadImg(userSimpleInfo.getHeadImg());
            rankUserInfoResp.setVipLevel(userSimpleInfo.getVipLevel());
            rankUserInfoResp.setVipIcon(userSimpleInfo.getVipIcon());
        }
        return machineConsumptionRanking;
    }

    @Override
    public List<UtilInitData> getRankRewards() {
        return rankConfigLists.stream().map(utilInitDataService::getInitDataById).collect(Collectors.toList());
    }

    @Override
    public RankGroupResp getRankGroup() {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        UtilInitData rankRuleData = utilInitDataService.getInitDataById(500);
        RankGroupResp resp = new RankGroupResp();
        if(rankRuleData != null)
            resp.setRuleDesc(rankRuleData.getInitKey());
        List<MachineGroup> allMachineGroup = machineGroupService.getChannelAllMachineGroup(DianwanUserLoginInfo.getChannelId());
        Set<String> ignoreRankMachineGroupIds = SysParamDictConfig.getInstance().getIgnoreRankMachineGroupIds();
        resp.setGroupList(allMachineGroup.stream().filter(group -> !ignoreRankMachineGroupIds.contains(group.getGroupId())).map(group -> {
            RankGroupInfoResp groupInfoResp = new RankGroupInfoResp();
            groupInfoResp.setName(group.getGroupName());
            groupInfoResp.setId(group.getGroupId());
            return groupInfoResp;
        }).collect(Collectors.toList()));
        return resp;
    }
}
