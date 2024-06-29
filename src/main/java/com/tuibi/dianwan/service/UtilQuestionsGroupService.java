package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UtilQuestionsGroup;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UtilQuestionsGroupService {

    List<UtilQuestionsGroup> getAllQuestionsGroup();

    void clearQuestionsGroupCache();

}
