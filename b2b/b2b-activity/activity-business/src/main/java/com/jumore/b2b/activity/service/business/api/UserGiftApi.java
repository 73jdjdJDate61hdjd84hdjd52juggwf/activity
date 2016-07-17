/**
 * 用户礼物表
 * UserGiftServiceImp.java
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

import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.IUserGiftService;
import com.jumore.b2b.activity.service.business.io.request.UserGiftReq;
import com.jumore.b2b.activity.service.business.io.response.UserGiftRes;
@com.alibaba.dubbo.config.annotation.Service
public class UserGiftApi  implements IUserGiftApi {
    static final Logger log = LogManager.getLogger(UserGiftApi.class);;

    @Resource
    IUserGiftService UserGiftService;

	@Override
	public Pages<?> browser(UserGiftReq userGift, int length, int offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long insert(UserGiftReq userGift) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long delete(List<UserGiftReq> userGift) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long update(UserGiftReq userGift) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserGiftRes selectUnique(UserGiftReq userGift) {
		// TODO Auto-generated method stub
		return null;
	}

}