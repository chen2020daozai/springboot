package com.zlj.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Classname SmailMail
 * @Date 2020/7/17
 * @Created by 陈刀仔
 * @Description TODO
 */

@Service
public class SmailMail {
    @Autowired
    private static JavaMailSenderImpl mail;

    static void mail(String setTo[],String password) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("2242877026@qq.com");
        message.setTo(setTo);
        message.setSubject("你好！");
        message.setText("看到我发送的邮件了吗");
        message.setSentDate(new Date());

        mail.send(message);
    }
}
