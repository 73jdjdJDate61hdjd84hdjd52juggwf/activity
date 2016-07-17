/**
 * 数据字典
 * DictServiceImp.java
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
import com.jumore.b2b.activity.mapper.DictMapper;
import com.jumore.b2b.activity.model.Dict;
import com.jumore.b2b.activity.model.DictQueryHelper;
import com.jumore.b2b.activity.service.IDictService;

@org.springframework.stereotype.Service
public class DictServiceImp extends BaseServiceImp<Dict, DictQueryHelper> implements IDictService {
    static final Logger log = LogManager.getLogger(DictServiceImp.class);;

    DictMapper dictMapper;

    @Resource
    public void setDictMapper(DictMapper dictMapper) {
        this.dictMapper=dictMapper;
        //this.setBaseMapper(dictMapper);
    }

    /**
    *综合查询
     */
    public Pages<Dict> browser(Dict dict, int length, int offset) {
        DictQueryHelper example = new DictQueryHelper();
        /** 查询业务逻辑 **/
        
        // example.createCriteria().andXXXEqualTo(xx.())
        
         /** 查询业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        List<Dict> list = new ArrayList<Dict>();
        long total = dictMapper.countByExample(example);
        if (total > 0) {
            /**排序业务逻辑 **/
            //example.setOrderByClause(XX)
            /** 排序业务逻辑完 **/
            /**######################_我是分隔线######################**/
            //分页插件查询
            PageHelper.startPage(offset, length);
            list = dictMapper.selectByExample(example);
            PageInfo<Dict> page = new PageInfo<Dict>(list);
            list=page.getList();
        }
        return new Pages<com.jumore.b2b.activity.model.Dict>(list, total, offset, length);
    }

    /**
     *添加
     */
    public long append(Dict dict) {
        /** 新增业务逻辑 **/
        
        
        /** 新增业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return dictMapper.insert(dict);
    }

    /**
     *添加
     */
    public long delete(List<Dict> dict) {
        /** 删除务逻辑 **/
        
        log.info("devlopping");
        
        /** 删除业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return 0;
    }

    /**
     *添加
     */
    public long update(Dict dict) {
        DictQueryHelper e = new DictQueryHelper();
        /** 更新业务逻辑 **/
        
        
         /** 更新业务逻辑完 **/
        /**######################_我是分隔线######################**/
        
        return dictMapper.updateByExampleSelective(dict,e);
    }

    /**
     *添加
     */
    public Dict selectUnique(Dict dict) {
        DictQueryHelper e = new DictQueryHelper();
        /**　查询业务逻辑 **/
        
        
         /** 查询业务逻辑完 **/
        /**######################_我是分隔线######################**/
        List<Dict> list = dictMapper.selectByExample(e);
        if (list.size() != 1) 
        throw new RuntimeException("对象不存在!"); 
        return list.get(0);
    }
}