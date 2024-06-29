package com.tuibi.dianwan.controller.web;

import com.tuibi.dianwan.entity.UtilInitData;
import com.tuibi.dianwan.entity.UtilQuestions;
import com.tuibi.dianwan.service.UtilInitDataService;
import com.tuibi.dianwan.service.UtilPlayInstructionsService;
import com.tuibi.dianwan.service.UtilQuestionService;
import com.tuibi.dianwan.service.UtilQuestionsGroupService;
import com.tuibi.dianwan.vo.MachineHowToPlayResp;
import com.tuibi.dianwan.vo.QuestionGroupResp;
import com.tuibi.dianwan.vo.QuestionInfoResp;
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

public class ProtocolController {

    @Autowired
    private UtilInitDataService utilInitDataService;
    @Autowired
    private UtilQuestionsGroupService utilQuestionsGroupService;
    @Autowired
    private UtilQuestionService utilQuestionService;
    @Autowired
    private UtilPlayInstructionsService utilPlayInstructionsService;

    
    
    public ResponseVO<String> user() {
        return ResponseVOFactory.create(Optional.ofNullable(utilInitDataService.getInitDataById(10))
                .map(UtilInitData::getInitKey).orElse(""));
    }

    
    
    public ResponseVO<String> privacy() {
        return ResponseVOFactory.create(Optional.ofNullable(utilInitDataService.getInitDataById(11))
                .map(UtilInitData::getInitKey).orElse(""));
    }

    
    
    public ResponseVO<String> underage() {
        return ResponseVOFactory.create(Optional.ofNullable(utilInitDataService.getInitDataById(12))
                .map(UtilInitData::getInitKey).orElse(""));
    }

    
    
    public ListResponseVO<QuestionGroupResp> getQuestionGroup() {
        return ListResponseVOFactory.makeConvertedList(utilQuestionsGroupService.getAllQuestionsGroup(), question -> {
            QuestionGroupResp resp = new QuestionGroupResp();
            resp.setId(question.getGroupId());
            resp.setName(question.getGroupName());
            return resp;
        });
    }

    
    
    public ListResponseVO<QuestionInfoResp> getAllQuestion(@PathVariable 
        return ListResponseVOFactory.makeConvertedList(utilQuestionService.getAllQuestionByGroup(groupId), question -> {
            QuestionInfoResp resp = new QuestionInfoResp();
            resp.setId(question.getQuestionsId());
            resp.setName(question.getQuestions());
            return resp;
        });
    }

    
    
    public ResponseVO<String> getQuestionDetail(@PathVariable 
                                                           @PathVariable 
        return ResponseVOFactory.create(Optional.ofNullable(utilQuestionService.getQuestionById(groupId, questionId))
                .map(UtilQuestions::getFrequently).orElse(""));
    }

    
    
    public ListResponseVO<MachineHowToPlayResp> getMachinePlayInstructions(@PathVariable 
        return ListResponseVOFactory.makeConvertedList(utilPlayInstructionsService.getMachinePlayInstructions(machineId), utilPlayInstructions -> {
            MachineHowToPlayResp resp = new MachineHowToPlayResp();
            resp.setTitle(utilPlayInstructions.getInstructionsName());
            resp.setContent(utilPlayInstructions.getInstructionsContent());
            resp.setShowUrl(utilPlayInstructions.getLinkUrl());
            return resp;
        });
    }
}
