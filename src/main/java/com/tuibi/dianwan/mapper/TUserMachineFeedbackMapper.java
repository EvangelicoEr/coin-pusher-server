package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.TUserMachineFeedback;
import com.tuibi.dianwan.entity.TUserMachineFeedbackExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TUserMachineFeedbackMapper extends BaseMapper<TUserMachineFeedback> {
    long countByExample(TUserMachineFeedbackExample example);

    int deleteByExample(TUserMachineFeedbackExample example);

    List<TUserMachineFeedback> selectByExample(TUserMachineFeedbackExample example);

    int updateByExampleSelective(@Param("record") TUserMachineFeedback record, @Param("example") TUserMachineFeedbackExample example);

    int updateByExample(@Param("record") TUserMachineFeedback record, @Param("example") TUserMachineFeedbackExample example);
}