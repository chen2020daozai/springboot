package com.zlj.config;

import com.zlj.mapper.UserMapperDao;
import com.zlj.pojo.User;
import com.zlj.service.UserServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Classname UserRealm
 * @Date 2020/7/14
 * @Created by 陈刀仔
 * @Description TODO
 */

public class UserRealm extends AuthorizingRealm {

    @Autowired
    UserServiceImpl service;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("授权");

        //添加授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        info.addStringPermission("user:update");

        //拿到当前登录的对象
        Subject subject = SecurityUtils.getSubject();
        System.out.println(subject.getPrincipal());
        User principal = (User) subject.getPrincipal();

        //设置当前用户的权限
        info.addStringPermission(principal.getPerms());

        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("认证");

        UsernamePasswordToken token1 = (UsernamePasswordToken) token;

        User user = service.selece(token1.getUsername());
        if (user==null){
            return null;
        }
        String pwd = user.getPwd();

        return new SimpleAuthenticationInfo(user,pwd,"");
    }
}
