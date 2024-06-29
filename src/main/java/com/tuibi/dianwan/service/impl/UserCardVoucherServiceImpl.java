package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.entity.UserCardVoucher;
import com.tuibi.dianwan.mapper.UserCardVoucherMapper;
import com.tuibi.dianwan.service.UserCardVoucherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
@Slf4j
public class UserCardVoucherServiceImpl implements UserCardVoucherService {

    @Autowired
    private UserCardVoucherMapper userCardVoucherMapper;

    @Override
    public int insertUserCardVoucher(UserCardVoucher userCardVoucher) {
        return userCardVoucherMapper.insertSelective(userCardVoucher);
    }

}
