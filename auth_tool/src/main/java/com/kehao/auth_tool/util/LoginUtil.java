package com.kehao.auth_tool.util;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;


public class LoginUtil {
    public static boolean login(String username, String password){
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(new UsernamePasswordToken(username, password));
            return true;
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return false;
        }
    }
}
