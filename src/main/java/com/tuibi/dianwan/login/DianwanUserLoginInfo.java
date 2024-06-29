package com.tuibi.dianwan.security;

import com.tuibi.dianwan.config.PayUserInfo;
import com.tuibi.dianwan.entity.UtilExperienceLevel;
import com.tuibi.dianwan.entity.UtilMemberLevel;
import com.tuibi.common.base.api.UserLoginInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Optional;

/**
 * @author: xx
 * 
 * @email: 
 */
@ToString
@NoArgsConstructor
public class DianwanUserLoginInfo extends UserLoginInfo implements PayUserInfo {
    private UserInfo userInfo;
    
    private volatile String lastMonitorMachineGroupId;

    @Override
    public String getUserCode() {
        return userInfo.getUserCode();
    }

    @Override
    public Integer getUserId() {
        return userInfo.getUserId();
    }

    @Override
    public Integer getChannelId() {
        return userInfo.getChannelId();
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public String getLastMonitorMachineGroupId() {
        return lastMonitorMachineGroupId;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public void setLastMonitorMachineGroupId(String lastMonitorMachineGroupId) {
        this.lastMonitorMachineGroupId = lastMonitorMachineGroupId;
    }

    @Data
    
    @Builder
    public static class UserInfo implements Serializable {
        private static final long serialVersionUID = 4232131234L;
        
        private Integer channelId;
        
        private Integer userId;
        
        private String openId;
        
        private String userCode;
        
        private String unionId;
        
        private String appleid;
        
        private String headImg;
        
        
        private String topAgentId;
        
        private String phone;
        
        private String nickname;
        
        private String sex;
        
        private Long money;
        
        private Long integral;
        
        private String vipIcon;
        
        private String vipName;
        
        private Integer vipLevel;
        
        private Double vipExperience;
        
        
        private boolean realNameAuthentication;
        
        private String chat;
        
        private String experienceLevelName;
        
        private String experienceLevelIcon;
        
        private String lastLoginDate;
        
        private Integer loginDay;

        public void updateInfo(com.tuibi.dianwan.entity.UserInfo userInfo, UtilMemberLevel utilMemberLevel, UtilExperienceLevel utilExperienceLevel) {
            setMoney((long) userInfo.getLastMoney());
            setIntegral((long) userInfo.getLastIntegral());
            setVipExperience(userInfo.getMemberCumulativeValue());
            setVipName(utilMemberLevel.getMemberLevelName());
            setVipIcon(utilMemberLevel.getMemberLevelLogo());
            setVipLevel(utilMemberLevel.getMemberLevelNum());
            setExperienceLevelName(utilExperienceLevel.getExperienceLevelName());
            setPhone(userInfo.getUserPhone());
            setTopAgentId(userInfo.getUserUpId());
            setExperienceLevelIcon(utilExperienceLevel.getExperienceLevelLogo());
            setNickname(userInfo.getUserNickname());
            setHeadImg(userInfo.getUserImg());
            setLoginDay(userInfo.getLoginDay());

            setRealNameAuthentication("1".equals(Optional.ofNullable(userInfo.getIsRealName()).map(Object::toString).orElse("0")));
        }

    }

}
