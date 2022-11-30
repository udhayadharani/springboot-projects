package com.springboot.socialmedia.controller;

import com.springboot.socialmedia.Entity.Mobile;
import com.springboot.socialmedia.dto.MobileDto;

import com.springboot.socialmedia.service.MobileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MobileController {
    @Autowired
    private MobileService mobileService;

    @PostMapping("/saveMobile")
    private String save(@RequestBody List<MobileDto> mobileDto) {
        mobileService.save(mobileDto);
        return "saved successfully";
    }
    @GetMapping("/getMobile/{mobileName}")
    private Optional<Mobile>findById(@PathVariable("mobileName")String mobileName){
        return mobileService.findByName(mobileName);
    }
    @GetMapping("/getFirstLetter/{mobileName}")
    private List<Mobile>findByFirstLetter(@PathVariable("mobileName")String mobileName){
        return mobileService.findByFirstLetter(mobileName);
    }


}