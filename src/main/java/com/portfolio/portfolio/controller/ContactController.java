package com.portfolio.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.portfolio.dto.ContactRequest;
import com.portfolio.portfolio.service.ContactService;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins="http://localhost:5173")
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@PostMapping
	public String sendMessage(@RequestBody ContactRequest request) {
		contactService.sendEmail(request);
		return "Email Sent Successfully";
	}
}
