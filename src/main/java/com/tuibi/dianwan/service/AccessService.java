package com.tuibi.dianwan.service;

import com.tuibi.dianwan.enums.AccessMarkEnum;
import com.tuibi.dianwan.pojo.UserAccessMark;

/**
 * @author: xx
 * 
 * @email: 
 */
public interface AccessService {
    /**
     * 5秒种
     * @param accessMark
     * @param userCode
     * @return
     */
    UserAccessMark getFiveSecAccessMark(AccessMarkEnum accessMark, String userCode);

    /**
     * 半分钟
     * @param accessMark
     * @param userCode
     * @return
     */
    UserAccessMark getHalfOneMinAccessMark(AccessMarkEnum accessMark, String userCode);

    /**
     * 1分钟
     * @param accessMark
     * @param userCode
     * @return
     */
    UserAccessMark getOneMinAccessMark(AccessMarkEnum accessMark, String userCode);
    /**
     * 1小时
     * @param accessMark
     * @param userCode
     * @return
     */
    UserAccessMark getOneHourAccessMark(AccessMarkEnum accessMark, String userCode);

}
