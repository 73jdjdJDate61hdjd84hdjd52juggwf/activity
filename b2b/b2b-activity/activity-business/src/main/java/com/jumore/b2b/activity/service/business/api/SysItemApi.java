package com.jumore.b2b.activity.service.business.api;

import com.jumore.b2b.activity.service.business.io.response.UserGiftLog;

@com.alibaba.dubbo.config.annotation.Service
public class SysItemApi implements ISysItemApi {

	@Override
	public UserGiftLog selectUnqiue() {
		UserGiftLog log = new UserGiftLog();
		log.setAmount(200L);
		log.setUserName("王五");
		return log;
	}

	@Override
	public void excute(UserGiftLog log) {
		System.out.println(log);

	}

}
