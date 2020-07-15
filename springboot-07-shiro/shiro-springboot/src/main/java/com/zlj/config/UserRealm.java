package com.zlj.config;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 * @Classname UserRealm
 * @Date 2020/7/14
 * @Created by 陈刀仔
 * @Description TODO
 */

public class UserRealm extends AuthorizingRealm {

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("授权");
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        System.out.println("认证");

        String name="zlj";
        String pwd="123456";

        UsernamePasswordToken token1 = (UsernamePasswordToken) token;

        if (!token1.getUsername().equals(name)){
            return null;
        }


        return new SimpleAuthenticationInfo("",pwd,"");
    }
}
