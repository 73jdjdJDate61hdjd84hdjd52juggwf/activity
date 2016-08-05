package com.jumore.b2b.activity.admin.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jumore.b2b.activity.admin.base.BaseController;
import com.jumore.b2b.session.SessionListener;
import com.jumore.b2b.session.SessionManagerHelper;
import com.jumore.b2b.session.SysAdmin;

@Controller
public class LoginDemo extends BaseController {

	@RequestMapping(value = "/login")
	public String login(Model model, String message) {
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/admin/doLogin")
	public String dologin(Model model, SysAdmin sysAdmin, HttpSession session) {

		if (sysAdmin.getName() == null || sysAdmin.getPwd() == null) {
			model.addAttribute("message", "用户名或密码错误");
			return "login";
		}
		SessionManagerHelper.sessionHandlerByCacheMap(sysAdmin, session);
		model.addAttribute("map", SessionListener.sessionContext.getSessionMap());

		return "home";
	}

	@RequestMapping(value = "/home")
	public String home(Model model, SysAdmin sysAdmin, HttpSession session, int offset, int pageSize) {

		// model.addAttribute("map",SessionListener.sessionContext.getSessionMap());
		HashMap<String, HttpSession> map = SessionManagerHelper.testDate();
		Object[] keys = map.keySet().toArray();
		int total = keys.length;

		if (pageSize < 10) {
			pageSize = 10;
		}
		HashMap<String, HttpSession> page = new LinkedHashMap<String, HttpSession>();
		int index = offset * pageSize;
		for (int i = 0; i <= pageSize; i++) {
			index = index + i;
			if (index >= total) {
				break;
			}
			String key = keys[index].toString();
			HttpSession value = map.get(key);
			page.put(key, value);
		}

		model.addAttribute("map", page);
		return "home";
	}

	@RequestMapping(value = "/main1")
	public String main(Model model, SysAdmin sysAdmin, HttpSession session) {

		model.addAllAttributes(SessionListener.sessionContext.getSessionMap());
		return "main";
	}

	@RequestMapping(value = "/logout")
	public String logout(Model model, SysAdmin sysAdmin, HttpSession session) {
		session.invalidate();
		return "interface";
	}
}
