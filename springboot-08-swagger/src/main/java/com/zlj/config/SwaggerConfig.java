package com.zlj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @Classname SwaggerConfig
 * @Date 2020/7/16
 * @Created by 陈刀仔
 * @Description TODO
 */

@Configuration //配置类
@EnableSwagger2// 开启Swagger2的自动配置
public class SwaggerConfig {


    //作者信息
    private static final Contact DEFAULT_CONTACT = new Contact("zlj", "", "2242@qq.com");



    @Bean //配置docket以配置Swagger具体参数
    public Docket docket(Environment environment) {
        // 设置要显示swagger的环境，这几个环境下都可以显示
        Profiles of = Profiles.of("dev", "test","pro1");
        // 判断当前是否处于该环境
        // 通过 enable() 接收此参数判断是否要显示
        boolean b = environment.acceptsProfiles(of);

        //用构造器返回docket
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //是否显示
                .enable(b)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.zlj.controller"))
                //这样只扫描URL是zlj开头的接口
//                .paths(PathSelectors.ant("/zlj/**"))
                .build();
    }

    @Bean
    public Docket docket1(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("group1");
    }
    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("group2");
    }
    @Bean
    public Docket docket3(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("group3");
    }

    public ApiInfo apiInfo(){
        return new ApiInfo("周哥个人", "好的", "v1.0", "urn:tos", DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());

    }
}
