package com.tuibi.dianwan.enums;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: xx
 * 
 * @email: 
 */
public class MachineInstructCarrierManager {

    private static Map<Class, List<MachineInstruct>> machineInstructManager = new ConcurrentHashMap<>();
    
    private static final int LOOP_BIT = 0x100;
    
    private static final int CANCEL_LOOP_BIT = 0x200;
    private static final int INSTRUCT_BIT_MARK = 0xFF;
    
    private static final int OPT_BIT_MARK = 0xFF00;
    


    private MachineInstructCarrierManager(){}

    public static void addMachineInstruct(Class clazz, MachineInstruct machineInstruct) {
        List<MachineInstruct> machineInstructs = machineInstructManager.get(clazz);
        if(machineInstructs == null) {
            machineInstructs = new ArrayList<>();
            List<MachineInstruct> old = machineInstructManager.putIfAbsent(clazz, machineInstructs);
            if(old != null)
                machineInstructs = old;
        }
        synchronized (machineInstructs) {
            machineInstructs.add(machineInstruct);
        }
    }

    public static MachineInstruct findMachineInstruct(Class clazz, Integer type) {
        if(type == null || clazz == null) return null;
        List<MachineInstruct> machineInstructs = machineInstructManager.get(clazz);
        if(machineInstructs == null) return null;
        int size = machineInstructs.size();
        for(int i=size - 1; i>=0; i--) {
            if(type.equals(machineInstructs.get(i).getType())) {
                return machineInstructs.get(i);
            }
        }
        return null;
    }

    public static int getRealType(Integer type) {
        if(type == null) throw new NullPointerException("type is null");
        return type & INSTRUCT_BIT_MARK;
    }

    /**
     * 类型是否包含循环标志
     * @param type
     * @return
     */
    public static boolean isLoopBit(Integer type) {
        if(type == null) return false;
        return (type & LOOP_BIT) != 0;
    }

    /**
     * 类型是否包含取消循环标志
     * @param type
     * @return
     */
    public static boolean isCancelLoopBit(Integer type) {
        if(type == null) return false;
        return (type & CANCEL_LOOP_BIT) != 0;
    }

    public static MachineInstructCarrier addLoop(MachineInstructCarrier original) {
        return MachineInstructCarrier.of(original.getType() | LOOP_BIT, original.getDesc(), original.getInstruct());
    }

    public static MachineInstructCarrier addCancelLoop(MachineInstructCarrier original) {
        return MachineInstructCarrier.of(original.getType() | CANCEL_LOOP_BIT, original.getDesc(), original.getInstruct());
    }
}
