package com.zlj.testdiy;

import com.zlj.configure.config.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname HelloController
 * @Date 2020/7/10
 * @Created by 陈刀仔
 * @Description TODO
 */

@Controller
public class HelloController {
    @Autowired
    HelloService helloService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){

        return helloService.sayHello("zlj");
    }
}
