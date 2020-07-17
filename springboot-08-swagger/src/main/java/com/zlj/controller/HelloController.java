package com.zlj.controller;

import com.zlj.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Classname HelloController
 * @Date 2020/7/16
 * @Created by 陈刀仔
 * @Description TODO
 */

@Controller
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "index";
    }

    @RequestMapping("/getUser")
    public User getUser(){
        return new User();
    }
}
