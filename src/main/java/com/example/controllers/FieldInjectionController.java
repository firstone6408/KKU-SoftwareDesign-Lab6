// * นายเอกวิชญ์ พิลาวรรณ 663380619-8 Section 4
// * Part 1: Field Injection

package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Customer;
import com.example.services.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/field")
public class FieldInjectionController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    public String getCustomer(@PathVariable Long id) {
        Customer cust = customerService.getCustomerById(id);
        return "Field Injection -> Customer ID: " + cust.getId() + ", Name: " + cust.getName();
    }

}
