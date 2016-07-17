/**
 * 用户现金钱包
 * IUserEwalletService.java
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
import com.jumore.b2b.activity.service.business.io.request.UserEwalletReq;
import com.jumore.b2b.activity.service.business.io.response.UserEwalletRes;

public interface IUserEwalletApi {
	/**
	 * 分页查询
	 */
	Pages<?> browser(UserEwalletReq userEwallet, int length,
			int offset);

	/**
	 * 添加
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	long insert(UserEwalletReq userEwallet);

	/**
	 * 删除
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	long delete(List<UserEwalletReq> userEwallet);

	/**
	 * 更新
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	long update(UserEwalletReq userEwallet);

	/**
	 * 查询唯一条记录
	 */
	UserEwalletRes selectUnique(UserEwalletReq userEwallet);
}