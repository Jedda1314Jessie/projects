package com.jedda.pickmeup.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jedda
 * @date 2018/05/19
 * */
@RestController
public class LoginController {

    @Value("${server.port}")
    String port;

    /**
     * 用户登录
     * */
    @RequestMapping("/login")
    public String login(@RequestParam String userId) {
        return "hi "+ userId +",i am from port:" +port;
    }

    /**
     * 用户注册
     * */
    @RequestMapping("/register")
    public String register(@RequestParam String userId) {
        return "register" + userId;
    }
}
