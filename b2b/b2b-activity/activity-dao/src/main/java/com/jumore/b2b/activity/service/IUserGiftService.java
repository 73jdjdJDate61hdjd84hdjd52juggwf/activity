/**
 * 用户礼物表
 * IUserGiftService.java
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
import com.jumore.b2b.activity.model.UserGift;
import com.jumore.b2b.activity.model.UserGiftQueryHelper;

public interface IUserGiftService extends IBaseService<UserGift, UserGiftQueryHelper> {
    /**
     *分页查询
     */
    Pages<UserGift> browser(UserGift userGift, int length, int offset);

    /**
     *添加
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long insert(UserGift userGift);

    /**
     *删除
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long delete(List<UserGift> userGift);

    /**
     *更新
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long update(UserGift userGift);

    /**
     *查询唯一条记录
     */
    UserGift selectUnique(UserGift userGift);
}