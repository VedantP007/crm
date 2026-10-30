package com.example.crm;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FollowUpController {

    @PostMapping("/followups")
    public String addFollowUp(
            @RequestParam String customerName,
            @RequestParam String date,
            @RequestParam String purpose,
            @RequestParam String status,
            @RequestParam String notes) {

        System.out.println("Customer Name: " + customerName);
        System.out.println("Date: " + date);
        System.out.println("Purpose: " + purpose);
        System.out.println("Status: " + status);
        System.out.println("Notes: " + notes);

        return "Follow-up added successfully!";
    }
}