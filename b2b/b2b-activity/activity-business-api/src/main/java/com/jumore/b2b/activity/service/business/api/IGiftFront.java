/**
 * 奖励
 * IGiftService.java
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
import com.jumore.b2b.activity.comm.page.BaseModel;
import com.jumore.b2b.activity.service.business.io.request.GiftReq;
import com.jumore.b2b.activity.service.business.io.response.GiftRes;

public interface IGiftFront {
	/**
	 * 分页查询
	 */
	Pages<?> browser(GiftReq gift, int length, int offset);

	/**
	 * 添加
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	long insert(GiftReq gift);

	/**
	 * 删除
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	long delete(List<GiftReq> gift);

	/**
	 * 更新
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	long update(GiftReq gift);

	/**
	 * 查询唯一条记录
	 */
	GiftRes selectUnique(GiftReq gift);

	GiftRes select(GiftReq gift);

	/*
	 * 新的查询方法，查询，条件都放在一个对象里
	 */
	void browser(BaseModel<GiftReq, GiftRes> pages);
}