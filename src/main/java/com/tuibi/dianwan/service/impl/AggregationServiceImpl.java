package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.config.SysParamDictConfig;
import com.tuibi.dianwan.entity.MachineGroup;
import com.tuibi.dianwan.entity.MachineMain;
import com.tuibi.dianwan.entity.UserMachineGame;
import com.tuibi.dianwan.pojo.RobotInfo;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.*;
import com.tuibi.dianwan.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
public class AggregationServiceImpl implements AggregationService {

    @Autowired
    private MachineMainService machineMainService;
    @Autowired
    private MachineGroupService machineGroupService;
    @Autowired
    private UserMachineGameService userMachineGameService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private LoadRobotInfoConfigServiceImpl loadRobotInfoConfig;

    private static final Comparator<MachineMainGroupResp> FIND_EMPTY_COMPARATOR = new Comparator<MachineMainGroupResp>() {
        @Override
        public int compare(MachineMainGroupResp o1, MachineMainGroupResp o2) {
            if (o1.getGroupStatus().equals(o2.getGroupStatus())) {
                return o1.getOrder().compareTo(o2.getOrder());
            }
            return o2.getGroupStatus().compareTo(o1.getGroupStatus());
        }
    };

    @Override
    public List<MachineGroupResp> getAllMachineGroupResp() {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        List<MachineGroup> allMachineGroup = machineGroupService.getChannelAllMachineGroup(DianwanUserLoginInfo.getUserInfo().getChannelId());
        return allMachineGroup.stream().map(group -> {
            MachineGroupResp resp = new MachineGroupResp();
            resp.setGroupId(group.getGroupId());
            resp.setGroupIcon(group.getGroupLogo());
            resp.setGroupName(group.getGroupName());
            resp.setGroupType(group.getGroupType());
            return resp;
        }).collect(Collectors.toList());
    }

    @Override
    public List<MachineMainGroupResp> getMachineMainByGroup(String groupId, int findEmpty) {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        List<MachineMain> machineMains = machineMainService.getMachineByGroup(groupId, DianwanUserLoginInfo.getUserInfo().getChannelId());
        if(machineMains.isEmpty()) {
            return Collections.emptyList();
        }
        List<String> matchineIds = new ArrayList<>();
        for(Iterator<MachineMain> iterator = machineMains.iterator(); iterator.hasNext(); ) {
            MachineMain machineMain = iterator.next();
            matchineIds.add(machineMain.getMachineId());
        }
        Map<String, List<UserMachineGame>> groupUserMachineGame = userMachineGameService.getGroupUserMachineGameByMachineId(matchineIds, new String[]{"userCode", "machineId", "isGame"});
        Set<String> userCodes = groupUserMachineGame.entrySet().stream().map(Map.Entry::getValue)
                .flatMap(List::stream).map(UserMachineGame::getUserCode).collect(Collectors.toSet());
        final Map<String, UserSimpleInfoResp> userHeadPicInfo = userCodes.isEmpty() ? Collections.emptyMap() : userInfoService.getUserHeadPicInfo(userCodes);

        List<MachineMainGroupResp> machineGroupList = new ArrayList<>();
        Map<Integer, MachineMainGroupResp> machineGroupMap = new LinkedHashMap<>();
        for(MachineMain machineMain : machineMains) {
            MachineMainResp resp = new MachineMainResp();
            resp.setMachineId(machineMain.getMachineId());
            resp.setMachineIcon(machineMain.getMachineDetailImg());
            resp.setMachineName(machineMain.getMachineName());
            resp.setPrice(machineMain.getMachinePrice());
            resp.setPosition(machineMain.getMachinePosition());
            resp.setStatus(machineMain.getZt());
            resp.setEntryRestrictionMoney(machineMain.getMachineEntryCost());
            resp.setNeedMinViplevel(machineMain.getMemberLevel());
            resp.setMachineType(machineMain.getMachineType());
            resp.setChildType(machineMain.getMachineTypes());
            List<UserMachineGame> userMachineGames = groupUserMachineGame.get(machineMain.getMachineId());
            if (userMachineGames != null) {
                List<String> watchPlayerHeadPic = new ArrayList<>();
                for (UserMachineGame userMachineGame : userMachineGames) {
                    if ("1".equals(userMachineGame.getIsGame())) {
                        Optional.ofNullable(userHeadPicInfo.get(userMachineGame.getUserCode()))
                                .map(UserSimpleInfoResp::getHeadImg)
                                .ifPresent(resp::setPlayerUserIcon);
                        resp.setStatus("1");
                    } else {
                        Optional.ofNullable(userHeadPicInfo.get(userMachineGame.getUserCode()))
                                .map(UserSimpleInfoResp::getHeadImg)
                                .ifPresent(watchPlayerHeadPic::add);
                    }
                }
                resp.setWatchUserIcons(watchPlayerHeadPic);
            } else {
                resp.setWatchUserIcons(Collections.emptyList());
            }
            MachineMainGroupResp mainGroupResp = machineGroupMap.get(machineMain.getMachineGroupNum());
            if(mainGroupResp == null) {
                mainGroupResp = new MachineMainGroupResp();
                machineGroupMap.put(machineMain.getMachineGroupNum(), mainGroupResp);
                mainGroupResp.setOrder(machineMain.getMachineOrder());
            }
            if(!mainGroupResp.isMultiplePrice() && machineMain.openMultiplePrices()) {
                mainGroupResp.setMultiplePrice(true);
            }
            mainGroupResp.addMachine(resp);
        }
        for(Iterator<Map.Entry<Integer, MachineMainGroupResp>> iterator = machineGroupMap.entrySet().iterator(); iterator.hasNext(); ) {
            machineGroupList.add(iterator.next().getValue().machineSort());
        }
        if(findEmpty == 1) {
            machineGroupList.sort(FIND_EMPTY_COMPARATOR);
        }
        return machineGroupList;
    }

    @Override
    public List<UserPlayMachineInfoResp> getUserPlayMachineList() {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        List<UserMachineGame> recentlyPlayUserMachineGameList = userMachineGameService
                .getRecentlyPlayUserMachineGameList(DianwanUserLoginInfo.getUserInfo().getChannelId());
        List<UserPlayMachineInfoResp> respList;
        if(recentlyPlayUserMachineGameList.isEmpty()) {
            respList = new ArrayList<>();
        } else {
            Map<String, UserSimpleInfoResp> userHeadPicInfo = userInfoService.getUserHeadPicInfo(recentlyPlayUserMachineGameList.stream().map(UserMachineGame::getUserCode).collect(Collectors.toSet()));
            respList = recentlyPlayUserMachineGameList.stream().filter(userMachineGame -> userHeadPicInfo.containsKey(userMachineGame.getUserCode())).map(userMachineGame -> {
                UserPlayMachineInfoResp resp = new UserPlayMachineInfoResp();
                UserSimpleInfoResp userSimpleInfoResp = userHeadPicInfo.get(userMachineGame.getUserCode());
                resp.setNickname(userSimpleInfoResp.getNickname());
                resp.setHeadPic(userSimpleInfoResp.getHeadImg());
                resp.setMachineId(userMachineGame.getMachineId());
                return resp;
            }).collect(Collectors.toList());
        }
        int minCnt = SysParamDictConfig.getInstance().getIndexMinLookPlayerCnt();
        if(respList.size() < minCnt) {
            List<MachineGroup> allMachineGroup = machineGroupService.getChannelAllMachineGroup(DianwanUserLoginInfo.getChannelId());
            List<MachineMain> randomMachineMains = new ArrayList<>();
            for(MachineGroup machineGroup : allMachineGroup) {
                List<MachineMain> machineMains = machineMainService.getMachineByGroup(machineGroup.getGroupId(), DianwanUserLoginInfo.getChannelId());
                for(MachineMain machineMain : machineMains) {
                    if(!machineMain.getZt().equals("2")) continue;
                    randomMachineMains.add(machineMain);
                }
            }
            if(!randomMachineMains.isEmpty()) {
                Collections.shuffle(randomMachineMains);
                List<RobotInfo> robotInfos = loadRobotInfoConfig.randomRobotInfo(minCnt);
                int len = Math.min(robotInfos.size() - respList.size(), randomMachineMains.size());
                for (int i = 0; i < len; i++) {
                    UserPlayMachineInfoResp machineInfoResp = new UserPlayMachineInfoResp();
                    machineInfoResp.setMachineId(randomMachineMains.get(i).getMachineId());
                    machineInfoResp.setNickname(robotInfos.get(i).getNickName());
                    machineInfoResp.setHeadPic(robotInfos.get(i).getHeadImg());
                    respList.add(machineInfoResp);
                }
            }
        }
        return respList;
    }

}
