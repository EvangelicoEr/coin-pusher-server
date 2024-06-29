package com.tuibi.dianwan.controller.web;

import com.tuibi.dianwan.pojo.PhoneReq;
import com.tuibi.dianwan.pojo.UserBindPhoneReq;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.UserInfoService;
import com.tuibi.dianwan.sms.enums.SmsChannelEnum;
import com.tuibi.dianwan.sms.service.SmsService;
import com.tuibi.common.base.api.ResponseVO;
import com.tuibi.common.base.api.ResponseVOFactory;
import com.tuibi.common.framework.config.RedisConst;
import com.tuibi.common.framework.util.cache.CacheUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xx
 * 
 * @email: 
 */

@RestController

public class SmsController {

    @Autowired
    private UserInfoService userInfoService;

    
    
    public ResponseVO<String> sendBindPhoneVerificationCode(@RequestBody @Validated PhoneReq req) {
        userInfoService.sendBindPhoneVerificationCode(req.getPhone());
        return ResponseVOFactory.successResponse();
    }
}
