package com.tuibi.dianwan.service;

import com.tuibi.dianwan.vo.MachineGroupResp;
import com.tuibi.dianwan.vo.MachineMainGroupResp;
import com.tuibi.dianwan.vo.MachineMainResp;
import com.tuibi.dianwan.vo.UserPlayMachineInfoResp;

import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface AggregationService {

    /**
     * 获取机器分类数据
     * @return
     */
    List<MachineGroupResp> getAllMachineGroupResp();

    /**
     * 获取机器数据
     * @param groupId   分类id
     * @param findEmpty 是否找空位 1找空位 0不找
     * @return
     */
    List<MachineMainGroupResp> getMachineMainByGroup(String groupId, int findEmpty);

    /**
     * 获取在玩机器玩家信息
     * @return
     */
    List<UserPlayMachineInfoResp> getUserPlayMachineList();
}
