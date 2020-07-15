package com.zlj.mapper;

import com.zlj.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Interfacename UserMapper
 * @Date 2020/7/15
 * @Created by 陈刀仔
 * @Description TODO
 */

@Repository
@Mapper
public interface UserMapperDao {
    User selectByName(String name);
}
