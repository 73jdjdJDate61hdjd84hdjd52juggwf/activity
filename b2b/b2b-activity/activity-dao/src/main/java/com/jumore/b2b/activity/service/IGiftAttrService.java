/**
 * 奖励属性表
 * IgiftAttrService.java
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
import com.jumore.b2b.activity.model.GiftAttr;
import com.jumore.b2b.activity.model.GiftAttrQueryHelper;

public interface IGiftAttrService extends IBaseService<GiftAttr, GiftAttrQueryHelper> {
    /**
     *分页查询
     */
    Pages<GiftAttr> browser(GiftAttr giftAttr, int length, int offset);

    /**
     *添加
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long insert(GiftAttr giftAttr);

    /**
     *删除
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long delete(List<GiftAttr> giftAttr);

    /**
     *更新
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long update(GiftAttr giftAttr);

    /**
     *查询唯一条记录
     */
    GiftAttr selectUnique(GiftAttr giftAttr);
}