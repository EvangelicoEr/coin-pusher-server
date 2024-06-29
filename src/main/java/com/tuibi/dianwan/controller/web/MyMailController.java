package com.tuibi.dianwan.controller.web;

import com.tuibi.dianwan.pojo.MailQueryReq;
import com.tuibi.dianwan.service.UserMailService;
import com.tuibi.dianwan.vo.CurrencyBaseResp;
import com.tuibi.dianwan.vo.MailDetailInfoResp;
import com.tuibi.dianwan.vo.MailInfoResp;
import com.tuibi.common.base.api.PageResponseVO;
import com.tuibi.common.base.api.PageResponseVOFactory;
import com.tuibi.common.base.api.ResponseVO;
import com.tuibi.common.base.api.ResponseVOFactory;
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


public class MyMailController {

    @Autowired
    private UserMailService userMailService;

    
    
    public PageResponseVO<MailInfoResp> getList(@Validated @RequestBody MailQueryReq req) {
        return PageResponseVOFactory.makeResponse(userMailService.getUserMailList(req));
    }

    
    
    public ResponseVO<MailDetailInfoResp> getMailDetail(@PathVariable 
        return ResponseVOFactory.create(userMailService.getUserMailDetailInfo(mailId));
    }

    
    
    public ResponseVO<MailDetailInfoResp> delMail(@PathVariable 
        userMailService.deleteUserMail(mailId);
        return ResponseVOFactory.successResponse();
    }

    
    
    public ResponseVO<CurrencyBaseResp> receverReward(@PathVariable 
        return ResponseVOFactory.create(userMailService.receverMailReward(mailId));
    }
}
