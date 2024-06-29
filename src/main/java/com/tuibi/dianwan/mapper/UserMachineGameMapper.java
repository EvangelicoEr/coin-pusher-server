package com.tuibi.dianwan.mapper;

import com.tuibi.dianwan.entity.UserMachineGame;
import com.tuibi.dianwan.entity.UserMachineGameExample;
import com.tuibi.common.framework.mybatis.BaseMapper;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMachineGameMapper extends BaseMapper<UserMachineGame> {
    long countByExample(UserMachineGameExample example);

    int deleteByExample(UserMachineGameExample example);

    List<UserMachineGame> selectByExampleWithBLOBs(UserMachineGameExample example);

    List<UserMachineGame> selectByExample(UserMachineGameExample example);

    int updateByExampleSelective(@Param("record") UserMachineGame record, @Param("example") UserMachineGameExample example);

    int updateByExampleWithBLOBs(@Param("record") UserMachineGame record, @Param("example") UserMachineGameExample example);

    int updateByExample(@Param("record") UserMachineGame record, @Param("example") UserMachineGameExample example);

    List<UserMachineGame> getRecentlyPlayUserMachineGameList(@Param("topNum") Integer topNum, @Param("channelId") Integer channelId);

    List<String> getGroupMachineIdByGxsjRecord(@Param("gxsj") String gxsj);
}