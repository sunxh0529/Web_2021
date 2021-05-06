package com.web.demo.bean.validation;


import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

// 注册信息  含有bean 校验
// 同时有jsonView的使用

@Data
public class RegisterInfo {

    // 不同的接口用于返回不同的数据
    public interface userPublicInfo{};

    public interface userPrivateInfo extends userPublicInfo{};


    @Size(min = 3, max = 12, message = "用户名必须符合长度要求(3位-12位之间)")
    @Pattern(regexp = "[a-zA-Z_][a-zA-Z0-9_]{2,11}", message = "用户名不符合格式要求")
    @JsonView(userPublicInfo.class)
    private String name;

    @Size(min = 3, max = 12, message = "密码必须在3-12位之间")
    @JsonView(userPrivateInfo.class)
    private String password;

    @Range(min = 1, max = 150, message = "年龄只能在1-150岁之间")
    @JsonView(userPublicInfo.class)
    private Integer age;

    @NotNull(message = "邮箱不能为空")
    @JsonView(userPublicInfo.class)
    @Email(regexp = ".+@.+", message = "邮箱不符合格式要求")
    private String email;




}
