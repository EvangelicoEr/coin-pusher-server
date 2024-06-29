package com.tuibi.dianwan.global;

/**
 * @author: xx
 * 
 * @email: 
 * 参数编解码异常
 */
public class ParamterEncryptException extends RuntimeException {

    private String paramter;

    public ParamterEncryptException(String message, String paramter) {
        super(message);
        this.paramter = paramter;
    }

    public ParamterEncryptException(String message, String paramter, Throwable cause) {
        super(message, cause);
        this.paramter = paramter;
    }

    public String getParamter() {
        return paramter;
    }
}
