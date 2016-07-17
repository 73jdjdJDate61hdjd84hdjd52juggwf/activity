/**
 * 奖励类别 
 * IGiftCategoryService.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-01 Created
 */
package com.jumore.b2b.activity.service.business.api;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.business.io.request.GiftCategoryReq;
import com.jumore.b2b.activity.service.business.io.response.GiftCategoryRes;

public interface IGiftCategoryApi  {
    /**
     *分页查询
     */
    Pages<?> browser(GiftCategoryReq giftCategory, int length, int offset);

    /**
     *添加
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long insert(GiftCategoryReq giftCategory);

    /**
     *删除
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long delete(List<GiftCategoryReq> giftCategory);

    /**
     *更新
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long update(GiftCategoryReq giftCategory);

    /**
     *查询唯一条记录
     */
    GiftCategoryRes selectUnique(GiftCategoryReq giftCategory);
}