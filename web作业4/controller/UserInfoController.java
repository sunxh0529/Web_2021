package com.guapi.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
@Api(tags = {"用户信息查询控制器"})
public class UserInfoController {

    @GetMapping("/userInfo/{user}")
    @ApiOperation(value = "获取某人信息", notes = "获取某人信息")
    void getUserInfo(@PathVariable("user")String user) {

    }

    @PutMapping("/userInfo/{user}")
    @ApiOperation(value = "修改个人信息", notes = "修改个人信息")
    void UpdateUserInfo(@PathVariable("user")String user) {

    }
}
