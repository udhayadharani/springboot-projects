package com.springboot.socialmedia.controller;

import com.springboot.socialmedia.Entity.Login;
import com.springboot.socialmedia.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginservice;

    @PostMapping("/saveUsers")
    public void saveTest(@RequestBody Login login) {
        loginservice.save(login);
    }
}