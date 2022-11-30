package com.shopping.costume.service;

import com.shopping.costume.entity.OutputProduct;
import com.shopping.costume.entity.Product;
import com.shopping.costume.entity.RawMaterial;
import com.shopping.costume.repository.OutputProductRepository;
import com.shopping.costume.repository.ProductRepository;
import com.shopping.costume.repository.RawMaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OutputProductRepository outputProductRepository;
    @Autowired
    private RawMaterialRepository rawMaterialRepository;

    public String save(Product product) {
        Date date = new Date();
        product.setCreatedDate(date);
        product.setModifyDate(date);

        product = productRepository.save(product);
        for (OutputProduct obj1 : product.getOutputProductList()) {
            obj1.setProduct(product);
            outputProductRepository.save(obj1);
        }
        for (RawMaterial obj2 : product.getRawMaterialList()) {
            obj2.setProduct(product);
            rawMaterialRepository.save(obj2);
        }
        return "success";
    }
    public String update(Product product) {
        Date date = new Date();
        product.setCreatedDate(date);
        product.setModifyDate(date);

        product = productRepository.save(product);
        for (OutputProduct obj1 : product.getOutputProductList()) {
            obj1.setProduct(product);
            outputProductRepository.save(obj1);
        }
        for (RawMaterial obj2 : product.getRawMaterialList()) {
            obj2.setProduct(product);
            rawMaterialRepository.save(obj2);
        }
        return "success";
    }
    public void deleted(Integer id){
        if(id!= null){
            Optional<Product> productObj=productRepository.findById(id);
            Product obj=productObj.get();
            obj.setStatus("in active");
            obj.setDeletedBy("udhaya");
            obj.setDeletedOn(new Date());
            productRepository.saveAndFlush(obj);
        }
    }


}
