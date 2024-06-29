package com.tuibi.dianwan.enums;

import com.tuibi.proto.Protocol;
import com.google.protobuf.ByteString;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author: xx
 * 
 * @email: 
 */
@AllArgsConstructor
@Getter
public enum PlayerErrmsgTypeEnum {
    TOAST(1, 1, "普通提示"),
    UNLOGIN(2, 0,"普通提示, 玩家未登录"),
    ;
    private int type;
    private int tipType;
    private String desc;

    public static Protocol.MessageResponse buildMessageResp(int reqType, PlayerErrmsgTypeEnum type, String errmsg) {
        Protocol.MessageResponse.Builder builder = Protocol.MessageResponse.newBuilder();
        builder.setReqType(reqType);
        builder.setErrcode(type.getType());
        builder.setTipType(type.getTipType());
        builder.setErrmsg(errmsg);
        return builder.build();
    }

    public static Protocol.Response buildResp(String respId, ByteString bytes) {
        return Protocol.Response.newBuilder()
                .setRespId(respId)
                .setType(PlayerRespTypeEnum.ERRMSG.getType())
                .setData(bytes)
                .build();
    }

    public static Protocol.Response buildResp(String respId, int reqType, PlayerErrmsgTypeEnum type, String errmsg) {
        return Protocol.Response.newBuilder()
                .setRespId(respId)
                .setType(PlayerRespTypeEnum.ERRMSG.getType())
                .setData(buildMessageResp(reqType, type, errmsg).toByteString())
                .build();
    }
}
