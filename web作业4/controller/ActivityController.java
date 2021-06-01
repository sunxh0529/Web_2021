package com.guapi.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Api(tags = {"动态控制器"})
public class ActivityController {

    @ApiOperation(value = "获取好友动态", notes = "获取好友动态")
    @GetMapping("/activities/{user}")
    void getActivities(@PathVariable("user") String user) {

    }

    @ApiOperation(value = "发布动态", notes = "发布动态")
    @PostMapping("/activity/{id}")
    void launchActivity(@PathVariable("id") String id) {

    }


}
