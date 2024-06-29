package com.tuibi.dianwan.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: xx
 * 
 * @email: 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AliPayProperties {
    public static final String WEB_PRODUCT_CODE = "QUICK_WAP_WAY";

    public static final String CHARSET = "UTF-8";
    public static final String SIGNTYPE = "RSA2";

    public static final String TIMEOUT_EXPRESS = "30m";
    
    private String appId;
    
    private String publicKey;
    
    private String aliPublicKey;
    
    private String privateKey;
    
    private String notifyUrl;
}
