package com.cw.stu.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WuLiangzhi  2018/09/18 0:03
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(String userName, String password) {
        System.out.println(String.format("用户名: %s, 密码: %s", userName, password));
        return "list";
    }

}
