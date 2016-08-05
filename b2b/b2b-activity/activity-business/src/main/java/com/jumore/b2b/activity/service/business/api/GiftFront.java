/**
 * 奖励
 * GiftServiceImp.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-01 Created
 */
package com.jumore.b2b.activity.service.business.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.dozer.Mapper;

import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.comm.page.BaseModel;
import com.jumore.b2b.activity.core.util.SpringBeanUtils;
import com.jumore.b2b.activity.model.Gift;
import com.jumore.b2b.activity.model.GiftQueryHelper;
import com.jumore.b2b.activity.service.IGiftService;
import com.jumore.b2b.activity.service.business.io.request.GiftReq;
import com.jumore.b2b.activity.service.business.io.response.GiftRes;

@com.alibaba.dubbo.config.annotation.Service
public class GiftFront implements IGiftFront {
	static final Logger log = LogManager.getLogger(GiftFront.class);;

	
	IGiftService giftService;
	
	@Resource
    Mapper dozerMapper;
	
	
	/**
	 * 综合查询
	 */
	@Override
	public Pages<?> browser(GiftReq gift, int length, int offset) {
		GiftQueryHelper example = new GiftQueryHelper();
		/** 查询业务逻辑 **/
		// example.createCriteria().andXXXEqualTo(xx.())
		/** 查询业务逻辑完 **/
		/** ######################_我是分隔线###################### **/

		List<Gift> list = new ArrayList<Gift>();
		long total = giftService.countByExample(example);
		if (total > 0) {
			/** 排序业务逻辑 **/
			// example.setOrderByClause(XX)
			/** 排序业务逻辑完 **/
			/** ######################_我是分隔线###################### **/
			// 分页插件查询
			PageHelper.startPage(offset, length);
			list = giftService.selectByExample(example);
			PageInfo<Gift> page = new PageInfo<Gift>(list);
			list = page.getList();
		}
		return new Pages<com.jumore.b2b.activity.model.Gift>(list, total,
				offset, length);
	}

	/**
	 * 添加
	 */
	@Override
	public long insert(GiftReq giftReq) {
		/** 新增业务逻辑 **/

		/** 新增业务逻辑完 **/
		/** ######################_我是分隔线###################### **/
		Gift gift = new Gift();
		SpringBeanUtils.copyProperties(giftReq, gift);
		return giftService.insert(gift);
	}

	/**
	 * 添加
	 */
	@Override
	public long update(GiftReq giftRes) {
		Gift gift = new Gift();
		SpringBeanUtils.copyProperties(giftRes, gift);
		GiftQueryHelper e = new GiftQueryHelper();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** ######################_我是分隔线###################### **/

		return giftService.updateByExampleSelective(gift, e);
	}

	/**
	 * 添加
	 */
	@Override
	public GiftRes selectUnique(GiftReq giftReq) {
		GiftQueryHelper e = new GiftQueryHelper();
		/** 　查询业务逻辑 **/

		/** 查询业务逻辑完 **/
		/** ######################_我是分隔线###################### **/
		List<Gift> list = giftService.selectByExample(e);
		GiftRes giftRes = null;
		if (list.size() != 1)
			SpringBeanUtils.copyProperties(list.get(0), giftRes);

		return giftRes;
	}

	@Override
	public long delete(List<GiftReq> giftReqs) {
		long row = 0;
		for (GiftReq giftReq : giftReqs) {
			Gift gift = new Gift();
			gift.setID(giftReq.getID());
			row = row + giftService.deleteByPrimaryKey(gift);
		}
		return row;
	}

	@Override
	public	GiftRes select(GiftReq gift) {
		GiftQueryHelper example = new GiftQueryHelper();
		/** 查询业务逻辑 **/
		// example.createCriteria().andXXXEqualTo(xx.())
		/** 查询业务逻辑完 **/
		/** ######################_我是分隔线###################### **/

		List<Gift> list = new ArrayList<Gift>();
		long total = giftService.countByExample(example);
		if (total > 0) {
			/** 排序业务逻辑 **/
			// example.setOrderByClause(XX)
			/** 排序业务逻辑完 **/
			/** ######################_我是分隔线###################### **/
			// 分页插件查询
			PageHelper.startPage(0, 10);
			list = giftService.selectByExample(example);
			PageInfo<Gift> page = new PageInfo<Gift>(list);
			
			list = page.getList();
		}
		List<GiftRes> test=new ArrayList<GiftRes>();
		/*return new Pages<GiftRes>(test, total,
				0, 10);*/
		return new GiftRes();
	}


	@Override
	public void browser(BaseModel<GiftReq, GiftRes> pages) {
		GiftQueryHelper example = new GiftQueryHelper();
		/** 查询业务逻辑 **/
		// example.createCriteria().andXXXEqualTo(xx.())
		/** 查询业务逻辑完 **/
		/** ######################_我是分隔线###################### **/

		List<GiftRes> rows = new ArrayList<GiftRes>();
		long total = giftService.countByExample(example);
		if (total > 0) {
			/** 排序业务逻辑 **/
			// example.setOrderByClause(XX)
			/** 排序业务逻辑完 **/
			/** ######################_我是分隔线###################### **/
			// 分页插件查询
			Class<List<GiftRes>> t=null;
			 //List<Map<String, Object>> listMap = JSON.parseObject(jsonString, new TypeReference<List<Map<String,Object>>>(){});  (注意：此处可看出fastjson反射机制比gson更准确， id = 1001 通过fastjson反射仍是 id = 1001 , 而通过gson反射结果 为 id =1001.0 ,
			//("", clazz);
			rows = dozerMapper.map(giftService.selectByExample(example), null);
			
			//rows = dozerMapper.map(giftService.selectByExample(example),new Class<List<GiftRes>>(){});
			
		}
		pages.setTotal(total);
		pages.setRows(rows);
	}
}