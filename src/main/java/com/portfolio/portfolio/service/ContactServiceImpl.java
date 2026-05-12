package com.portfolio.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private JavaMailSender mailSender;

    @Async
	@Override
	public void sendEmail(com.portfolio.portfolio.dto.ContactRequest request) {
		 SimpleMailMessage message =
	                new SimpleMailMessage();

	        message.setTo("yourgmail.com"
	        		+ "");

	        message.setSubject(
	                "Portfolio Contact: " +
	                request.getSubject()
	        );

	        message.setText(
	                "Name: " + request.getName() + "\n" +
	                "Email: " + request.getEmail() + "\n\n" +
	                "Message:\n" + request.getMessage()
	        );
	       
	        try {
	        mailSender.send(message);
	        }catch(Exception e) {
	    	throw new  RuntimeException("Failed to send email");
	        }
    }
}