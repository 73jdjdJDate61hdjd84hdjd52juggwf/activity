/**
 * 奖励属性表
 * IgiftAttrService.java
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
import com.jumore.b2b.activity.service.business.io.request.GiftAttrReq;
import com.jumore.b2b.activity.service.business.io.response.GiftAttrRes;

public interface IGiftAttrServiceApi  {
    /**
     *分页查询
     */
    Pages<?> browser(GiftAttrReq giftAttr, int length, int offset);

    /**
     *添加
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long insert(GiftAttrReq giftAttr);

    /**
     *删除
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long delete(List<GiftAttrReq> giftAttr);

    /**
     *更新
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long update(GiftAttrReq giftAttr);

    /**
     *查询唯一条记录
     */
    GiftAttrRes selectUnique(GiftAttrReq giftAttr);
}