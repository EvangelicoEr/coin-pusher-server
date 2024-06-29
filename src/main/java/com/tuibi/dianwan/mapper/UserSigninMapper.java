package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UserSignin;
import com.tuibi.dianwan.entity.UserSigninExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserSigninMapper extends BaseMapper<UserSignin> {
    long countByExample(UserSigninExample example);

    int deleteByExample(UserSigninExample example);

    List<UserSignin> selectByExample(UserSigninExample example);

    int updateByExampleSelective(@Param("record") UserSignin record, @Param("example") UserSigninExample example);

    int updateByExample(@Param("record") UserSignin record, @Param("example") UserSigninExample example);
}