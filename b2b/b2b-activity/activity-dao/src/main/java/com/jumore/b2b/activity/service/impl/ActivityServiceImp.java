/**
 * 活动表
 * ActivityServiceImp.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-01 Created
 */
package com.jumore.b2b.activity.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jumore.b2b.activity.base.service.single.BaseServiceImp;
import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.mapper.ActivityMapper;
import com.jumore.b2b.activity.model.Activity;
import com.jumore.b2b.activity.model.ActivityQueryHelper;
import com.jumore.b2b.activity.service.IActivityService;

@org.springframework.stereotype.Service
public class ActivityServiceImp extends BaseServiceImp<Activity, ActivityQueryHelper> implements IActivityService {
    static final Logger log = LogManager.getLogger(ActivityServiceImp.class);;

    ActivityMapper activityMapper;

    @Autowired
    public void setActivityMapper(ActivityMapper activityMapper) {
        this.activityMapper=activityMapper;
        this.setBaseMapper(activityMapper);
    }

    /**
    *综合查询
     */
    public Pages<Activity> browser(Activity activity, int length, int offset) {
        ActivityQueryHelper example = new ActivityQueryHelper();
        /** 查询业务逻辑 **/
        
        // example.createCriteria().andXXXEqualTo(xx.())
        
         /** 查询业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        List<Activity> list = new ArrayList<Activity>();
        long total = activityMapper.countByExample(example);
        if (total > 0) {
            /**排序业务逻辑 **/
            //example.setOrderByClause(XX)
            /** 排序业务逻辑完 **/
            /**######################_我是分隔线######################**/
            //分页插件查询
            PageHelper.startPage(offset, length);
            list = activityMapper.selectByExample(example);
            PageInfo<Activity> page = new PageInfo<Activity>(list);
            list=page.getList();
        }
        return new Pages<com.jumore.b2b.activity.model.Activity>(list, total, offset, length);
    }

    /**
     *添加
     */
    public long append(Activity activity) {
        /** 新增业务逻辑 **/
        
        
        /** 新增业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return activityMapper.insert(activity);
    }

    /**
     *添加
     */
    public long delete(List<Activity> activity) {
        /** 删除务逻辑 **/
        
        log.info("devlopping");
        
        /** 删除业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return 0;
    }

    /**
     *添加
     */
    public long update(Activity activity) {
        ActivityQueryHelper e = new ActivityQueryHelper();
        /** 更新业务逻辑 **/
        
        
         /** 更新业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return activityMapper.updateByExampleSelective(activity,e);
    }

    /**
     *添加
     */
    public Activity selectUnique(Activity activity) {
        ActivityQueryHelper e = new ActivityQueryHelper();
        /**　查询业务逻辑 **/
        
        
         /** 查询业务逻辑完 **/
        /**######################_我是分隔线######################**/
        List<Activity> list = activityMapper.selectByExample(e);
        if (list.size() != 1) 
        throw new RuntimeException("对象不存在!"); 
        return list.get(0);
    }
}