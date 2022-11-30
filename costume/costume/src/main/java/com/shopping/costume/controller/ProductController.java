package com.shopping.costume.controller;

import com.shopping.costume.entity.Product;
import com.shopping.costume.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/saveProduct")
    private String save(@RequestBody Product product){
        productService.save(product);
        return "success";
    }
    @PutMapping("/softDelete/{id}")
    private String deleted(@PathVariable("id") Integer id ){
        productService.deleted(id);
        return "deleted";
    }


}
