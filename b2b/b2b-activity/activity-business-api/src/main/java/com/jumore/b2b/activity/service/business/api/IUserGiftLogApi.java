/**
 * 礼物日志表
 * IUserGiftLogService.java
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
import com.jumore.b2b.activity.service.business.io.request.UserGiftLogReq;

public interface IUserGiftLogApi {
	/**
	 * 分页查询
	 */
	Pages<?> browser(UserGiftLogReq userGiftLog, int length,
			int offset);

	/**
	 * 添加
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	long insert(UserGiftLogReq userGiftLog);

	/**
	 * 删除
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	long delete(List<UserGiftLogReq> userGiftLog);

	/**
	 * 更新
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	long update(UserGiftLogReq userGiftLog);

	/**
	 * 查询唯一条记录
	 */
	UserGiftLogReq selectUnique(UserGiftLogReq userGiftLog);
}