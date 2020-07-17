package com.zlj.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Classname SchedulService
 * @Date 2020/7/17
 * @Created by 陈刀仔
 * @Description TODO
 */

@Service
public class ScheduledService {

    //没两秒执行
    @Scheduled(cron = "0/2 17-25 20,21 * * ?")
    public String hello(){
        System.out.println(new Date());
        return null;
    }
}
