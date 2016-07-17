/**
 * 活动属性
 * IActivityAttrService.java
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
import com.jumore.b2b.activity.service.business.io.request.ActivityAttrReq;
import com.jumore.b2b.activity.service.business.io.response.ActivityAttrRes;

public interface IActivityAttrApi {
    /**
     *分页查询
     */
    Pages<?> browser(ActivityAttrReq activityAttrReq, int length, int offset);

    /**
     *添加
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long insert(ActivityAttrReq activityAttrReq);

    /**
     *删除
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long delete(List<ActivityAttrReq> activityAttrReq);

    /**
     *更新
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long update(ActivityAttrReq activityAttrReq);

    /**
     *查询唯一条记录
     */
    ActivityAttrRes selectUnique(ActivityAttrReq activityAttrReq);
    
    
    
}