/**
 * 活动表
 * IActivityService.java
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
import com.jumore.b2b.activity.service.business.io.request.ActivityReq;
import com.jumore.b2b.activity.service.business.io.response.ActivityRes;

public interface IActivityApi{
    /**
     *分页查询
     */
    Pages<?> browser(ActivityReq activity, int length, int offset);

    /**
     *添加
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long insert(ActivityReq activity);

    /**
     *删除
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long delete(List<ActivityReq> activity);

    /**
     *更新
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long update(ActivityReq activity);

    /**
     *查询唯一条记录
     */
    ActivityRes selectUnique(ActivityReq activity);
}