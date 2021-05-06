package com.web.demo.bean.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Api(tags = {"好友列表控制器"})
public class FriendListController {

    @GetMapping("/friendList/{user}")
    @ApiOperation(value = "获取好友列表所有信息", notes = "获取好友列表所有信息")
    void getFriendList(@PathVariable("user")String user) {

    }

    @GetMapping("/friendList/{user}/{target}")
    @ApiOperation(value = "获取某位好友信息", notes = "获取某位好友信息")
    void getFriendInfo(@PathVariable("user")String user, @PathVariable("target") String target) {

    }

    @DeleteMapping("/friendList/{user}/{target}")
    @ApiOperation(value = "删除某位好友信息", notes = "删除某位好友信息")
    void deleteFriendInfo(@PathVariable("user")String user, @PathVariable("target") String target) {

    }

}
