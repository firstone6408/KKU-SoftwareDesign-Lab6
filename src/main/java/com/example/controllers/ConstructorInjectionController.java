// * นายเอกวิชญ์ พิลาวรรณ 663380619-8 Section 4
// * Part 2: Constructor Injection

package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Customer;
import com.example.services.CustomerService;

@RestController
@RequestMapping("/constructor")
public class ConstructorInjectionController {
    private final CustomerService customerService;

    /*
     * ถ้ามี constructor อันเดียว ไม่จำเป็นต้องใส่ Annotation Autowired
     * แต่ถ้ามีมากกว่า 1 จำเป็นต้องใส่
     */
    @Autowired
    public ConstructorInjectionController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public String getCustomer(@PathVariable Long id) {
        Customer cust = customerService.getCustomerById(id);
        return "Constructor Injection -> Customer ID: " + cust.getId() + ", Name: " + cust.getName();
    }
}
