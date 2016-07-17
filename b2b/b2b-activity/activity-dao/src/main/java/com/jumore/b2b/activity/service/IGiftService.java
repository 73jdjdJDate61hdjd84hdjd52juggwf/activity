/**
 * 奖励
 * IGiftService.java
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
import com.jumore.b2b.activity.model.Gift;
import com.jumore.b2b.activity.model.GiftQueryHelper;

public interface IGiftService extends IBaseService<Gift, GiftQueryHelper> {
    /**
     *分页查询
     */
    Pages<Gift> browser(Gift gift, int length, int offset);

    /**
     *添加
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long insert(Gift gift);

    /**
     *删除
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long delete(List<Gift> gift);

    /**
     *更新
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long update(Gift gift);

    /**
     *查询唯一条记录
     */
    Gift selectUnique(Gift gift);
}	