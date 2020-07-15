package com.zlj.springboot03web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

/**
 * @Classname MyConfig
 * @Date 2020/7/10
 * @Created by 陈刀仔
 * @Description TODO
 */

//扩展视图解析器
@Configuration
public class MyConfig implements WebMvcConfigurer {


    @Bean
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }


    public static class MyViewResolver implements ViewResolver{

        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
}
