package com.example.javamailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmailService {
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String to,String body,String topic)
    {
        SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
        simpleMailMessage.setFrom("123dheerajkumarsharma@gmail.com");
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(body);
        simpleMailMessage.setText("hai");
        javaMailSender.send(simpleMailMessage);
        System.out.println("mail sent"+simpleMailMessage);

    }
}
