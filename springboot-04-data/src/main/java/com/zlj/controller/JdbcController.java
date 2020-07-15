package com.zlj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname JdbcController
 * @Date 2020/7/12
 * @Created by 陈刀仔
 * @Description TODO
 */

@RestController
public class JdbcController {

    @Autowired
    JdbcTemplate jdbcTemplate;


}
