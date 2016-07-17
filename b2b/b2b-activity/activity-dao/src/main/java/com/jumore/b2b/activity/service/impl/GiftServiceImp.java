/**
 * 奖励
 * GiftServiceImp.java
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
import com.jumore.b2b.activity.mapper.GiftMapper;
import com.jumore.b2b.activity.model.Gift;
import com.jumore.b2b.activity.model.GiftQueryHelper;
import com.jumore.b2b.activity.service.IGiftService;

@org.springframework.stereotype.Service
public class GiftServiceImp extends BaseServiceImp<Gift, GiftQueryHelper> implements IGiftService {
    static final Logger log = LogManager.getLogger(GiftServiceImp.class);;

    GiftMapper giftMapper;

    @Resource
    public void setGiftMapper(GiftMapper giftMapper) {
        this.giftMapper=giftMapper;
        //this.setBaseMapper(giftMapper);
    }

    /**
    *综合查询
     */
    public Pages<Gift> browser(Gift gift, int length, int offset) {
        GiftQueryHelper example = new GiftQueryHelper();
        /** 查询业务逻辑 **/
        
        // example.createCriteria().andXXXEqualTo(xx.())
        
         /** 查询业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        List<Gift> list = new ArrayList<Gift>();
        long total = giftMapper.countByExample(example);
        if (total > 0) {
            /**排序业务逻辑 **/
            //example.setOrderByClause(XX)
            /** 排序业务逻辑完 **/
            /**######################_我是分隔线######################**/
            //分页插件查询
            PageHelper.startPage(offset, length);
            list = giftMapper.selectByExample(example);
            PageInfo<Gift> page = new PageInfo<Gift>(list);
            list=page.getList();
        }
        return new Pages<com.jumore.b2b.activity.model.Gift>(list, total, offset, length);
    }

    /**
     *添加
     */
    public long append(Gift gift) {
        /** 新增业务逻辑 **/
        
        
        /** 新增业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return giftMapper.insert(gift);
    }

    /**
     *添加
     */
    public long delete(List<Gift> gift) {
        /** 删除务逻辑 **/
        
        log.info("devlopping");
        
        /** 删除业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return 0;
    }

    /**
     *添加
     */
    public long update(Gift gift) {
        GiftQueryHelper e = new GiftQueryHelper();
        /** 更新业务逻辑 **/
        
        
         /** 更新业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return giftMapper.updateByExampleSelective(gift,e);
    }

    /**
     *添加
     */
    public Gift selectUnique(Gift gift) {
        GiftQueryHelper e = new GiftQueryHelper();
        /**　查询业务逻辑 **/
        
        
         /** 查询业务逻辑完 **/
        /**######################_我是分隔线######################**/
        List<Gift> list = giftMapper.selectByExample(e);
        if (list.size() != 1) 
        throw new RuntimeException("对象不存在!"); 
        return list.get(0);
    }
}