package com.web.demo.bean.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.web.demo.bean.validation.RegisterInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = {"用户信息查询控制器"})
public class UserInfoController {

    // 使用json view 仅 获取某人的公开信息
    @GetMapping("/userInfo/{user}")
    @ApiOperation(value = "获取某人信息", notes = "获取某人信息")
    @JsonView(RegisterInfo.userPublicInfo.class)
    void getUserInfo(@PathVariable("user")String user) {

    }

    // 使用json view 获取某人的全部信息
    @PutMapping("/userInfo/{user}")
    @ApiOperation(value = "修改个人信息", notes = "修改个人信息")
    @JsonView(RegisterInfo.userPrivateInfo.class)
    void UpdateUserInfo(@PathVariable("user")String user) {

    }
}
