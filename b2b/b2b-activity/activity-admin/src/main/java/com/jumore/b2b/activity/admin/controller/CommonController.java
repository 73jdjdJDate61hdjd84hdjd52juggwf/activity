package com.jumore.b2b.activity.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jumore.b2b.activity.service.business.api.IGiftFront;
import com.jumore.b2b.activity.service.business.api.ISysItemApi;
import com.jumore.b2b.activity.service.business.io.request.GiftReq;
import com.jumore.b2b.activity.service.business.io.response.UserGiftLog;

/**
 * 公共的
 * 
 * @author Administrator
 *
 */
@Controller
public class CommonController {

	@Reference
	IGiftFront giftFront;
	@Reference
	ISysItemApi sysItemApi;
	//UserService userService;
	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/main")
	public String send(Model model) {
		try {
			model.addAttribute(11);
			model.addAttribute(sysItemApi.selectUnqiue());
			sysItemApi.excute(new UserGiftLog());
			model.addAttribute(giftFront.select(new GiftReq()));
			
		} catch (Exception e) {
			// TODO: handle exception\
			e.printStackTrace();
		}
		return "/interface";
	};
}
