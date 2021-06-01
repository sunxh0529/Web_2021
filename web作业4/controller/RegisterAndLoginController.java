package com.guapi.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Api(tags = {"登录和注册控制器"})
public class RegisterAndLoginController {

    @PostMapping("/register/{user}")
    @ApiOperation(value = "注册用户", notes = "注册用户")
    void register(@PathVariable("user")String user, @RequestParam("psw")String password) {

    }

    @PostMapping("/login/{user}")
    @ApiOperation(value = "登录用户", notes = "登录用户")
    void login(@PathVariable("user")String user, @RequestParam("psw")String password) {

    }
}
