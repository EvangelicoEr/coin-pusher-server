package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UtilRechargeList;
import com.tuibi.dianwan.entity.UtilRechargeListExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UtilRechargeListMapper extends BaseMapper<UtilRechargeList> {
    long countByExample(UtilRechargeListExample example);

    int deleteByExample(UtilRechargeListExample example);

    List<UtilRechargeList> selectByExample(UtilRechargeListExample example);

    int updateByExampleSelective(@Param("record") UtilRechargeList record, @Param("example") UtilRechargeListExample example);

    int updateByExample(@Param("record") UtilRechargeList record, @Param("example") UtilRechargeListExample example);

    double getRechargeDayTask(@Param("userId") Integer userId);

    double getRechargeWeekTask(@Param("userId") Integer userId);

    double getRechargeMonthTask(@Param("userId") Integer userId);
}