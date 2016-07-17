/**
 * 奖励属性表
 * giftAttrServiceImp.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-01 Created
 */
package com.jumore.b2b.activity.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jumore.b2b.activity.base.service.single.BaseServiceImp;
import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.mapper.GiftAttrMapper;
import com.jumore.b2b.activity.model.GiftAttr;
import com.jumore.b2b.activity.model.GiftAttrQueryHelper;
import com.jumore.b2b.activity.service.IGiftAttrService;

@org.springframework.stereotype.Service
public class GiftAttrServiceImp extends
		BaseServiceImp<GiftAttr, GiftAttrQueryHelper> implements
		IGiftAttrService {
	static final Logger log = LogManager.getLogger(GiftAttrServiceImp.class);;

	GiftAttrMapper giftAttrMapper;

	@Autowired
	public void setGiftAttrMapper(GiftAttrMapper giftAttrMapper) {
		this.giftAttrMapper = giftAttrMapper;
		this.setBaseMapper(giftAttrMapper);
	}

	/**
	 * 综合查询
	 */
	public Pages<GiftAttr> browser(GiftAttr giftAttr, int length, int offset) {
		GiftAttrQueryHelper example = new GiftAttrQueryHelper();
		/** 查询业务逻辑 **/

		// example.createCriteria().andXXXEqualTo(xx.())

		/** 查询业务逻辑完 **/
		/** ######################_我是分隔线###################### **/

		List<GiftAttr> list = new ArrayList<GiftAttr>();
		long total = giftAttrMapper.countByExample(example);
		if (total > 0) {
			/** 排序业务逻辑 **/
			// example.setOrderByClause(XX)
			/** 排序业务逻辑完 **/
			/** ######################_我是分隔线###################### **/
			// 分页插件查询
			PageHelper.startPage(offset, length);
			list = giftAttrMapper.selectByExample(example);
			PageInfo<GiftAttr> page = new PageInfo<GiftAttr>(list);
			list = page.getList();
		}
		return new Pages<com.jumore.b2b.activity.model.GiftAttr>(list, total,
				offset, length);
	}

	/**
	 * 添加
	 */
	public long append(GiftAttr giftAttr) {
		/** 新增业务逻辑 **/

		/** 新增业务逻辑完 **/
		/** ######################_我是分隔线###################### **/

		return giftAttrMapper.insert(giftAttr);
	}

	/**
	 * 添加
	 */
	public long delete(List<GiftAttr> giftAttr) {
		/** 删除务逻辑 **/

		log.info("devlopping");

		/** 删除业务逻辑完 **/
		/** ######################_我是分隔线###################### **/

		return 0;
	}

	/**
	 * 添加
	 */
	public long update(GiftAttr giftAttr) {
		GiftAttrQueryHelper e = new GiftAttrQueryHelper();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** ######################_我是分隔线###################### **/

		return giftAttrMapper.updateByExampleSelective(giftAttr, e);
	}

	/**
	 * 添加
	 */
	public GiftAttr selectUnique(GiftAttr giftAttr) {
		GiftAttrQueryHelper e = new GiftAttrQueryHelper();
		/** 　查询业务逻辑 **/

		/** 查询业务逻辑完 **/
		/** ######################_我是分隔线###################### **/
		List<GiftAttr> list = giftAttrMapper.selectByExample(e);
		if (list.size() != 1)
			throw new RuntimeException("对象不存在!");
		return list.get(0);
	}
}