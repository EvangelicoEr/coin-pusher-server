package com.tuibi.dianwan.aspect;

import com.tuibi.dianwan.config.SysParamDictConfig;
import com.tuibi.common.base.error.BizException;
import com.tuibi.common.base.model.ResultCode;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author: xx
 * 
 * @email: 
 */
@Component
@Aspect
public class SmsServiceProxyAspect {

    @Before("execution(* com.tuibi.dianwan.sms.service.SmsService.sendSMSVerificationCode(..))")
    public void beforeSendSMSVerificationCode() {
        if(!SysParamDictConfig.getInstance().getSendSmsSwitch()) {
            throw new BizException(ResultCode.FAIL, "抱歉,该功能暂未开放!");
        }
    }

}
