/**
 * 用户现金钱包
 * UserEwalletServiceImp.java
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

import com.jumore.b2b.activity.service.IUserEwalletService;
import com.jumore.b2b.activity.service.business.io.request.UserEwalletReq;
import com.jumore.b2b.activity.service.business.io.response.UserEwalletRes;
@com.alibaba.dubbo.config.annotation.Service
public class UserEwalletApi implements IUserEwalletApi {
	static final Logger log = LogManager.getLogger(UserEwalletApi.class);;

	@Resource
	IUserEwalletService userEwalletService;

	@Override
	public com.jumore.b2b.activity.comm.Pages<?> browser(
			UserEwalletReq userEwallet, int length, int offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long insert(UserEwalletReq userEwallet) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long delete(List<UserEwalletReq> userEwallet) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long update(UserEwalletReq userEwallet) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserEwalletRes selectUnique(UserEwalletReq userEwallet) {
		// TODO Auto-generated method stub
		return null;
	}

}