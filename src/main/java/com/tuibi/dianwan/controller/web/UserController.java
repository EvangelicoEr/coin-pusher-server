package com.tuibi.dianwan.controller.web;

import com.tuibi.dianwan.entity.UserInfo;
import com.tuibi.dianwan.pojo.UserBindPhoneReq;
import com.tuibi.dianwan.pojo.UserInfoChangeReq;
import com.tuibi.dianwan.pojo.UserMoneyRecordQueryReq;
import com.tuibi.dianwan.pojo.UserVerifiedReq;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.*;
import com.tuibi.dianwan.vo.*;
import com.tuibi.common.base.api.*;
import com.tuibi.common.base.error.BizException;
import com.tuibi.common.base.model.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author: xx
 * 
 * @email: 
 */
@RestController


public class UserController {

    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UtilMemberLevelService utilMemberLevelService;
    @Autowired
    private UserCostLogService userCostLogService;
    @Autowired
    private WeekCardService weekCardService;
    @Autowired
    private UtilExperienceLevelService utilExperienceLevelService;

    
    
    public ResponseVO<DianwanUserLoginInfo.UserInfo> getInfo() {
        DianwanUserLoginInfo currentJwtUser = CurrentUserHolder.getCurrentJwtUser();
        UserInfo userInfo = userInfoService.getUserInfo(currentJwtUser.getId());
        if(userInfo == null || !Integer.valueOf(2).equals(userInfo.getZt())) {
            throw new BizException(ResultCode.UNAUTHORIZED, "账号信息异常,请重新登录!");
        }
        currentJwtUser.getUserInfo().updateInfo(userInfo,
                utilMemberLevelService.getMemberLevelById(userInfo.getMemberLevelId()),
                utilExperienceLevelService.calcUserExperienceLevel(userInfo.getUserCostLose()).getKey());
        return ResponseVOFactory.create(currentJwtUser.getUserInfo());
    }

    
    
    public PageResponseVO<UserMoneyRecordResp> getMoneyRecord(@Validated @RequestBody UserMoneyRecordQueryReq req) {
        return PageResponseVOFactory.makeResponse(userCostLogService.getUserMoneyRecord(req));
    }

    
    
    public ListResponseVO<WeekCardDataResp> getWeekCard() {
        return ListResponseVOFactory.makeListResponse(weekCardService.getUserWeekCardData(CurrentUserHolder.getCurrentJwtUser()));
    }

    
    
    public ResponseVO<CurrencyBaseResp> receverWeekCardReward(@PathVariable 
        return ResponseVOFactory.create(weekCardService.receverWeekCardReward(id));
    }

    
    
    public ResponseVO<MemberCenterInfoResp> getMemberCenter() {
        return ResponseVOFactory.create(utilMemberLevelService.getUserMemberCenterInfo());
    }

    
    
    public ResponseVO<UserExperienceLevelResp> getUserExperienceLevelResp() {
        return ResponseVOFactory.create(utilExperienceLevelService.getUserExperienceLevelResp(CurrentUserHolder.getCurrentJwtUser()));
    }

    
    
    public ResponseVO<CurrencyBaseResp> receverExperienceLevelReward(@PathVariable 
        return ResponseVOFactory.create(utilExperienceLevelService.receverExperienceLevelReward(levelId));
    }

    
    
    public ResponseVO<IntegralExchangeInfoResp> getIntegralExchangeInfo() {
        return ResponseVOFactory.create(userInfoService.getIntegralExchangeInfo());
    }

    
    
    public ResponseVO<CurrencyBaseResp> getIntegralExchangeInfo(@PathVariable 
        return ResponseVOFactory.create(userInfoService.integralExchange(exchangeMoney));
    }

    
    
    public ResponseVO<String> userVerified(@RequestBody @Validated UserVerifiedReq req) {
        userInfoService.userVerified(req);
        return ResponseVOFactory.successResponse();
    }

    
    
    public ResponseVO<UserInfoChangeReq> userInfoChange(@RequestBody @Validated UserInfoChangeReq req) {
        return ResponseVOFactory.create(userInfoService.userInfoChange(req));
    }

    
    
    public ResponseVO<String> bindPhone(@RequestBody @Validated UserBindPhoneReq req) {
        return ResponseVOFactory.create(userInfoService.bindPhone(req.getPhone(), req.getSmsCode()));
    }

    
    
    public ResponseVO<CurrencyBaseResp> bindUser(@PathVariable 
        return ResponseVOFactory.create(userInfoService.bindUser(userCode));
    }
}
