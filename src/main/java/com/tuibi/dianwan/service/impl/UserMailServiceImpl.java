package com.tuibi.dianwan.service.impl;

import cn.hutool.core.date.LocalDateTimeUtil;
import com.tuibi.dianwan.entity.UserCardVoucher;
import com.tuibi.dianwan.entity.UserMail;
import com.tuibi.dianwan.entity.UtilCardVoucher;
import com.tuibi.dianwan.enums.RedDotTypeEnum;
import com.tuibi.dianwan.enums.RewardSourceTypeEnum;
import com.tuibi.dianwan.mapper.UserMailMapper;
import com.tuibi.dianwan.pojo.MailQueryReq;
import com.tuibi.dianwan.security.CurrentUserHolder;
import com.tuibi.dianwan.security.DianwanUserLoginInfo;
import com.tuibi.dianwan.service.UserCardVoucherService;
import com.tuibi.dianwan.service.UserInfoService;
import com.tuibi.dianwan.service.UserMailService;
import com.tuibi.dianwan.service.UtilCardVoucherService;
import com.tuibi.dianwan.vo.CurrencyBaseResp;
import com.tuibi.dianwan.vo.MailDetailInfoResp;
import com.tuibi.dianwan.vo.MailInfoResp;
import com.github.pagehelper.PageHelper;
import com.google.common.collect.Lists;
import com.tuibi.common.base.api.PageInfo;
import com.tuibi.common.base.error.BizException;
import com.tuibi.common.base.model.ResultCode;
import com.tuibi.common.base.util.PageInfoUtil;
import com.tuibi.common.juc.thread.ThreadManager;
import com.tuibi.common.juc.thread.runnable.BaseRunnable;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.util.Sqls;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
@Slf4j
public class UserMailServiceImpl implements UserMailService {

    @Autowired
    private UserMailMapper userMailMapper;
    @Autowired
    private UserMailService userMailService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UtilCardVoucherService utilCardVoucherService;
    @Autowired
    private UserCardVoucherService userCardVoucherService;

    @Override
    public PageInfo<MailInfoResp> getUserMailList(MailQueryReq req) {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        PageHelper.startPage(req.getPageNum(), req.getPageSize());
        List<UserMail> mailList = userMailMapper.selectByCondition(Condition.builder(UserMail.class).where(
                Sqls.custom().andEqualTo("userId", DianwanUserLoginInfo.getUserId())
                        .andEqualTo("del", 0)
        ).orderByDesc("lrsj").build());
        return PageInfoUtil.makePageInfo(mailList, mail -> {
            MailInfoResp resp = new MailInfoResp();
            resp.setId(mail.getMailId());
            resp.setCreateTime(mail.getLrsj());
            resp.setTitle(mail.getMailName());
            resp.setState(mail.getZt());
            return resp;
        });
    }

    @Override
    public int getUnReadMailCount(Integer userId) {
        return userMailMapper.selectCountByCondition(Condition.builder(UserMail.class).where(
                Sqls.custom().andEqualTo("userId", userId)
                        .andIn("zt", Lists.newArrayList(1, 2))
        ).build());
    }

    @Override
    public MailDetailInfoResp getUserMailDetailInfo(Long mailId) {
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        UserMail userMail = userMailService.getUserMail(mailId);
        if(userMail == null || !DianwanUserLoginInfo.getUserId().equals(userMail.getUserId())) {
            throw new BizException(ResultCode.FAIL, "邮件不存在!");
        }
        int targetState = userMail.getZt();
        if(targetState == 2) {
            
            targetState = userMail.canRecever() ? 1 : 0;
            int ret = updateMailState(mailId, targetState);
            if(targetState == 0 && ret > 0) {
                ThreadManager.executeOrderIoTask(userMail.getUserId(), new BaseRunnable() {
                    @Override
                    public void execute() {
                        RedDotTypeEnum.EMAIL_UNREAD.operateRedDotAndNotify(DianwanUserLoginInfo.getUserCode(), true);
                    }

                    @Override
                    public String getName() {
                        return "减少邮件红点数据-" + mailId;
                    }
                });
            }
        }
        MailDetailInfoResp resp = new MailDetailInfoResp();
        resp.setContent(userMail.getMailContent());
        resp.setMoney(userMail.getMailCost());
        resp.setIntegral(userMail.getMailIntegral());
        resp.setState(targetState);
        resp.setTitle(userMail.getMailName());
        resp.setId(userMail.getMailId());
        resp.setCreateTime(userMail.getLrsj());
        return resp;
    }

    @Override
    public CurrencyBaseResp receverMailReward(Long mailId) {
        UserMail userMail = userMailService.getUserMail(mailId);
        DianwanUserLoginInfo DianwanUserLoginInfo = CurrentUserHolder.getCurrentJwtUser();
        if(userMail == null || !DianwanUserLoginInfo.getUserId().equals(userMail.getUserId())) {
            throw new BizException(ResultCode.FAIL, "邮件不存在");
        }
        int upLine = updateMailState(mailId, 0);
        if(upLine < 1) {
            throw new BizException(ResultCode.FAIL, "邮件已领取");
        }
        String prefix = "";
        if(StringUtils.isNotBlank(userMail.getBz())) {
            prefix = "["+userMail.getBz()+"] ";
        }
        CurrencyBaseResp resp = new CurrencyBaseResp();
        if(userMail.getMailCost() > 0)
            userInfoService.addMonetaryRewards(DianwanUserLoginInfo.getUserCode(), 2,
                    prefix + "领取邮件奖励获得" + userMail.getMailCost() + "金币", userMail.getMailCost(),
                    userMail.getMailId().toString(), RewardSourceTypeEnum.MAIL);
        if(userMail.getMailIntegral() > 0)
            userInfoService.addMonetaryRewards(DianwanUserLoginInfo.getUserCode(), 1,
                    prefix + "领取邮件奖励获得" + userMail.getMailIntegral() + "积分", userMail.getMailIntegral(),
                    userMail.getMailId().toString(), RewardSourceTypeEnum.MAIL);
        resp.setMoney(userMail.getMailCost());
        resp.setIntegral(userMail.getMailIntegral());
        if(userMail.getVoucherId() != null && userMail.getVoucherId() > 0
                && userMail.getVoucherNum() != null && userMail.getVoucherNum() > 0) {
            
            UtilCardVoucher cardVoucher = utilCardVoucherService.getCardVoucher(userMail.getVoucherId());
            if(cardVoucher == null) {
                throw new BizException(ResultCode.FAIL, "卡券不存在!");
            }
            String timestr = LocalDateTimeUtil.formatNormal(LocalDateTime.now());
            UserCardVoucher userCardVoucher = new UserCardVoucher();
            userCardVoucher.setUserId(DianwanUserLoginInfo.getUserId());
            userCardVoucher.setGxsj(timestr);
            userCardVoucher.setLrsj(timestr);
            userCardVoucher.setBz("邮件领取-"+userMail.getMailId());
            userCardVoucher.setZt(2);
            userCardVoucher.setVoucherSrcId(cardVoucher.getVoucherId());
            userCardVoucher.setVoucherType(cardVoucher.getVoucherType());
            userCardVoucher.setVoucherName(cardVoucher.getVoucherName());
            userCardVoucher.setVoucherExplain(cardVoucher.getVoucherExplain());
            userCardVoucher.setVoucherNum(cardVoucher.getVoucherNum());
            userCardVoucher.setVoucherTime(cardVoucher.getVoucherTime());
            if(cardVoucher.getVoucherTime() <= 0) {
                
                userCardVoucher.setVoucherExpireTime(LocalDateTimeUtil.formatNormal(LocalDateTime.now().plusDays(100)));
            } else {
                userCardVoucher.setVoucherExpireTime(LocalDateTimeUtil.formatNormal(LocalDateTime.now().plusMinutes(cardVoucher.getVoucherTime())));
            }
            for (int i = 0; i < userMail.getVoucherNum(); i++) {
                userCardVoucherService.insertUserCardVoucher(userCardVoucher);
            }
            
        }
        ThreadManager.executeOrderIoTask(userMail.getUserId(), new BaseRunnable() {
            @Override
            public void execute() {
                RedDotTypeEnum.EMAIL_UNREAD.operateRedDotAndNotify(DianwanUserLoginInfo.getUserCode(), true);
            }

            @Override
            public String getName() {
                return "领取减少邮件红点数据-" + mailId;
            }
        });
        return resp;
    }

    @Override
    public int updateMailState(Long mailId, Integer state) {
        UserMail stateMail = new UserMail();
        stateMail.setZt(state);
        stateMail.setGxsj(LocalDateTimeUtil.formatNormal(LocalDateTime.now()));
        int upLine = userMailMapper.updateByConditionSelective(stateMail, Condition.builder(UserMail.class).where(
                Sqls.custom().andEqualTo("mailId", mailId)
                        .andNotEqualTo("zt", state)
        ).build());
        if(upLine > 0) {
            userMailService.clearUserMailCache(mailId);
        }
        return upLine;
    }

    @Override
    @Cacheable(value = "FIVE_TRANSIENT", key = "'getUserMail-' + #mailId")
    public UserMail getUserMail(Long mailId) {
        UserMail userMail = userMailMapper.selectByPrimaryKey(mailId);
        if(userMail.getDel()) {
            return null;
        }
        return userMail;
    }

    @Override
    @CacheEvict(value = "FIVE_TRANSIENT", key = "'getUserMail-' + #mailId")
    public void clearUserMailCache(Long mailId) {

    }

    @Override
    public int deleteUserMail(Long mailId) {
        int del = userMailMapper.updateByPrimaryKeySelective(UserMail.builder().mailId(mailId).del(true).build());
        if(del > 0) {
            userMailService.clearUserMailCache(mailId);
        }
        return del;
    }

    @Override
    public int sendMail(UserMail userMail, String userCode) {
        if(userMail == null) throw new BizException(ResultCode.FAIL, "邮件内容不能为空");
        int insertSelective = userMailMapper.insertSelective(userMail);
        ThreadManager.executeOrderIoTask(userMail.getUserId(), new BaseRunnable() {
            @Override
            public void execute() {
                RedDotTypeEnum.EMAIL_UNREAD.operateRedDotAndNotify(userCode, false);
            }

            @Override
            public String getName() {
                return "刷新玩家邮件红点-" + userMail.getMailId();
            }
        });
        return insertSelective;
    }

    @Override
    public int batchSendMail(List<UserMail> userMails, List<String> userCodes) {
        if(CollectionUtils.isEmpty(userMails) || CollectionUtils.isEmpty(userCodes)) return 0;
        Assert.isTrue(userMails.size() == userCodes.size(), "玩家邮件数据不匹配...");
        int sucCnt = userMailMapper.insertList(userMails);
        for(int i=0; i<userMails.size(); i++) {
            UserMail userMail = userMails.get(i);
            String userCode = userCodes.get(i);
            ThreadManager.executeOrderIoTask(userMail.getUserId(), new BaseRunnable() {
                @Override
                public void execute() {
                    RedDotTypeEnum.EMAIL_UNREAD.operateRedDotAndNotify(userCode, false);
                }

                @Override
                public String getName() {
                    return "批量刷新玩家邮件红点-" + userMail.getMailId();
                }
            });
        }
        return sucCnt;
    }
}
