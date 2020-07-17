package com.zlj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync  //开启异步
@EnableScheduling  //开启定时
@SpringBootApplication
public class Springboot09OtherApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot09OtherApplication.class, args);
    }

}
