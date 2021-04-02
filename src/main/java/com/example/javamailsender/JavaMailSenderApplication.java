package com.example.javamailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class JavaMailSenderApplication {

    @Autowired
    SendEmailService sendEmailService;
    public static void main(String[] args) {

        SpringApplication.run(JavaMailSenderApplication.class, args);
    }

    /*@EventListener(ApplicationReadyEvent.class)
    public void triggerWhenStarts()
    {
        sendEmailService.sendEmail("123dheerajkumarsharma@gmail.com","hi there","topic");
    }*/
}
