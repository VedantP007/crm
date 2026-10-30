package com.example.crm;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @PostMapping("/customers")
    public String addCustomer(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String phone,
            @RequestParam String company,
            @RequestParam String address) {

        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Company: " + company);
        System.out.println("Address: " + address);

        return "Customer added successfully!";
    }
}