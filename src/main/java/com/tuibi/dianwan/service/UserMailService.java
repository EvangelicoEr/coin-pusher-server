package com.tuibi.dianwan.service;

import com.tuibi.dianwan.entity.UserMail;
import com.tuibi.dianwan.pojo.MailQueryReq;
import com.tuibi.dianwan.vo.CurrencyBaseResp;
import com.tuibi.dianwan.vo.MailDetailInfoResp;
import com.tuibi.dianwan.vo.MailInfoResp;
import com.tuibi.common.base.api.PageInfo;

import java.util.List;
import java.util.Set;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface UserMailService {

    PageInfo<MailInfoResp> getUserMailList(MailQueryReq req);

    int getUnReadMailCount(Integer userId);

    MailDetailInfoResp getUserMailDetailInfo(Long mailId);

    /**
     * 领取邮件奖励
     * @param mailId
     */
    CurrencyBaseResp receverMailReward(Long mailId);

    /**
     * 修改邮件状态
     * @return
     */
    int updateMailState(Long mailId, Integer state);
    /**
     * 获取一封邮件
     * @param mailId
     * @return
     */
    UserMail getUserMail(Long mailId);

    void clearUserMailCache(Long mailId);

    /**
     * 删除邮件
     * @param mailId
     * @return
     */
    int deleteUserMail(Long mailId);

    /**
     * 发送邮件
     * @param userMail
     * @param userCode
     * @return
     */
    int sendMail(UserMail userMail, String userCode);

    int batchSendMail(List<UserMail> userMails, List<String> userCodes);
}
