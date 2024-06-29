package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.UtilQuestions;
import com.tuibi.dianwan.mapper.UtilQuestionsMapper;
import com.tuibi.dianwan.service.UtilQuestionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
@Slf4j
public class UtilQuestionServiceImpl implements UtilQuestionService {

    @Autowired
    private UtilQuestionsMapper utilQuestionsMapper;
    @Autowired
    private UtilQuestionService utilQuestionService;

    @Override
    @Cacheable(value = "FOREVER", key = "'getAllQuestionByGroup-' + #groupId")
    public List<UtilQuestions> getAllQuestionByGroup(Integer groupId) {
        return utilQuestionsMapper.selectByCondition(Condition.builder(UtilQuestions.class).where(
                Sqls.custom().andEqualTo("groupId", groupId)
        ).orderByAsc("sort").build());
    }

    @Override
    public UtilQuestions getQuestionById(Integer groupId, Integer questionId) {
        return utilQuestionService.getAllQuestionByGroup(groupId).stream()
                .filter(utilQuestions -> utilQuestions.getQuestionsId().equals(questionId))
                .findFirst().orElse(null);
    }

    @Override
    @CacheEvict(value = "FOREVER", key = "'getAllQuestionByGroup-' + #groupId")
    public void clearAllQuestionByGroup(Integer groupId) {

    }
}
