package com.tuibi.dianwan.runnable;

import com.tuibi.dianwan.enums.TuiBiJiOperateTypeEnum;
import com.tuibi.dianwan.nio.MachineSessionManager;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: xx
 * 
 * @email: 
 */
@Slf4j
public class TbjHmReturnTickRunnable extends CntControllerRunnable {
    private String machineAlias;
    public TbjHmReturnTickRunnable(String machineAlias) {
        super(300);
        this.machineAlias = machineAlias;
    }

    @Override
    public String getName() {
        return "欢马推币机退票-"+machineAlias;
    }

    @Override
    public void execute() {
        if(!MachineSessionManager.sendMsg(machineAlias, TuiBiJiOperateTypeEnum.EXIT)) {
            
        }
    }

    @Override
    protected void exceededLimitOfTimes() {
        
        reset();


    }


}
