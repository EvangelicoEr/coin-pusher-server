package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UtilAnnouncement;
import com.tuibi.dianwan.entity.UtilAnnouncementExample;
import com.tuibi.dianwan.vo.WinningAnnouncementResp;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UtilAnnouncementMapper extends BaseMapper<UtilAnnouncement> {
    long countByExample(UtilAnnouncementExample example);

    int deleteByExample(UtilAnnouncementExample example);

    List<UtilAnnouncement> selectByExampleWithBLOBs(UtilAnnouncementExample example);

    List<UtilAnnouncement> selectByExample(UtilAnnouncementExample example);

    int updateByExampleSelective(@Param("record") UtilAnnouncement record, @Param("example") UtilAnnouncementExample example);

    int updateByExampleWithBLOBs(@Param("record") UtilAnnouncement record, @Param("example") UtilAnnouncementExample example);

    int updateByExample(@Param("record") UtilAnnouncement record, @Param("example") UtilAnnouncementExample example);

    List<WinningAnnouncementResp> getWinningAnnouncementList();
}