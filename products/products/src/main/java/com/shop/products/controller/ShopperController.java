package com.shop.products.controller;

import com.shop.products.entity.Shopper;
import com.shop.products.service.ShopperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ShopperController {
    @Autowired
    private ShopperService shopperService;

    @PostMapping("/saveShopper")
    private String saveShopper(@RequestBody Shopper shopper) {
        shopperService.save(shopper);
        return "saved";
    }
    @PutMapping("/updateShopper")
    private  String updateShopper(@RequestBody Shopper shopper){
        shopperService.save(shopper);
        return "updated";
    }
    @DeleteMapping("/delete/{id}")
    private void deleteById(@PathVariable Integer id){
        shopperService.deleteById(id);
    }
    @GetMapping("/getBy/{id}")
    private Optional<Shopper>getBYId(@PathVariable Integer  id ){
        return shopperService.getById(id);
    }

}