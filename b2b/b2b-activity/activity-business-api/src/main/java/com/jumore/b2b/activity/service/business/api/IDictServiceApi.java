/**
 * 数据字典
 * IDictService.java
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
import com.jumore.b2b.activity.service.business.io.request.DictReq;
import com.jumore.b2b.activity.service.business.io.response.DictRes;

public interface IDictServiceApi  {
    /**
     *分页查询
     */
    Pages<?> browser(DictReq dict, int length, int offset);

    /**
     *添加
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long insert(DictReq dict);

    /**
     *删除
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long delete(List<DictReq> dict);

    /**
     *更新
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long update(DictReq dict);

    /**
     *查询唯一条记录
     */
    DictRes selectUnique(DictReq dict);
}