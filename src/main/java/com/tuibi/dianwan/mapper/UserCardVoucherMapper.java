package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UserCardVoucher;
import com.tuibi.dianwan.entity.UserCardVoucherExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserCardVoucherMapper extends BaseMapper<UserCardVoucher> {
    long countByExample(UserCardVoucherExample example);

    int deleteByExample(UserCardVoucherExample example);

    List<UserCardVoucher> selectByExample(UserCardVoucherExample example);

    int updateByExampleSelective(@Param("record") UserCardVoucher record, @Param("example") UserCardVoucherExample example);

    int updateByExample(@Param("record") UserCardVoucher record, @Param("example") UserCardVoucherExample example);
}