/**
 * 奖励类别 
 * GiftCategoryServiceImp.java
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

import com.jumore.b2b.activity.service.IGiftCategoryService;
import com.jumore.b2b.activity.service.business.io.request.GiftCategoryReq;
import com.jumore.b2b.activity.service.business.io.response.GiftCategoryRes;

@com.alibaba.dubbo.config.annotation.Service
public class GiftCategoryApi implements IGiftCategoryApi{
    static final Logger log = LogManager.getLogger(GiftCategoryApi.class);;

    @Resource
    IGiftCategoryService giftCategoryService;

	@Override
	public com.jumore.b2b.activity.comm.Pages<?> browser(
			GiftCategoryReq giftCategory, int length, int offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long insert(GiftCategoryReq giftCategory) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long delete(List<GiftCategoryReq> giftCategory) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long update(GiftCategoryReq giftCategory) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GiftCategoryRes selectUnique(GiftCategoryReq giftCategory) {
		// TODO Auto-generated method stub
		return null;
	}


   
}