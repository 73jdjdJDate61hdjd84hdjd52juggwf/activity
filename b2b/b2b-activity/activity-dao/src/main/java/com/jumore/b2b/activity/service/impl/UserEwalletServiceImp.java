/**
 * 用户现金钱包
 * UserEwalletServiceImp.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-01 Created
 */
package com.jumore.b2b.activity.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jumore.b2b.activity.base.service.single.BaseServiceImp;
import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.mapper.UserEwalletMapper;
import com.jumore.b2b.activity.model.UserEwallet;
import com.jumore.b2b.activity.model.UserEwalletQueryHelper;
import com.jumore.b2b.activity.service.IUserEwalletService;

@org.springframework.stereotype.Service
public class UserEwalletServiceImp extends
		BaseServiceImp<UserEwallet, UserEwalletQueryHelper> implements
		IUserEwalletService {
	static final Logger log = LogManager.getLogger(UserEwalletServiceImp.class);;

	UserEwalletMapper userEwalletMapper;

	@Resource
	public void setUserEwalletMapper(UserEwalletMapper userEwalletMapper) {
		this.userEwalletMapper = userEwalletMapper;
		this.setBaseMapper(userEwalletMapper);
	}

	/**
	 * 综合查询
	 */
	public Pages<UserEwallet> browser(UserEwallet userEwallet, int length,
			int offset) {
		UserEwalletQueryHelper example = new UserEwalletQueryHelper();
		/** 查询业务逻辑 **/

		// example.createCriteria().andXXXEqualTo(xx.())

		/** 查询业务逻辑完 **/
		/** ######################_我是分隔线###################### **/

		List<UserEwallet> list = new ArrayList<UserEwallet>();
		long total = userEwalletMapper.countByExample(example);
		if (total > 0) {
			/** 排序业务逻辑 **/
			// example.setOrderByClause(XX)
			/** 排序业务逻辑完 **/
			/** ######################_我是分隔线###################### **/
			// 分页插件查询
			PageHelper.startPage(offset, length);
			list = userEwalletMapper.selectByExample(example);
			PageInfo<UserEwallet> page = new PageInfo<UserEwallet>(list);
			list = page.getList();
		}
		return new Pages<com.jumore.b2b.activity.model.UserEwallet>(list,
				total, offset, length);
	}

	/**
	 * 添加
	 */
	public long append(UserEwallet userEwallet) {
		/** 新增业务逻辑 **/

		/** 新增业务逻辑完 **/
		/** ######################_我是分隔线###################### **/

		return userEwalletMapper.insert(userEwallet);
	}

	/**
	 * 添加
	 */
	public long delete(List<UserEwallet> userEwallet) {
		/** 删除务逻辑 **/

		log.info("devlopping");

		/** 删除业务逻辑完 **/
		/** ######################_我是分隔线###################### **/

		return 0;
	}

	/**
	 * 添加
	 */
	public long update(UserEwallet userEwallet) {
		UserEwalletQueryHelper e = new UserEwalletQueryHelper();
		/** 更新业务逻辑 **/

		/** 更新业务逻辑完 **/
		/** ######################_我是分隔线###################### **/

		return userEwalletMapper.updateByExampleSelective(userEwallet, e);
	}

	/**
	 * 添加
	 */
	public UserEwallet selectUnique(UserEwallet userEwallet) {
		UserEwalletQueryHelper e = new UserEwalletQueryHelper();
		/** 　查询业务逻辑 **/

		/** 查询业务逻辑完 **/
		/** ######################_我是分隔线###################### **/
		List<UserEwallet> list = userEwalletMapper.selectByExample(e);
		if (list.size() != 1)
			throw new RuntimeException("对象不存在!");
		return list.get(0);
	}
}