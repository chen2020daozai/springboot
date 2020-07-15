package com.zlj;

import com.zlj.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot05MybatisApplicationTests {

    @Autowired
    UserMapper mapper;

    @Test
    void contextLoads() {
        System.out.println(mapper.select());
    }

}
