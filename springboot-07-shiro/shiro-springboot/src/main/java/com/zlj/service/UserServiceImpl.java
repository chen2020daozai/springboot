package com.zlj.service;

import com.zlj.mapper.UserMapperDao;
import com.zlj.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname UserServiceImpl
 * @Date 2020/7/15
 * @Created by 陈刀仔
 * @Description TODO
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapperDao mapper;

    @Override
    public User selece(String name) {
        return mapper.selectByName(name);
    }
}
