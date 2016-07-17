/**
 * 奖励类别 
 * IGiftCategoryService.java
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
import com.jumore.b2b.activity.model.GiftCategory;
import com.jumore.b2b.activity.model.GiftCategoryQueryHelper;

public interface IGiftCategoryService extends IBaseService<GiftCategory, GiftCategoryQueryHelper> {
    /**
     *分页查询
     */
    Pages<GiftCategory> browser(GiftCategory giftCategory, int length, int offset);

    /**
     *添加
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long insert(GiftCategory giftCategory);

    /**
     *删除
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long delete(List<GiftCategory> giftCategory);

    /**
     *更新
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long update(GiftCategory giftCategory);

    /**
     *查询唯一条记录
     */
    GiftCategory selectUnique(GiftCategory giftCategory);
}