/**
 * 奖励
 * GiftServiceImp.java
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
import com.jumore.b2b.activity.model.Gift;
import com.jumore.b2b.activity.model.GiftQueryHelper;
import com.jumore.b2b.activity.service.IGiftService;

public class GiftServiceImp implements IGiftService {
    static final Logger log = LogManager.getLogger(GiftServiceImp.class);;

    @Resource
    IGiftService giftService;

	@Override
	public int countByExample(GiftQueryHelper e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(GiftQueryHelper e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Gift t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long insertSelective(Gift t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Gift> selectByExample(GiftQueryHelper e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gift selectByPrimaryKey(Gift t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(Gift t, GiftQueryHelper e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Gift t, GiftQueryHelper e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Gift t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Gift t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Pages<Gift> browser(Gift gift, int length, int offset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long insert(Gift gift) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long delete(List<Gift> gift) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long update(Gift gift) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Gift selectUnique(Gift gift) {
		// TODO Auto-generated method stub
		return null;
	}

    
}