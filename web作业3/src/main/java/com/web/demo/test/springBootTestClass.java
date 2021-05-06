package com.web.demo.test;

import com.web.demo.bean.service.UserService;
import com.web.demo.bean.validation.RegisterInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class springBootTestClass {

    @Autowired
    private UserService service;

    @Test
    public void testAddUser() {
        RegisterInfo info = new RegisterInfo();
        info.setName("123");
        info.setAge(20);
        info.setEmail("testemail@qq.com");
        info.setPassword("123456");
        service.addUser(info);
    }
}
