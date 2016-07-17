/**
 * 礼物日志表
 * UserGiftLogController.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-17 Created
 */
package com.jumore.b2b.activity.admin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jumore.b2b.activity.admin.base.BaseController;
import com.jumore.b2b.activity.comm.Pages;
import com.jumore.b2b.activity.service.business.api.IUserGiftLogApi;
import com.jumore.b2b.activity.service.business.io.request.UserGiftLogReq;

@Controller
@RequestMapping(value="/userGiftLog")
public class UserGiftLogController extends BaseController {
    static final Logger log = LogManager.getLogger(UserGiftLogController.class);;

    @Reference
    IUserGiftLogApi userGiftLogApi;

    @RequestMapping(value = "/browser")
    public String browser(Model model) {
        return "/userGiftLog/browser";
    }

    @RequestMapping(value = "/doBrowser")
    public String doBrowser(Model model, UserGiftLogReq userGiftLog, @RequestParam(value = "page", required = false) int page, int rows) {
        page = page <= 1 ? 0 : page - 1;
        rows = rows <= 0 ? 10 : rows;
        page *= rows;
        rows += page;
        Pages<?> pages = userGiftLogApi.browser(userGiftLog, page, rows);
        model.addAttribute("total", pages.getTotal());
        model.addAttribute("rows", pages.getRows());
        return "/userGiftLog/browser";
    }

    @RequestMapping(value = "/append")
    public String append(Model model) {
        return "/userGiftLog/usrrole/append";
    }

    @RequestMapping(value = "/doAppend")
    public String doAppend(Model model, UserGiftLogReq userGiftLog) {
        model.addAttribute("code", userGiftLogApi.insert(userGiftLog));
        return "/browser";
    }

    @RequestMapping(value = "/delete")
    public String remove(Model model, @RequestBody List<UserGiftLogReq> list) {
        model.addAttribute("list", userGiftLogApi.delete(list));
        return "/list/browser";
    }

    @RequestMapping(value = "/modify")
    public String modify(Model model, UserGiftLogReq userGiftLog) {
        model.addAttribute("userGiftLog", userGiftLogApi.selectUnique(userGiftLog));
        return "/userGiftLog/modify";
    }

    @RequestMapping(value = "/doModify", method = RequestMethod.POST)
    public String doModify(Model model, UserGiftLogReq userGiftLog) {
        model.addAttribute("userGiftLog", userGiftLogApi.update(userGiftLog));
        return "/userGiftLog/browser";
    }
}