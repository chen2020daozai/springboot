package com.zlj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessagePreparator;

import javax.mail.internet.MimeMessage;
import java.util.Date;

@SpringBootTest
class Springboot09OtherApplicationTests {

    @Autowired
    JavaMailSenderImpl mail;

    @Test
    void contextLoads() {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("2242877026@qq.com");
        message.setTo("2242877026@qq.com");
        message.setTo("2242877026@qq.com","zlj2242877026@126.com");
        message.setSubject("你好！");
        message.setText("看到我发送的邮件了吗");
        message.setSentDate(new Date());

        mail.send(message);
    }

}
