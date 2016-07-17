/**
 * 活动属性
 * ActivityAttrServiceImp.java
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
import com.jumore.b2b.activity.mapper.ActivityAttrMapper;
import com.jumore.b2b.activity.model.ActivityAttr;
import com.jumore.b2b.activity.model.ActivityAttrQueryHelper;
import com.jumore.b2b.activity.service.IActivityAttrService;

@org.springframework.stereotype.Service
public class ActivityAttrServiceImp extends BaseServiceImp<ActivityAttr, ActivityAttrQueryHelper> implements IActivityAttrService {
    static final Logger log = LogManager.getLogger(ActivityAttrServiceImp.class);;

    ActivityAttrMapper activityAttrMapper;

    @Autowired
    public void setActivityAttrMapper(ActivityAttrMapper activityAttrMapper) {
        this.activityAttrMapper=activityAttrMapper;
        this.setBaseMapper(activityAttrMapper);
    }

    /**
    *综合查询
     */
    public Pages<ActivityAttr> browser(ActivityAttr activityAttr, int length, int offset) {
        ActivityAttrQueryHelper example = new ActivityAttrQueryHelper();
        /** 查询业务逻辑 **/
        
        // example.createCriteria().andXXXEqualTo(xx.())
        
         /** 查询业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        List<ActivityAttr> list = new ArrayList<ActivityAttr>();
        long total = activityAttrMapper.countByExample(example);
        if (total > 0) {
            /**排序业务逻辑 **/
            //example.setOrderByClause(XX)
            /** 排序业务逻辑完 **/
            /**######################_我是分隔线######################**/
            //分页插件查询
            PageHelper.startPage(offset, length);
            list = activityAttrMapper.selectByExample(example);
            PageInfo<ActivityAttr> page = new PageInfo<ActivityAttr>(list);
            list=page.getList();
        }
        return new Pages<com.jumore.b2b.activity.model.ActivityAttr>(list, total, offset, length);
    }

    /**
     *添加
     */
    public long append(ActivityAttr activityAttr) {
        /** 新增业务逻辑 **/
        
        
        /** 新增业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return activityAttrMapper.insert(activityAttr);
    }

    /**
     *添加
     */
    public long delete(List<ActivityAttr> activityAttr) {
        /** 删除务逻辑 **/
        
        log.info("devlopping");
        
        /** 删除业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return 0;
    }

    /**
     *添加
     */
    public long update(ActivityAttr activityAttr) {
        ActivityAttrQueryHelper e = new ActivityAttrQueryHelper();
        /** 更新业务逻辑 **/
        
        
         /** 更新业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return activityAttrMapper.updateByExampleSelective(activityAttr,e);
    }

    /**
     *添加
     */
    public ActivityAttr selectUnique(ActivityAttr activityAttr) {
        ActivityAttrQueryHelper e = new ActivityAttrQueryHelper();
        /**　查询业务逻辑 **/
        
        
         /** 查询业务逻辑完 **/
        /**######################_我是分隔线######################**/
        List<ActivityAttr> list = activityAttrMapper.selectByExample(e);
        if (list.size() != 1) 
        throw new RuntimeException("对象不存在!"); 
        return list.get(0);
    }
}