package com.spring.demo.controller;


import com.spring.demo.entity.Employee;
import com.spring.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    private void save(@RequestBody List<Employee> employee){
        Employee employee1 = employeeService.save(employee);
    }


    }


