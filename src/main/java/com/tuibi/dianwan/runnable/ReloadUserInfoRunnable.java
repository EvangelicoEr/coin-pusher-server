package com.tuibi.dianwan.runnable;

import com.tuibi.dianwan.entity.UserInfo;
import com.tuibi.dianwan.nio.PlayerSession;
import com.tuibi.dianwan.nio.PlayerSessionManager;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.UserInfoService;
import com.tuibi.dianwan.service.UtilExperienceLevelService;
import com.tuibi.dianwan.service.UtilMemberLevelService;
import com.tuibi.common.framework.config.RedisConst;
import com.tuibi.common.framework.util.cache.CacheUtil;
import com.tuibi.common.juc.thread.runnable.BaseRunnable;
import com.tuibi.common.util.SpringContextHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

/**
 * @author: xx
 * 
 * @email: 
 */
public class ReloadUserInfoRunnable extends BaseRunnable {
    private static final Logger logger = LoggerFactory.getLogger(ReloadUserInfoRunnable.class);
    private String userCode;

    public ReloadUserInfoRunnable(String userCode) {
        this.userCode = userCode;
        Assert.notNull(this.userCode);
    }

    @Override
    public String getName() {
        return "readloadUserInfoRunnable";
    }

    @Override
    public void execute() {
        UserInfo userInfo = SpringContextHolder.getBean(UserInfoService.class).getUserInfo(userCode);
        if(userInfo == null) {
            
            return;
        }

        String userKey = RedisConst.LOGIN_USER_INFO.getKey(userInfo.getUserId().toString());
        DianwanUserLoginInfo DianwanUserLoginInfo = CacheUtil.get(userKey);
        if(DianwanUserLoginInfo == null) {
            
            return;
        }
        DianwanUserLoginInfo.getUserInfo().updateInfo(userInfo,
                SpringContextHolder.getBean(UtilMemberLevelService.class).getMemberLevelById(userInfo.getMemberLevelId()),
                SpringContextHolder.getBean(UtilExperienceLevelService.class).calcUserExperienceLevel(userInfo.getUserCostLose()).getKey());
        CacheUtil.set(userKey, DianwanUserLoginInfo, CacheUtil.getClient().ttl(userKey));
        PlayerSession session = PlayerSessionManager.getSession(userInfo.getUserCode());
        if(session != null) {
            session.setCurrentUser(DianwanUserLoginInfo);
        }
    }

}
