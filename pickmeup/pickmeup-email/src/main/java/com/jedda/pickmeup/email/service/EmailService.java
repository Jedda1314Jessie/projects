package com.jedda.pickmeup.email.service;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {

    public void sendEmail(String emailAddress,String content);
}
