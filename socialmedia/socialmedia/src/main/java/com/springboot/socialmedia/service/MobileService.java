package com.springboot.socialmedia.service;

import com.springboot.socialmedia.Entity.Mobile;
import com.springboot.socialmedia.dto.MobileDto;
import com.springboot.socialmedia.repository.MobileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MobileService {
    @Autowired
    private MobileRepository mobileRepository;

    public String save(List<MobileDto> mobileDtoList) {
        List<MobileDto> obj = new ArrayList<>();
         Mobile mobile;
        for (MobileDto mob : mobileDtoList) {
            mobile=new Mobile();
            mobile.setMobileName(mob.getMobileName());
            mobile.setPrice(mob.getPrice());
            mobileRepository.saveAndFlush(mobile);
        }
        return "save mobiles";
    }
    public Optional<Mobile>findByName(String mobileName){
        return mobileRepository.findByName(mobileName);
    }
    public List<Mobile>findByFirstLetter(String mobileName){
        return mobileRepository.findByFirstLetter(mobileName);
    }


    public String update(List<MobileDto> mobileDtoList) {
        List<MobileDto> obj = new ArrayList<>();
        for (MobileDto mob : mobileDtoList) {
            Mobile Mobile1 = new Mobile();
            Mobile1.setMobileName(mob.getMobileName());
            Mobile1.setPrice(mob.getPrice());
            mobileRepository.saveAndFlush(Mobile1);
        }

        return "update mobiles";
    }


}