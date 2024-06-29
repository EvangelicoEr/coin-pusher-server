package com.tuibi.dianwan.controller.web;

import com.tuibi.dianwan.service.RankService;
import com.tuibi.dianwan.vo.RankGroupResp;
import com.tuibi.dianwan.vo.RankUserInfoResp;
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

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */

@RestController

public class RankController {

    @Autowired
    private RankService rankService;

    
    
    public ResponseVO<RankGroupResp> getGroup() {
        return ResponseVOFactory.create(rankService.getRankGroup());
    }

    
    
    public ListResponseVO<RankUserInfoResp> list(@PathVariable 
        return ListResponseVOFactory.makeListResponse(rankService.getRankList(groupId));
    }
}
