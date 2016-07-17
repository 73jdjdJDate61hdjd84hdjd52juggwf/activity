/**
 * 活动表
 * ActivityServiceImp.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-17 Created
 */
package com.jumore.b2b.activity.service.business.api;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.core.util.SpringBeanUtils;
import com.jumore.b2b.activity.model.Activity;
import com.jumore.b2b.activity.model.ActivityQueryHelper;
import com.jumore.b2b.activity.service.IActivityService;
import com.jumore.b2b.activity.service.business.io.request.ActivityReq;
import com.jumore.b2b.activity.service.business.io.response.ActivityRes;
@com.alibaba.dubbo.config.annotation.Service
public class ActivityApi implements IActivityApi {
	static final Logger log = LogManager.getLogger(ActivityApi.class);;

	@Resource
	IActivityService activityService;

	/**
	 * 综合查询
	 */
	public Pages<?> browser(ActivityReq activity, int length, int offset) {
		ActivityQueryHelper example = new ActivityQueryHelper();
		/** 查询业务逻辑 **/

		// example.createCriteria().andXXXEqualTo(xx.())

		/** 查询业务逻辑完 **/
		/** ######################_我是分隔线###################### **/

		List<Activity> list = new ArrayList<Activity>();
		long total = activityService.countByExample(example);
		if (total > 0) {
			/** 排序业务逻辑 **/
			// example.setOrderByClause(XX)
			/** 排序业务逻辑完 **/
			/** ######################_我是分隔线###################### **/
			// 分页插件查询
			PageHelper.startPage(offset, length);
			list = activityService.selectByExample(example);
			PageInfo<Activity> page = new PageInfo<Activity>(list);
			list = page.getList();
		}
		return new Pages<com.jumore.b2b.activity.model.Activity>(list, total,
				offset, length);
	}

	/**
	 * 添加
	 */
	public long insert(ActivityReq activityreq) {
		/** 新增业务逻辑 **/

		/** 新增业务逻辑完 **/
		/** ######################_我是分隔线###################### **/
		Activity activity = new Activity();
		SpringBeanUtils.copyProperties(activityreq, activity);
		return activityService.insert(activity);
	}

	/**
	 * 添加
	 */
	public long delete(List<ActivityReq> activity) {
		/** 删除务逻辑 **/

		log.info("devlopping");

		/** 删除业务逻辑完 **/
		/** ######################_我是分隔线###################### **/

		return 0;
	}

	/**
	 * 添加
	 */
	public long update(ActivityReq activityReq) {
		ActivityQueryHelper e = new ActivityQueryHelper();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** ######################_我是分隔线###################### **/
		Activity activity = new Activity();
		SpringBeanUtils.copyProperties(activityReq, activity);
		return activityService.updateByExampleSelective(activity, e);
	}

	/**
	 * 添加
	 */
	public ActivityRes selectUnique(ActivityReq activityReq) {
		ActivityQueryHelper e = new ActivityQueryHelper();
		/** 　查询业务逻辑 **/

		/** 查询业务逻辑完 **/
		/** ######################_我是分隔线###################### **/
		List<Activity> list = activityService.selectByExample(e);
		if (list.size() == 1) {
			ActivityRes activityRes = new ActivityRes();
			SpringBeanUtils.copyProperties(list.get(0),activityRes);
			return activityRes;
		}
		return null;
	}
}