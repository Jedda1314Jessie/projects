package com.jedda.pickmeup.email.service.impl;

import com.jedda.pickmeup.email.service.EmailService;

public class EmailServiceImpl implements EmailService {

    @Override
    public void sendEmail(String emailAddress,String content){
        System.out.printf("sendEmail");
    }
}
