package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UserMail;
import com.tuibi.dianwan.entity.UserMailExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMailMapper extends BaseMapper<UserMail> {
    long countByExample(UserMailExample example);

    int deleteByExample(UserMailExample example);

    List<UserMail> selectByExample(UserMailExample example);

    int updateByExampleSelective(@Param("record") UserMail record, @Param("example") UserMailExample example);

    int updateByExample(@Param("record") UserMail record, @Param("example") UserMailExample example);
}