package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UserCostRecharge;
import com.tuibi.dianwan.entity.UserCostRechargeExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserCostRechargeMapper extends BaseMapper<UserCostRecharge> {
    long countByExample(UserCostRechargeExample example);

    int deleteByExample(UserCostRechargeExample example);

    List<UserCostRecharge> selectByExample(UserCostRechargeExample example);

    int updateByExampleSelective(@Param("record") UserCostRecharge record, @Param("example") UserCostRechargeExample example);

    int updateByExample(@Param("record") UserCostRecharge record, @Param("example") UserCostRechargeExample example);
}