package com.web.demo.test;

import com.web.demo.bean.controller.RegisterAndLoginController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(RegisterAndLoginController.class)
public class RegisterControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testExample() throws Exception {
        //groupManager访问路径
        //param传入参数
        MvcResult result=mvc.perform(MockMvcRequestBuilders.post("/groupManager").
                param("pageNum","1").param("pageSize","10")).andReturn();
    }
}
