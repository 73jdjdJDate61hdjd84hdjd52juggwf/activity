/**
 * 活动表
 * ActivityController.java
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
import com.jumore.b2b.activity.service.business.api.IActivityApi;
import com.jumore.b2b.activity.service.business.io.request.ActivityReq;

@Controller
@RequestMapping(value="/activity")
public class ActivityController extends BaseController {
    static final Logger log = LogManager.getLogger(ActivityController.class);;

    @Reference
    IActivityApi activityApi;

    @RequestMapping(value = "/browser")
    public String browser(Model model) {
        return "/activity/browser";
    }

    @RequestMapping(value = "/doBrowser")
    public String doBrowser(Model model, ActivityReq activity, @RequestParam(value = "page", required = false) int page, int rows) {
        page = page <= 1 ? 0 : page - 1;
        rows = rows <= 0 ? 10 : rows;
        page *= rows;
        rows += page;
        Pages<?> pages = activityApi.browser(activity, page, rows);
        model.addAttribute("total", pages.getTotal());
        model.addAttribute("rows", pages.getRows());
        return "/activity/browser";
    }

    @RequestMapping(value = "/append")
    public String append(Model model) {
        return "/activity/usrrole/append";
    }

    @RequestMapping(value = "/doAppend")
    public String doAppend(Model model, ActivityReq activity) {
        model.addAttribute("code", activityApi.insert(activity));
        return "/browser";
    }

    @RequestMapping(value = "/delete")
    public String remove(Model model, @RequestBody List<ActivityReq> list) {
        model.addAttribute("list", activityApi.delete(list));
        return "/list/browser";
    }

    @RequestMapping(value = "/modify")
    public String modify(Model model, ActivityReq activity) {
        model.addAttribute("activity", activityApi.selectUnique(activity));
        return "/activity/modify";
    }

    @RequestMapping(value = "/doModify", method = RequestMethod.POST)
    public String doModify(Model model, ActivityReq activity) {
        model.addAttribute("activity", activityApi.update(activity));
        return "/activity/browser";
    }
}