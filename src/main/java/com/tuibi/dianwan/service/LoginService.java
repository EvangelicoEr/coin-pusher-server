package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UserInfo;
import com.tuibi.common.base.api.ResponseVO;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public interface LoginService {

    /**
     * 微信登陆
     * @param req
     * @param paramter
     * @return
     */
    UserInfo wxLogin(HttpServletRequest req, Map<String,String> paramter);

    /**
     * 苹果登录
     * @param req
     * @param paramter
     * @return
     */
    UserInfo appleLogin(HttpServletRequest req, Map<String,String> paramter);
}
