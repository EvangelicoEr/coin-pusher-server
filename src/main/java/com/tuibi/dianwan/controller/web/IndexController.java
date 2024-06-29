package com.tuibi.dianwan.controller.web;

import com.tuibi.dianwan.service.AggregationService;
import com.tuibi.dianwan.service.UtilAnnouncementService;
import com.tuibi.dianwan.service.UtilCarouselService;
import com.tuibi.dianwan.vo.BannerInfoResp;
import com.tuibi.dianwan.vo.UserPlayMachineInfoResp;
import com.tuibi.dianwan.vo.WinningAnnouncementResp;
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


public class IndexController {

    @Autowired
    private UtilCarouselService utilCarouselService;
    @Autowired
    private UtilAnnouncementService utilAnnouncementService;
    @Autowired
    private AggregationService aggregationService;

    
    
    public ListResponseVO<BannerInfoResp> getBanner(
        return ListResponseVOFactory.makeConvertedList(utilCarouselService.getBanner(position), BannerInfoResp.CONVERT);
    }

    
    
    public ListResponseVO<WinningAnnouncementResp> getWinningAnnouncement() {
        return ListResponseVOFactory.makeListResponse(utilAnnouncementService.getWinningAnnouncement());
    }

    
    
    public ListResponseVO<UserPlayMachineInfoResp> getUserPlayMachineList() {
        return ListResponseVOFactory.makeListResponse(aggregationService.getUserPlayMachineList());
    }
}
