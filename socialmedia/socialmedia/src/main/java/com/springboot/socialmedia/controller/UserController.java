package com.springboot.socialmedia.controller;

import com.springboot.socialmedia.Entity.User;
import com.springboot.socialmedia.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    private String saveUser(@RequestBody User user){
        userService.save(user);
        return "saved successfully";
    }
    @GetMapping("/get/{id}")
    private Optional<User>getById(@PathVariable("id") Integer id){
        return userService.getById(id);
    }
    @GetMapping("/getAll")
    private List<User> getAll(){
        return userService.getAll();
    }
    @PutMapping("/update/{id}")
    private String update(@PathVariable("id") Integer id,@RequestBody User user){
        userService.save(user);
        return "Update success";
    }
    @DeleteMapping("/delete/{id}")
    private String deleteById(@PathVariable("id") Integer id){
        userService.deleteById(id);
        return "deleted successfully";
    }


}
