package com.shop.products.service;

import com.shop.products.entity.Dresses;
import com.shop.products.entity.Shopper;
import com.shop.products.repository.DressesRepository;
import com.shop.products.repository.ShopperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShopperService {
    @Autowired
    private ShopperRepository shopperRepository;

    @Autowired
    private DressesRepository dressesRepository;
    public String save(Shopper shopper){
        shopper=shopperRepository.save(shopper);
        for(Dresses obj:shopper.getDressesList()){
            obj.setShopper(shopper);
            dressesRepository.saveAndFlush(obj);
        }
        return "saved shopper";
    }
    public String updateShopper(Shopper shopper) {
        shopper = shopperRepository.save(shopper);
        for (Dresses obj : shopper.getDressesList()) {
            obj.setShopper(shopper);
            dressesRepository.saveAndFlush(obj);
        }
        return "update shopper";

    }
    public void deleteById(Integer id){
        shopperRepository.deleteById(id);
    }
    public Optional<Shopper> getById(Integer id){
        return shopperRepository.findById(id);
    }

}
