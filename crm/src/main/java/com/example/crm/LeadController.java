package com.example.crm;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeadController {

    @PostMapping("/leads")
    public String addLead(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String phone,
            @RequestParam String company,
            @RequestParam String status) {

        System.out.println("Lead Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Company: " + company);
        System.out.println("Status: " + status);

        return "Lead added successfully!";
    }
}