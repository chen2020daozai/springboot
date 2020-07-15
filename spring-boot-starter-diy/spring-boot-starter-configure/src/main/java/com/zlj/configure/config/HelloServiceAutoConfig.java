package com.zlj.configure.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname HelloServiceAutoConfig
 * @Date 2020/7/10
 * @Created by 陈刀仔
 * @Description TODO
 */

@Configuration
@ConditionalOnWebApplication //web应用生效
@EnableConfigurationProperties(HelloProperties.class)
public class HelloServiceAutoConfig {
    @Autowired
    private HelloProperties properties;

    @Bean
    public HelloService service(){
        HelloService helloService = new HelloService();
        helloService.setHelloProperties(properties);
        return helloService;
    }
}
