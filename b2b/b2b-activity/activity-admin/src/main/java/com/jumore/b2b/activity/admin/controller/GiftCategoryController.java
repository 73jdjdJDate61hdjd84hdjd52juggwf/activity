/**
 * 奖励类别 
 * GiftCategoryController.java
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
import com.jumore.b2b.activity.service.business.api.IGiftCategoryApi;
import com.jumore.b2b.activity.service.business.io.request.GiftCategoryReq;

@Controller
@RequestMapping(value="/giftCategory")
public class GiftCategoryController extends BaseController {
    static final Logger log = LogManager.getLogger(GiftCategoryController.class);;

    @Reference
    IGiftCategoryApi giftCategoryApi;

    @RequestMapping(value = "/browser")
    public String browser(Model model) {
        return "/giftCategory/browser";
    }

    @RequestMapping(value = "/doBrowser")
    public String doBrowser(Model model, GiftCategoryReq giftCategory, @RequestParam(value = "page", required = false) int page, int rows) {
        page = page <= 1 ? 0 : page - 1;
        rows = rows <= 0 ? 10 : rows;
        page *= rows;
        rows += page;
        Pages<?> pages = giftCategoryApi.browser(giftCategory, page, rows);
        model.addAttribute("total", pages.getTotal());
        model.addAttribute("rows", pages.getRows());
        return "/giftCategory/browser";
    }

    @RequestMapping(value = "/append")
    public String append(Model model) {
        return "/giftCategory/usrrole/append";
    }

    @RequestMapping(value = "/doAppend")
    public String doAppend(Model model, GiftCategoryReq giftCategory) {
        model.addAttribute("code", giftCategoryApi.insert(giftCategory));
        return "/browser";
    }

    @RequestMapping(value = "/delete")
    public String remove(Model model, @RequestBody List<GiftCategoryReq> list) {
        model.addAttribute("list", giftCategoryApi.delete(list));
        return "/list/browser";
    }

    @RequestMapping(value = "/modify")
    public String modify(Model model, GiftCategoryReq giftCategory) {
        model.addAttribute("giftCategory", giftCategoryApi.selectUnique(giftCategory));
        return "/giftCategory/modify";
    }

    @RequestMapping(value = "/doModify", method = RequestMethod.POST)
    public String doModify(Model model, GiftCategoryReq giftCategory) {
        model.addAttribute("giftCategory", giftCategoryApi.update(giftCategory));
        return "/giftCategory/browser";
    }
}