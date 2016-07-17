/**
 * 数据字典
 * IDictService.java
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
import com.jumore.b2b.activity.model.Dict;
import com.jumore.b2b.activity.model.DictQueryHelper;

public interface IDictService extends IBaseService<Dict, DictQueryHelper> {
    /**
     *分页查询
     */
    Pages<Dict> browser(Dict dict, int length, int offset);

    /**
     *添加
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long insert(Dict dict);

    /**
     *删除
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long delete(List<Dict> dict);

    /**
     *更新
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long update(Dict dict);

    /**
     *查询唯一条记录
     */
    Dict selectUnique(Dict dict);
}