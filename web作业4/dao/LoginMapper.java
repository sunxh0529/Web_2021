package com.guapi.demo.dao;

import com.guapi.demo.JPAobject.UserInfo;
import com.guapi.demo.JPAobject.UserPublicInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    UserPublicInfo login_user(UserInfo info);
}
