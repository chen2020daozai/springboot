package com.zlj.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname MyController
 * @Date 2020/7/14
 * @Created by 陈刀仔
 * @Description TODO
 */

@Controller
public class MyController {

    @RequestMapping({"/","/index"})
    public String Index(Model model){
        model.addAttribute("msg","hello");
        return "index";
    }

    @RequestMapping("/user/add")
    public String add(Model model){
        model.addAttribute("msg","hello");
        return "user/add";
    }

    @RequestMapping("/user/update")
    public String update(Model model){
        model.addAttribute("msg","hello");
        return "user/update";
    }

    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("msg","hello");
        return "login";
    }

    @RequestMapping("/ifsuccess")
    public String loginSuccess(String username,String password,Model model){
        //获取当前用户
        Subject subject = SecurityUtils.getSubject();
        //封装用户的登录数据
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);

        try {
            subject.login(token);
            return "index";
        } catch (UnknownAccountException e) {
            model.addAttribute("msg","用户不存在");
            return "login";
        } catch (IncorrectCredentialsException e){
            model.addAttribute("msg","密码不正确");
            return "login";
        }
    }
}
