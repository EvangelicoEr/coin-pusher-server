package com.tuibi.dianwan.scheduled;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.tuibi.dianwan.config.SysParamDictConfig;
import com.tuibi.dianwan.entity.*;
import com.tuibi.dianwan.enums.RedDotTypeEnum;
import com.tuibi.dianwan.nio.PlayerSession;
import com.tuibi.dianwan.nio.PlayerSessionManager;
import com.tuibi.dianwan.service.*;
import com.tuibi.dianwan.vo.RankUserInfoResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: xx
 * 
 * @email: 
 */
@Component
@Slf4j
public class DailyScheduledTask {

    @Autowired
    private UserMachineLogService userMachineLogService;
    @Autowired
    private MachineGroupService machineGroupService;
    @Autowired
    private MachineMainService machineMainService;
    @Autowired
    private RankService rankService;
    @Autowired
    private UserMailService userMailService;
    @Autowired
    private UserInfoService userInfoService;

    
    @Scheduled(cron = "1 0 0 * * ?")
    public void runZeroTaskRefreshRedDot() {
        long start = System.currentTimeMillis();
        int cnt = 0;
        for(Iterator<Map.Entry<String, PlayerSession>> iterator = PlayerSessionManager.getAllSession().entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, PlayerSession> next = iterator.next();
            PlayerSession playerSession = next.getValue();
            if(playerSession == null || playerSession.getCurrentUser() == null) continue;
            RedDotTypeEnum.refreshEveryDay(playerSession.getCurrentUser());
            cnt++;
        }
        
    }

    
    @Scheduled(cron = "0 0 0 * * ?")
    public void runZeroTaskDistributeDailyRewards() {
        long start = System.currentTimeMillis();
        List<MachineGroup> allMachineGroup = machineGroupService.getAllMachineGroup();
        Set<String> ignoreRankMachineGroupIds = SysParamDictConfig.getInstance().getIgnoreRankMachineGroupIds();
        List<UtilInitData> rankRewards = rankService.getRankRewards();
        int cnt = userMailService.batchSendMail(userMails, userCodes);
        
                cnt, userMails);
    }
}
