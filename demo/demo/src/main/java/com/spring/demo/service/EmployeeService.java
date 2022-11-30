package com.spring.demo.service;


import com.spring.demo.entity.Employee;
import com.spring.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee save(List<Employee> employeeList) {
        List<Employee> list = new ArrayList<Employee>();
        Employee employee = null;
        for (Employee emp : employeeList) {
            employee = new Employee();
            employeeRepository.saveAndFlush(emp);

        }
        return employee;
    }

}

