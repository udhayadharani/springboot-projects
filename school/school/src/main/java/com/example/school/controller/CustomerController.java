package com.example.school.controller;

import com.example.school.entity.Customer;
import com.example.school.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/saveCustomer")
    private String saveCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
        return "save customer";
    }






}
