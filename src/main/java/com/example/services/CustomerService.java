// * นายเอกวิชญ์ พิลาวรรณ 663380619-8 Section 4
// * Setup Customer Service

package com.example.services;

import org.springframework.stereotype.Service;

import com.example.models.Customer;

@Service
public class CustomerService {
    public Customer getCustomerById(Long id) {
        return new Customer(id, "Ekkawich Pilawan");
    }
}
