package com.springboot.socialmedia.service;

import com.springboot.socialmedia.Entity.Login;
import com.springboot.socialmedia.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;
    public String save(Login login){
        login.setAndEncryptPassword(login.getPassword());
        loginRepository.save(login);
        return "saved";
    }
}
