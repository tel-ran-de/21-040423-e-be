package de.telran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.stereotype.Service;

@Service
public class UserMailService {

    @Autowired
    JavaMailSender mailSender;

    @Value("spring.mail.username")
    String from;

    public void send(String body, String to) {
//        SimpleMailMessage msg = new SimpleMailMessage();
//        msg.setText(body);
//        msg.setTo(to);
//        msg.setFrom(from);
//        mailSender.send(msg);
        System.out.println(body);
    }
}
