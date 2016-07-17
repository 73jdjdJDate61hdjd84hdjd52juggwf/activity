/**
 * 礼物日志表
 * IUserGiftLogService.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-01 Created
 */
package com.jumore.b2b.activity.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jumore.b2b.activity.base.service.single.IBaseService;
import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.model.UserGiftLog;
import com.jumore.b2b.activity.model.UserGiftLogQueryHelper;

public interface IUserGiftLogService extends IBaseService<UserGiftLog, UserGiftLogQueryHelper> {
    /**
     *分页查询
     */
    Pages<UserGiftLog> browser(UserGiftLog userGiftLog, int length, int offset);

    /**
     *添加
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long insert(UserGiftLog userGiftLog);

    /**
     *删除
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long delete(List<UserGiftLog> userGiftLog);

    /**
     *更新
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long update(UserGiftLog userGiftLog);

    /**
     *查询唯一条记录
     */
    UserGiftLog selectUnique(UserGiftLog userGiftLog);
}