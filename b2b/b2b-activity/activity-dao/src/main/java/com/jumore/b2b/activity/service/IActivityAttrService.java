/**
 * 活动属性
 * IActivityAttrService.java
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
import com.jumore.b2b.activity.model.ActivityAttr;
import com.jumore.b2b.activity.model.ActivityAttrQueryHelper;

public interface IActivityAttrService extends IBaseService<ActivityAttr, ActivityAttrQueryHelper> {
    /**
     *分页查询
     */
    Pages<ActivityAttr> browser(ActivityAttr activityAttr, int length, int offset);

    /**
     *添加
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long insert(ActivityAttr activityAttr);

    /**
     *删除
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long delete(List<ActivityAttr> activityAttr);

    /**
     *更新
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long update(ActivityAttr activityAttr);

    /**
     *查询唯一条记录
     */
    ActivityAttr selectUnique(ActivityAttr activityAttr);
}