package com.tuibi.dianwan.service.impl;

import com.tuibi.dianwan.enums.AccessMarkEnum;
import com.tuibi.dianwan.pojo.UserAccessMark;
import com.tuibi.dianwan.service.AccessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author: xx
 * 
 * @email: 
 */
@Service
@Slf4j
public class AccessServiceImpl implements AccessService {

    @Override
    @Cacheable(value = "FIVE", key = "'getFiveSecAccessMark-' + #userCode + '-' + #accessMark.name()")
    public UserAccessMark getFiveSecAccessMark(AccessMarkEnum accessMark, String userCode) {
        return new UserAccessMark();
    }

    @Override
    @Cacheable(value = "HALF_TRANSIENT", key = "'getHalfOneMinAccessMark-' + #userCode + '-' + #accessMark.name()")
    public UserAccessMark getHalfOneMinAccessMark(AccessMarkEnum accessMark, String userCode) {
        return new UserAccessMark();
    }

    @Override
    @Cacheable(value = "TRANSIENT", key = "'getOneMinAccessMark-' + #userCode + '-' + #accessMark.name()")
    public UserAccessMark getOneMinAccessMark(AccessMarkEnum accessMark, String userCode) {
        return new UserAccessMark();
    }

    @Override
    @Cacheable(value = "LONG", key = "'getOneHourAccessMark-' + #userCode + '-' + #accessMark.name()")
    public UserAccessMark getOneHourAccessMark(AccessMarkEnum accessMark, String userCode) {
        return new UserAccessMark();
    }

}
