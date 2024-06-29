package com.tuibi.dianwan.controller.web;

import com.tuibi.dianwan.config.SysParamDictConfig;
import com.tuibi.dianwan.entity.UtilInitData;
import com.tuibi.dianwan.entity.UtilReward;
import com.tuibi.dianwan.enums.RedDotTypeEnum;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.*;
import com.tuibi.dianwan.vo.*;
import com.tuibi.common.base.api.ListResponseVO;
import com.tuibi.common.base.api.ListResponseVOFactory;
import com.tuibi.common.base.api.ResponseVO;
import com.tuibi.common.base.api.ResponseVOFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author: xx
 * 
 * @email: 
 */
@RestController


public class ActivityController {

    @Autowired
    private UserSigninService userSigninService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private UtilGiftCodeService utilGiftCodeService;
    @Autowired
    private UtilDailyGiftService utilDailyGiftService;
    @Autowired
    private UtilRechargeListService utilRechargeListService;
    @Autowired
    private UtilInitDataService utilInitDataService;

    
    
    public ResponseVO<CurrencyBaseResp> userSignin() {
        return ResponseVOFactory.create(userSigninService.doUserSignin());
    }

    
    
    public ResponseVO<WelfareActivitiesInfoResp> getDailyBenefits() {
        return ResponseVOFactory.create(taskService.getWelfareActivityInfoResp(CurrentUserHolder.getCurrentJwtUser()));
    }

    
    
    public ResponseVO<CurrencyBaseResp> receiveTaskAward(@PathVariable 
        return ResponseVOFactory.create(taskService.receverTaskReward(taskId));
    }

    
    
    public ResponseVO<CurrencyBaseResp> redeemCode(@PathVariable 
        return ResponseVOFactory.create(utilGiftCodeService.redeemCode(code));
    }

    
    
    public ListResponseVO<ContinuousRushInfoResp> getContinuousRushInfo() {
        return ListResponseVOFactory.makeListResponse(utilDailyGiftService.getUserContinuousRushInfoResp());
    }

    
    
    public ListResponseVO<RechargeShopResp> getRechargeShopList(@PathVariable 
        return ListResponseVOFactory.makeListResponse(utilRechargeListService.getRechargeShopList(channelId));
    }

    
    public ResponseVO<Long> getRedDot() {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        return ResponseVOFactory.create(RedDotTypeEnum.getUserRedDot(DianwanUserLoginInfo));
    }

    
    
    public ResponseVO<Integer> getBindPhone() {
        return ResponseVOFactory.create(Optional.ofNullable(taskService.getBindPhoneTaskInfo())
                .map(UtilReward::getRewardNum).orElse(0));
    }
}
