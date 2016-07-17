/**
 * 用户现金钱包
 * IUserEwalletService.java
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
import com.jumore.b2b.activity.model.UserEwallet;
import com.jumore.b2b.activity.model.UserEwalletQueryHelper;

public interface IUserEwalletService extends IBaseService<UserEwallet, UserEwalletQueryHelper> {
    /**
     *分页查询
     */
    Pages<UserEwallet> browser(UserEwallet userEwallet, int length, int offset);

    /**
     *添加
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long insert(UserEwallet userEwallet);

    /**
     *删除
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long delete(List<UserEwallet> userEwallet);

    /**
     *更新
     */
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor=Exception.class)
    long update(UserEwallet userEwallet);

    /**
     *查询唯一条记录
     */
    UserEwallet selectUnique(UserEwallet userEwallet);
}