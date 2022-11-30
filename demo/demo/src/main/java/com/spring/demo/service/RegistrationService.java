package com.spring.demo.service;

import com.spring.demo.entity.Registration;
import com.spring.demo.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    public String save(Registration registration){
        registrationRepository.saveAndFlush(registration);
        return "registration success";
    }
    public Optional<Registration> getById(Integer id){
        return registrationRepository.findById(id);
    }
    public List<Registration> getAll() {
        return registrationRepository.findAll();

    }
    public String update(Registration registration){
        registrationRepository.save(registration);
        return "updated";
    }
    public String deleteById(Integer id){
        registrationRepository.deleteById(id);
        return "registration deleted";
    }
}
