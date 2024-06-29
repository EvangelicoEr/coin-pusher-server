package com.tuibi.dianwan.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: xx
 * 
 * @email: 
 * 1进入, 2退出, 3游戏中, 4退出游戏, 5预约, 6取消预约
 */
@AllArgsConstructor
@Getter
public enum UserMachineActionEnum {
    ENTER(1),
    OUTER(2),
    PLAY(3),
    EXIT(4),
    RESERVATION(5),
    CANCELRESERVATION(6),
    ;
    private int action;
}
