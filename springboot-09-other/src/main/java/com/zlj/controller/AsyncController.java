package com.zlj.controller;

import com.zlj.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname AsyncController
 * @Date 2020/7/17
 * @Created by 陈刀仔
 * @Description TODO
 */

@RestController
public class AsyncController {
    @Autowired
    AsyncService service;

    @RequestMapping("/hello")
    public String ok(){
        service.hello();
        return "hello";
    }
}
