package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.TMachineFeedback;
import com.tuibi.dianwan.entity.TMachineFeedbackExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TMachineFeedbackMapper extends BaseMapper<TMachineFeedback> {
    long countByExample(TMachineFeedbackExample example);

    int deleteByExample(TMachineFeedbackExample example);

    List<TMachineFeedback> selectByExample(TMachineFeedbackExample example);

    int updateByExampleSelective(@Param("record") TMachineFeedback record, @Param("example") TMachineFeedbackExample example);

    int updateByExample(@Param("record") TMachineFeedback record, @Param("example") TMachineFeedbackExample example);
}