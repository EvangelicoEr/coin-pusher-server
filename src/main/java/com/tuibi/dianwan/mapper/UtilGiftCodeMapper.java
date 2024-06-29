package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UtilGiftCode;
import com.tuibi.dianwan.entity.UtilGiftCodeExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UtilGiftCodeMapper extends BaseMapper<UtilGiftCode> {
    long countByExample(UtilGiftCodeExample example);

    int deleteByExample(UtilGiftCodeExample example);

    List<UtilGiftCode> selectByExample(UtilGiftCodeExample example);

    int updateByExampleSelective(@Param("record") UtilGiftCode record, @Param("example") UtilGiftCodeExample example);

    int updateByExample(@Param("record") UtilGiftCode record, @Param("example") UtilGiftCodeExample example);
}