/**
 * 奖励类别 
 * GiftCategoryServiceImp.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-01 Created
 */
package com.jumore.b2b.activity.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jumore.b2b.activity.base.service.single.BaseServiceImp;
import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.mapper.GiftCategoryMapper;
import com.jumore.b2b.activity.model.GiftCategory;
import com.jumore.b2b.activity.model.GiftCategoryQueryHelper;
import com.jumore.b2b.activity.service.IGiftCategoryService;

@org.springframework.stereotype.Service
public class GiftCategoryServiceImp extends BaseServiceImp<GiftCategory, GiftCategoryQueryHelper> implements IGiftCategoryService {
    static final Logger log = LogManager.getLogger(GiftCategoryServiceImp.class);;

    GiftCategoryMapper giftCategoryMapper;

    @Resource
    public void setGiftCategoryMapper(GiftCategoryMapper giftCategoryMapper) {
        this.giftCategoryMapper=giftCategoryMapper;
        //this.setBaseMapper(giftCategoryMapper);
    }

    /**
    *综合查询
     */
    public Pages<GiftCategory> browser(GiftCategory giftCategory, int length, int offset) {
        GiftCategoryQueryHelper example = new GiftCategoryQueryHelper();
        /** 查询业务逻辑 **/
        
        // example.createCriteria().andXXXEqualTo(xx.())
        
         /** 查询业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        List<GiftCategory> list = new ArrayList<GiftCategory>();
        long total = giftCategoryMapper.countByExample(example);
        if (total > 0) {
            /**排序业务逻辑 **/
            //example.setOrderByClause(XX)
            /** 排序业务逻辑完 **/
            /**######################_我是分隔线######################**/
            //分页插件查询
            PageHelper.startPage(offset, length);
            list = giftCategoryMapper.selectByExample(example);
            PageInfo<GiftCategory> page = new PageInfo<GiftCategory>(list);
            list=page.getList();
        }
        return new Pages<com.jumore.b2b.activity.model.GiftCategory>(list, total, offset, length);
    }

    /**
     *添加
     */
    public long append(GiftCategory giftCategory) {
        /** 新增业务逻辑 **/
        
        
        /** 新增业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return giftCategoryMapper.insert(giftCategory);
    }

    /**
     *添加
     */
    public long delete(List<GiftCategory> giftCategory) {
        /** 删除务逻辑 **/
        
        log.info("devlopping");
        
        /** 删除业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return 0;
    }

    /**
     *添加
     */
    public long update(GiftCategory giftCategory) {
        GiftCategoryQueryHelper e = new GiftCategoryQueryHelper();
        /** 更新业务逻辑 **/
        
        
         /** 更新业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return giftCategoryMapper.updateByExampleSelective(giftCategory,e);
    }

    /**
     *添加
     */
    public GiftCategory selectUnique(GiftCategory giftCategory) {
        GiftCategoryQueryHelper e = new GiftCategoryQueryHelper();
        /**　查询业务逻辑 **/
        
        
         /** 查询业务逻辑完 **/
        /**######################_我是分隔线######################**/
        List<GiftCategory> list = giftCategoryMapper.selectByExample(e);
        if (list.size() != 1) 
        throw new RuntimeException("对象不存在!"); 
        return list.get(0);
    }
}