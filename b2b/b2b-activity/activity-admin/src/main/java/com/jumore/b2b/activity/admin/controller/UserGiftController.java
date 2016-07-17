/**
 * 用户礼物表
 * UserGiftController.java
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
import com.jumore.b2b.activity.service.business.api.IUserGiftApi;
import com.jumore.b2b.activity.service.business.io.request.UserGiftReq;

@Controller
@RequestMapping(value="/userGift")
public class UserGiftController extends BaseController {
    static final Logger log = LogManager.getLogger(UserGiftController.class);;

    @Reference
    IUserGiftApi userGiftApi;

    @RequestMapping(value = "/browser")
    public String browser(Model model) {
        return "/userGift/browser";
    }

    @RequestMapping(value = "/doBrowser")
    public String doBrowser(Model model, UserGiftReq userGift, @RequestParam(value = "page", required = false) int page, int rows) {
        page = page <= 1 ? 0 : page - 1;
        rows = rows <= 0 ? 10 : rows;
        page *= rows;
        rows += page;
        Pages<?> pages = userGiftApi.browser(userGift, page, rows);
        model.addAttribute("total", pages.getTotal());
        model.addAttribute("rows", pages.getRows());
        return "/userGift/browser";
    }

    @RequestMapping(value = "/append")
    public String append(Model model) {
        return "/userGift/usrrole/append";
    }

    @RequestMapping(value = "/doAppend")
    public String doAppend(Model model, UserGiftReq userGift) {
        model.addAttribute("code", userGiftApi.insert(userGift));
        return "/browser";
    }

    @RequestMapping(value = "/delete")
    public String remove(Model model, @RequestBody List<UserGiftReq> list) {
        model.addAttribute("list", userGiftApi.delete(list));
        return "/list/browser";
    }

    @RequestMapping(value = "/modify")
    public String modify(Model model, UserGiftReq userGift) {
        model.addAttribute("userGift", userGiftApi.selectUnique(userGift));
        return "/userGift/modify";
    }

    @RequestMapping(value = "/doModify", method = RequestMethod.POST)
    public String doModify(Model model, UserGiftReq userGift) {
        model.addAttribute("userGift", userGiftApi.update(userGift));
        return "/userGift/browser";
    }
}