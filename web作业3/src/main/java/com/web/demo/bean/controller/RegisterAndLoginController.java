package com.web.demo.bean.controller;

import com.web.demo.bean.validation.RegisterInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Api(tags = {"登录和注册控制器"})
public class RegisterAndLoginController {

    // java bean validation 校验
    @PostMapping("/register/{user}")
    @ApiOperation(value = "注册用户", notes = "注册用户第三次作业")
    ResponseEntity register(@PathVariable("user")String user, @Valid@RequestBody RegisterInfo info, BindingResult result) {
        if (result.hasErrors()) {
            return ResponseEntity.badRequest().body(result.getAllErrors());

        }
        else {
            return ResponseEntity.ok().body("OKOK");
        }
    }

    @PostMapping("/login/{user}")
    @ApiOperation(value = "登录用户", notes = "登录用户")
    String login(@PathVariable("user")String user, @RequestBody String password) {

        return "login ok";
    }
}
