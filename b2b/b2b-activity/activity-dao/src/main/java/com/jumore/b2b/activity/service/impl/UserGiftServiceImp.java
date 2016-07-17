/**
 * 用户礼物表
 * UserGiftServiceImp.java
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
import com.jumore.b2b.activity.mapper.UserGiftMapper;
import com.jumore.b2b.activity.model.UserGift;
import com.jumore.b2b.activity.model.UserGiftQueryHelper;
import com.jumore.b2b.activity.service.IUserGiftService;

@org.springframework.stereotype.Service
public class UserGiftServiceImp extends BaseServiceImp<UserGift, UserGiftQueryHelper> implements IUserGiftService {
    static final Logger log = LogManager.getLogger(UserGiftServiceImp.class);;

    UserGiftMapper userGiftMapper;

    @Resource
    public void setUserGiftMapper(UserGiftMapper userGiftMapper) {
        this.userGiftMapper=userGiftMapper;
        //this.setBaseMapper(userGiftMapper);
    }

    /**
    *综合查询
     */
    public Pages<UserGift> browser(UserGift userGift, int length, int offset) {
        UserGiftQueryHelper example = new UserGiftQueryHelper();
        /** 查询业务逻辑 **/
        
        // example.createCriteria().andXXXEqualTo(xx.())
        
         /** 查询业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        List<UserGift> list = new ArrayList<UserGift>();
        long total = userGiftMapper.countByExample(example);
        if (total > 0) {
            /**排序业务逻辑 **/
            //example.setOrderByClause(XX)
            /** 排序业务逻辑完 **/
            /**######################_我是分隔线######################**/
            //分页插件查询
            PageHelper.startPage(offset, length);
            list = userGiftMapper.selectByExample(example);
            PageInfo<UserGift> page = new PageInfo<UserGift>(list);
            list=page.getList();
        }
        return new Pages<com.jumore.b2b.activity.model.UserGift>(list, total, offset, length);
    }

    /**
     *添加
     */
    public long append(UserGift userGift) {
        /** 新增业务逻辑 **/
        
        
        /** 新增业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return userGiftMapper.insert(userGift);
    }

    /**
     *添加
     */
    public long delete(List<UserGift> userGift) {
        /** 删除务逻辑 **/
        
        log.info("devlopping");
        
        /** 删除业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return 0;
    }

    /**
     *添加
     */
    public long update(UserGift userGift) {
        UserGiftQueryHelper e = new UserGiftQueryHelper();
        /** 更新业务逻辑 **/
        
        
         /** 更新业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return userGiftMapper.updateByExampleSelective(userGift,e);
    }

    /**
     *添加
     */
    public UserGift selectUnique(UserGift userGift) {
        UserGiftQueryHelper e = new UserGiftQueryHelper();
        /**　查询业务逻辑 **/
        
        
         /** 查询业务逻辑完 **/
        /**######################_我是分隔线######################**/
        List<UserGift> list = userGiftMapper.selectByExample(e);
        if (list.size() != 1) 
        throw new RuntimeException("对象不存在!"); 
        return list.get(0);
    }
}