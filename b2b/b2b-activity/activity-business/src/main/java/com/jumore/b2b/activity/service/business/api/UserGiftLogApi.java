/**
 * 礼物日志表
 * UserGiftLogServiceImp.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-17 Created
 */
package com.jumore.b2b.activity.service.business.api;

import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jumore.b2b.activity.service.IUserGiftLogService;
import com.jumore.b2b.activity.service.business.io.request.UserGiftLogReq;
@com.alibaba.dubbo.config.annotation.Service
public class UserGiftLogApi  implements IUserGiftLogApi {
    static final Logger log = LogManager.getLogger(UserGiftLogApi.class);;
    @Resource
    IUserGiftLogService UserGiftLogService;
	@Override
	public com.jumore.b2b.activity.comm.Pages<?> browser(
			UserGiftLogReq userGiftLog, int length, int offset) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public long insert(UserGiftLogReq userGiftLog) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long delete(List<UserGiftLogReq> userGiftLog) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long update(UserGiftLogReq userGiftLog) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public UserGiftLogReq selectUnique(UserGiftLogReq userGiftLog) {
		// TODO Auto-generated method stub
		return null;
	}

}