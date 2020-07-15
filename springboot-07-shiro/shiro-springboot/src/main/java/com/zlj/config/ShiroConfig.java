package com.zlj.config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.session.DefaultWebSessionManager;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Classname ShiroConfig
 * @Date 2020/7/14
 * @Created by 陈刀仔
 * @Description TODO
 */

@Configuration
public class ShiroConfig {
    //3、ShiroFilterFactoryBean
    @Bean
    public ShiroFilterFactoryBean bean(@Qualifier("defaultWebSecurityManager")DefaultWebSecurityManager manager){
        ShiroFilterFactoryBean bean=new ShiroFilterFactoryBean();
        bean.setSecurityManager(manager);

        Map<String,String> filterMap=new LinkedHashMap<>();
        //需要特定权限才能访问
        filterMap.put("/user/update","perms[user:update]");
        filterMap.put("/user/add","perms[user:add]");

        //必须认证才能访问
        filterMap.put("/user/*","authc");

        bean.setFilterChainDefinitionMap(filterMap);

        //否则跳转到未授权页面
        bean.setUnauthorizedUrl("/unauthorize");

        bean.setLoginUrl("/login");

        return bean;
    }
    //2、DefaultWebSecurityManager
    @Bean
    public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("userRealm")UserRealm userRealm){
        DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
        manager.setRealm(userRealm);
        return manager;
    }


    //1、创建Realm对象，需要自定义对象
    @Bean
    public UserRealm userRealm(){
        return new UserRealm();
    }
}
