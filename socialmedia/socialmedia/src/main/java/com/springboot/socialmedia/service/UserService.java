package com.springboot.socialmedia.service;



import com.springboot.socialmedia.Entity.User;
import com.springboot.socialmedia.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String save(User user){
        userRepository.saveAndFlush(user);
        return "saved";
    }
    public Optional<User>getById(Integer id) {
       return userRepository.findById(id);
    }
    public List<User> getAll(){
        return userRepository.findAll();
    }
    public String update(User user){
        userRepository.save(user);
        return "updated";
    }
    public String deleteById(Integer id){
        userRepository.deleteById(id);
        return "deleted";
    }
}
