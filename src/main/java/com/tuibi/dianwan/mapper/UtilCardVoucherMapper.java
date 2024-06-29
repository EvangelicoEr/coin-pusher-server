package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UtilCardVoucher;
import com.tuibi.dianwan.entity.UtilCardVoucherExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UtilCardVoucherMapper extends BaseMapper<UtilCardVoucher> {
    long countByExample(UtilCardVoucherExample example);

    int deleteByExample(UtilCardVoucherExample example);

    List<UtilCardVoucher> selectByExample(UtilCardVoucherExample example);

    int updateByExampleSelective(@Param("record") UtilCardVoucher record, @Param("example") UtilCardVoucherExample example);

    int updateByExample(@Param("record") UtilCardVoucher record, @Param("example") UtilCardVoucherExample example);
}