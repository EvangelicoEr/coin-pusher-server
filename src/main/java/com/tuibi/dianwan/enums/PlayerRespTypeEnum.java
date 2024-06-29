package com.tuibi.dianwan.enums;

import com.tuibi.proto.Protocol;
import com.google.protobuf.ByteString;
import lombok.Getter;

/**
 * @author: xx
 * 
 * @email: 
 */
@Getter
public enum PlayerRespTypeEnum {
    
    ERRMSG(21, "错误提示"),
    CURRENCY_CHANGE(22, "货币变动", 5),
    MARQUEE(23, "跑马灯"),
    PAY_SUC(24, "支付成功", 15),
    SYS_PARAM(25, "系统参数"),
    RED_DOT(26, "玩家红点"),
    USER_INFO(27, "玩家信息变更", 2),
    CHARTERFLIGHT_CURRENCY_CHANGE(28, "包机货币变动", 5),
    MACHINE_ACTION_CHANGE(29, "机器行为变化"),
    MONEY(29, "机器行为变化"),
    INSUFFICIENT_MONEY(30, "货币不足"),
    ;
    private int type;
    private String desc;
    private int retryCnt;

    PlayerRespTypeEnum(int type, String desc) {
        this(type, desc, 0);
    }

    PlayerRespTypeEnum(int type, String desc, int retryCnt) {
        this.type = type;
        this.desc = desc;
        this.retryCnt = retryCnt;
    }

    public Protocol.Response build(String respId, ByteString data) {
        return Protocol.Response.newBuilder()
                .setType(type)
                .setRespId(respId)
                .setData(data)
                .build();
    }

}
