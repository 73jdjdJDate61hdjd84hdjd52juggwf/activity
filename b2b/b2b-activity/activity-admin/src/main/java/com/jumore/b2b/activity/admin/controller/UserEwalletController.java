/**
 * 用户现金钱包
 * UserEwalletController.java
 * Copyright(C) 2015-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2016-07-17 Created
 */
package com.jumore.b2b.activity.admin.controller;

import java.util.List;

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
import com.jumore.b2b.activity.service.business.api.IUserEwalletApi;
import com.jumore.b2b.activity.service.business.io.request.UserEwalletReq;

@Controller
@RequestMapping(value="/userEwallet")
public class UserEwalletController extends BaseController {
    static final Logger log = LogManager.getLogger(UserEwalletController.class);;

    @Reference
    IUserEwalletApi userEwalletApi;

    @RequestMapping(value = "/browser")
    public String browser(Model model) {
        return "/userEwallet/browser";
    }

    @RequestMapping(value = "/doBrowser")
    public String doBrowser(Model model, UserEwalletReq userEwallet, @RequestParam(value = "page", required = false) int page, int rows) {
        page = page <= 1 ? 0 : page - 1;
        rows = rows <= 0 ? 10 : rows;
        page *= rows;
        rows += page;
        Pages<?> pages = userEwalletApi.browser(userEwallet, page, rows);
        model.addAttribute("total", pages.getTotal());
        model.addAttribute("rows", pages.getRows());
        return "/userEwallet/browser";
    }

    @RequestMapping(value = "/append")
    public String append(Model model) {
        return "/userEwallet/usrrole/append";
    }

    @RequestMapping(value = "/doAppend")
    public String doAppend(Model model, UserEwalletReq userEwallet) {
        model.addAttribute("code", userEwalletApi.insert(userEwallet));
        return "/browser";
    }

    @RequestMapping(value = "/delete")
    public String remove(Model model, @RequestBody List<UserEwalletReq> list) {
        model.addAttribute("list", userEwalletApi.delete(list));
        return "/list/browser";
    }

    @RequestMapping(value = "/modify")
    public String modify(Model model, UserEwalletReq userEwallet) {
        model.addAttribute("userEwallet", userEwalletApi.selectUnique(userEwallet));
        return "/userEwallet/modify";
    }

    @RequestMapping(value = "/doModify", method = RequestMethod.POST)
    public String doModify(Model model, UserEwalletReq userEwallet) {
        model.addAttribute("userEwallet", userEwalletApi.update(userEwallet));
        return "/userEwallet/browser";
    }
}