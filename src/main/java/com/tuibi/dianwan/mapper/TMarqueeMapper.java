package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.TMarquee;
import com.tuibi.dianwan.entity.TMarqueeExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TMarqueeMapper extends BaseMapper<TMarquee> {
    long countByExample(TMarqueeExample example);

    int deleteByExample(TMarqueeExample example);

    List<TMarquee> selectByExampleWithBLOBs(TMarqueeExample example);

    List<TMarquee> selectByExample(TMarqueeExample example);

    int updateByExampleSelective(@Param("record") TMarquee record, @Param("example") TMarqueeExample example);

    int updateByExampleWithBLOBs(@Param("record") TMarquee record, @Param("example") TMarqueeExample example);

    int updateByExample(@Param("record") TMarquee record, @Param("example") TMarqueeExample example);
}