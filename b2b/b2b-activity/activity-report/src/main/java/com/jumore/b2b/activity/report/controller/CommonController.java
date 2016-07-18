package com.jumore.b2b.activity.report.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jumore.b2b.activity.model.GiftAttr;

/**
 * 公共的
 * 
 * @author Administrator
 *
 */
@Controller
public class CommonController {

	@RequestMapping(value = "/main")
	public String send(Model model) {
		return "/interface";
	};
	
	@RequestMapping(value = "/test")
	public String test(Model model) {
		
		model.addAttribute(new GiftAttr());
		return "/interface";
	};
}
