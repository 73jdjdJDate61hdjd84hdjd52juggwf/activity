/**
 * 奖励属性表
 * GiftAttrServiceImp.java
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
import com.jumore.b2b.activity.service.IGiftAttrService;
import com.jumore.b2b.activity.service.business.io.request.GiftAttrReq;
import com.jumore.b2b.activity.service.business.io.response.GiftAttrRes;
@com.alibaba.dubbo.config.annotation.Service
public class GiftAttrServiceApi  implements IGiftAttrServiceApi  {
    static final Logger log = LogManager.getLogger(GiftAttrServiceApi.class);;

    @Resource
    IGiftAttrService giftAttrService;

	@Override
	public Pages<?> browser(GiftAttrReq giftAttr, int length, int offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long insert(GiftAttrReq giftAttr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long delete(List<GiftAttrReq> giftAttr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long update(GiftAttrReq giftAttr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public GiftAttrRes selectUnique(GiftAttrReq giftAttr) {
		// TODO Auto-generated method stub
		return null;
	}


}