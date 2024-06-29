package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UtilNoviceWelfare;
import com.tuibi.dianwan.entity.UtilNoviceWelfareExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UtilNoviceWelfareMapper extends BaseMapper<UtilNoviceWelfare> {
    long countByExample(UtilNoviceWelfareExample example);

    int deleteByExample(UtilNoviceWelfareExample example);

    List<UtilNoviceWelfare> selectByExample(UtilNoviceWelfareExample example);

    int updateByExampleSelective(@Param("record") UtilNoviceWelfare record, @Param("example") UtilNoviceWelfareExample example);

    int updateByExample(@Param("record") UtilNoviceWelfare record, @Param("example") UtilNoviceWelfareExample example);
}