package com.example.javamailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController
{
    @Autowired
    SendEmailService sendEmailService;
    @ResponseBody
    @RequestMapping("/")
    public String triggerWhenStarts()
    {
        sendEmailService.sendEmail("123dheerajkumarsharma@gmail.com","hi there","topic");
        return "mail sent ";
    }
}
