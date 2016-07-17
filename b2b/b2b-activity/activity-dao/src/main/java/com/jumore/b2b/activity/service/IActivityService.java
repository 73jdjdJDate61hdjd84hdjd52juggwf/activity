/**
 * 活动表
 * IActivityService.java
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
import com.jumore.b2b.activity.model.Activity;
import com.jumore.b2b.activity.model.ActivityQueryHelper;

public interface IActivityService extends IBaseService<Activity, ActivityQueryHelper> {
    /**
     *分页查询
     */
    Pages<Activity> browser(Activity activity, int length, int offset);

    /**
     *添加
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long insert(Activity activity);

    /**
     *删除
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long delete(List<Activity> activity);

    /**
     *更新
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long update(Activity activity);

    /**
     *查询唯一条记录
     */
    Activity selectUnique(Activity activity);
}