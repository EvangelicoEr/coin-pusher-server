package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UtilQuestions;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UtilQuestionService {

    List<UtilQuestions> getAllQuestionByGroup(Integer groupId);

    UtilQuestions getQuestionById(Integer groupId, Integer questionId);

    void clearAllQuestionByGroup(Integer groupId);
}
