/**
 * 礼物日志表
 * UserGiftLogServiceImp.java
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
import com.jumore.b2b.activity.mapper.UserGiftLogMapper;
import com.jumore.b2b.activity.model.UserGiftLog;
import com.jumore.b2b.activity.model.UserGiftLogQueryHelper;
import com.jumore.b2b.activity.service.IUserGiftLogService;

@org.springframework.stereotype.Service
public class UserGiftLogServiceImp extends BaseServiceImp<UserGiftLog, UserGiftLogQueryHelper> implements IUserGiftLogService {
    static final Logger log = LogManager.getLogger(UserGiftLogServiceImp.class);;

    UserGiftLogMapper userGiftLogMapper;

    @Resource
    public void setUserGiftLogMapper(UserGiftLogMapper userGiftLogMapper) {
        this.userGiftLogMapper=userGiftLogMapper;
        //this.setBaseMapper(userGiftLogMapper);
    }

    /**
    *综合查询
     */
    public Pages<UserGiftLog> browser(UserGiftLog userGiftLog, int length, int offset) {
        UserGiftLogQueryHelper example = new UserGiftLogQueryHelper();
        /** 查询业务逻辑 **/
        
        // example.createCriteria().andXXXEqualTo(xx.())
        
         /** 查询业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        List<UserGiftLog> list = new ArrayList<UserGiftLog>();
        long total = userGiftLogMapper.countByExample(example);
        if (total > 0) {
            /**排序业务逻辑 **/
            //example.setOrderByClause(XX)
            /** 排序业务逻辑完 **/
            /**######################_我是分隔线######################**/
            //分页插件查询
            PageHelper.startPage(offset, length);
            list = userGiftLogMapper.selectByExample(example);
            PageInfo<UserGiftLog> page = new PageInfo<UserGiftLog>(list);
            list=page.getList();
        }
        return new Pages<com.jumore.b2b.activity.model.UserGiftLog>(list, total, offset, length);
    }

    /**
     *添加
     */
    public long append(UserGiftLog userGiftLog) {
        /** 新增业务逻辑 **/
        
        
        /** 新增业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return userGiftLogMapper.insert(userGiftLog);
    }

    /**
     *添加
     */
    public long delete(List<UserGiftLog> userGiftLog) {
        /** 删除务逻辑 **/
        
        log.info("devlopping");
        
        /** 删除业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return 0;
    }

    /**
     *添加
     */
    public long update(UserGiftLog userGiftLog) {
        UserGiftLogQueryHelper e = new UserGiftLogQueryHelper();
        /** 更新业务逻辑 **/
        
        
         /** 更新业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return userGiftLogMapper.updateByExampleSelective(userGiftLog,e);
    }

    /**
     *添加
     */
    public UserGiftLog selectUnique(UserGiftLog userGiftLog) {
        UserGiftLogQueryHelper e = new UserGiftLogQueryHelper();
        /**　查询业务逻辑 **/
        
        
         /** 查询业务逻辑完 **/
        /**######################_我是分隔线######################**/
        List<UserGiftLog> list = userGiftLogMapper.selectByExample(e);
        if (list.size() != 1) 
        throw new RuntimeException("对象不存在!"); 
        return list.get(0);
    }
}