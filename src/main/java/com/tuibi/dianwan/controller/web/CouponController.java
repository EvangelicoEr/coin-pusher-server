package com.tuibi.dianwan.controller.web;

import com.tuibi.dianwan.service.UtilCardVoucherService;
import com.tuibi.dianwan.vo.CouponInfoResp;
import com.tuibi.common.base.api.ListResponseVO;
import com.tuibi.common.base.api.ListResponseVOFactory;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xx
 * 
 * @email: 
 */

@RestController

public class CouponController {

    @Autowired
    private UtilCardVoucherService utilCardVoucherService;

    
    
    public ListResponseVO<CouponInfoResp> getCouponInfos(@PathVariable 
                                                         @PathVariable 
        return ListResponseVOFactory.makeListResponse(utilCardVoucherService.getCouponInfoList(type, platform));
    }
}
