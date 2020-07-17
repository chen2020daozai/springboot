package com.zlj.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Classname AService
 * @Date 2020/7/17
 * @Created by 陈刀仔
 * @Description TODO
 */

@Service
public class AsyncService {

    @Async
    public String hello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("数据正在处理");
        return "ok";
    }
}
