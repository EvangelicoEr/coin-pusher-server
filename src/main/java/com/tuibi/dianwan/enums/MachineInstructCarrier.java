package com.tuibi.dianwan.enums;

/**
 * @author: xx
 * 
 * @email: 
 */
public class MachineInstructCarrier implements MachineInstruct {
    private int type;
    private String desc;
    private String instruct;

    public MachineInstructCarrier(int type, String desc, String instruct) {
        this.type = type;
        this.desc = desc;
        this.instruct = instruct;
    }

    public static MachineInstructCarrier of(int type, String desc, String instruct) {
        return new MachineInstructCarrier(type, desc, instruct);
    }

    @Override
    public String getInstruct() {
        return instruct;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public String getDesc() {
        return desc;
    }

}
