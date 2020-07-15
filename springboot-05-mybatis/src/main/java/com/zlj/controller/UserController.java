package com.zlj.controller;

import com.zlj.mapper.UserMapper;
import com.zlj.pojo.User;
import com.zlj.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Classname UserController
 * @Date 2020/7/13
 * @Created by 陈刀仔
 * @Description TODO
 */

@Controller
public class UserController {
    @Autowired
    private UserMapper mapper;

    @RequestMapping("/mybatis")
    @ResponseBody
    public List<User> query(){

        List<User> users = mapper.select();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
//        List<User> users = mapper.selectByExample(example);
//        for (User user : users) {
//            System.out.println(user);
//        }
//        return users;
    }
}
