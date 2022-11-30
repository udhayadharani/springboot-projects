package com.spring.demo.controller;

import com.spring.demo.entity.Registration;
import com.spring.demo.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/saveRegistration")
    private String saveRegistration(@RequestBody Registration registration){
        registrationService.save(registration);
        return "registration successfully";
    }
    @GetMapping("/get{id}")
    private Optional<Registration> getById(@PathVariable("Id") Integer id){
        return registrationService.getById(id);
    }
    @GetMapping("/getAll/")
    private List<Registration> getAll(){
        return registrationService.getAll();
    }
    @PutMapping("/updateRegister")
    private String update(@RequestBody Registration registration){
        return registrationService.save(registration);
    }
    @DeleteMapping("/delete/{id}")
    private String deleteById(@PathVariable("id") Integer id){
        registrationService.deleteById(id);
        return "delete";
    }
    }

