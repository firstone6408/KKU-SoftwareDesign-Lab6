// * นายเอกวิชญ์ พิลาวรรณ 663380619-8 Section 4
// * Part 3: Setter Injection

package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Customer;
import com.example.services.CustomerService;

@RestController
@RequestMapping("/setter")
public class SetterInjectionController {
    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public String getCustomer(@PathVariable Long id) {
        Customer cust = customerService.getCustomerById(id);
        return "Setter Injection -> Customer ID: " + cust.getId() + ", Name: " + cust.getName();
    }
}
