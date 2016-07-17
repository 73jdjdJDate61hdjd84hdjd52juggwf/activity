/**
 * 活动属性
 * ActivityAttrController.java
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
import com.jumore.b2b.activity.service.business.api.IActivityAttrApi;
import com.jumore.b2b.activity.service.business.io.request.ActivityAttrReq;

@Controller
@RequestMapping(value="/activityAttr")
public class ActivityAttrController extends BaseController {
    static final Logger log = LogManager.getLogger(ActivityAttrController.class);;

    @Reference
    IActivityAttrApi activityAttrApi;

    @RequestMapping(value = "/browser")
    public String browser(Model model) {
        return "/activityAttr/browser";
    }

    @RequestMapping(value = "/doBrowser")
    public String doBrowser(Model model, ActivityAttrReq activityAttr, @RequestParam(value = "page", required = false) int page, int rows) {
        page = page <= 1 ? 0 : page - 1;
        rows = rows <= 0 ? 10 : rows;
        page *= rows;
        rows += page;
        Pages<?> pages = activityAttrApi.browser(activityAttr, page, rows);
        model.addAttribute("total", pages.getTotal());
        model.addAttribute("rows", pages.getRows());
        return "/activityAttr/browser";
    }

    @RequestMapping(value = "/append")
    public String append(Model model) {
        return "/activityAttr/usrrole/append";
    }

    @RequestMapping(value = "/doAppend")
    public String doAppend(Model model, ActivityAttrReq activityAttr) {
        model.addAttribute("code", activityAttrApi.insert(activityAttr));
        return "/browser";
    }

    @RequestMapping(value = "/delete")
    public String remove(Model model, @RequestBody List<ActivityAttrReq> list) {
        model.addAttribute("list", activityAttrApi.delete(list));
        return "/list/browser";
    }

    @RequestMapping(value = "/modify")
    public String modify(Model model, ActivityAttrReq activityAttr) {
        model.addAttribute("activityAttr", activityAttrApi.selectUnique(activityAttr));
        return "/activityAttr/modify";
    }

    @RequestMapping(value = "/doModify", method = RequestMethod.POST)
    public String doModify(Model model, ActivityAttrReq activityAttr) {
        model.addAttribute("activityAttr", activityAttrApi.update(activityAttr));
        return "/activityAttr/browser";
    }
}