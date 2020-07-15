package com.zlj.configure.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Classname HelloProperties
 * @Date 2020/7/10
 * @Created by 陈刀仔
 * @Description TODO
 */

@ConfigurationProperties(prefix = "com.zlj")
public class HelloProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
