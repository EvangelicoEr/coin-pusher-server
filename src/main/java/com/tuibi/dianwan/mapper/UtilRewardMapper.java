package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UtilReward;
import com.tuibi.dianwan.entity.UtilRewardExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UtilRewardMapper extends BaseMapper<UtilReward> {
    long countByExample(UtilRewardExample example);

    int deleteByExample(UtilRewardExample example);

    List<UtilReward> selectByExample(UtilRewardExample example);

    int updateByExampleSelective(@Param("record") UtilReward record, @Param("example") UtilRewardExample example);

    int updateByExample(@Param("record") UtilReward record, @Param("example") UtilRewardExample example);
}