package com.portfolio.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.portfolio.portfolio.dto.ContactRequest;
import com.portfolio.portfolio.service.ContactService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://gunderao.netlify.app")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping("/contact")
    public String sendMessage(@RequestBody ContactRequest request) {

        contactService.sendEmail(request);

        return "Email Sent Successfully";
    }
}