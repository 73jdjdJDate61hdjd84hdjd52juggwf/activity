/**
 * 用户礼物表
 * IUserGiftService.java
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
import com.jumore.b2b.activity.service.business.io.request.UserGiftReq;
import com.jumore.b2b.activity.service.business.io.response.UserGiftRes;

public interface IUserGiftApi {
	/**
	 * 分页查询
	 */
	Pages<?> browser(UserGiftReq userGift, int length, int offset);

	/**
	 * 添加
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	long insert(UserGiftReq userGift);

	/**
	 * 删除
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	long delete(List<UserGiftReq> userGift);

	/**
	 * 更新
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	long update(UserGiftReq userGift);

	/**
	 * 查询唯一条记录
	 */
	UserGiftRes selectUnique(UserGiftReq userGift);
}