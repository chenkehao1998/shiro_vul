package com.example.mytest01.controller;

import com.kehao.auth_tool.util.LoginUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
    @GetMapping("/doLogin")
    public String doLogin(String username, String password) {
        return LoginUtil.login(username,password)?"success":"fail";
    }
    @GetMapping("/admin/{resource}")
    public String admin(@PathVariable String resource) {
        return "admin:"+resource;
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/{resource}")
    public String hello2(@PathVariable String resource) {
        return "hello:"+resource;
    }



    @GetMapping("/login")
    public String  login() {
        return "please login!";
    }
}
