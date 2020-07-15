package com.zlj;

import com.zlj.mapper.UserMapperDao;
import com.zlj.pojo.User;
import com.zlj.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest()
class ShiroSpringbootApplicationTests {

    @Autowired
    UserServiceImpl mapper;

    @Test
    void contextLoads() {
        User zlj = mapper.selece("zlj");
        User fff = mapper.selece("fff");
        System.out.println(zlj);
    }

}
