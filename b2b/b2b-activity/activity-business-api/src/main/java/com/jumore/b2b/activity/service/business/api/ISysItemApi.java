package com.jumore.b2b.activity.service.business.api;

import com.jumore.b2b.activity.service.business.io.response.UserGiftLog;

public interface ISysItemApi {
	
	UserGiftLog selectUnqiue();
	
	void excute(UserGiftLog log);

}
