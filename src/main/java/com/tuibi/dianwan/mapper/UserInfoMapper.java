package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UserInfo;
import com.tuibi.dianwan.entity.UserInfoExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    List<UserInfo> selectByExample(UserInfoExample example);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int addUserMoneyCost(@Param("userCode") String userCode, @Param("costValue") Integer costValue);

    int addUserMoneyGet(@Param("userCode") String userCode, @Param("getValue") Integer costValue);

    int addUserIntegralGet(@Param("userCode") String userCode, @Param("getValue") Integer costValue);

    int addUserIntegralCost(@Param("userCode") String userCode, @Param("getValue") Integer costValue);

    int updateUserLoginDay(@Param("userCode") String userCode, @Param("gxsj") String gxsj);

    int insertUserInfo(UserInfo userInfo);
}