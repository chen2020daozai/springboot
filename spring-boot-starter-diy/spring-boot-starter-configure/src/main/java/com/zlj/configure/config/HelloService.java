package com.zlj.configure.config;

import org.springframework.stereotype.Service;

/**
 * @Classname HelloService
 * @Date 2020/7/10
 * @Created by 陈刀仔
 * @Description TODO
 */


public class HelloService {
    HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHello(String name){
        return helloProperties.getPrefix() + name + helloProperties.getSuffix();
    }
}
