package com.web.demo.bean.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Api(tags = {"好友系统控制器"})
public class FriendController {

    @ApiOperation(value = "查找好友", notes = "查找好友")
    @GetMapping("/addFriend/{target}")
    void getActivities(@PathVariable("target") String user) {

    }

    @ApiOperation(value = "查找好友", notes = "查找好友")
    @PostMapping("/addFriend/{user}/{target}")
    void getActivities(@PathVariable("user") String user, @PathVariable("target") String target) {

    }
}
