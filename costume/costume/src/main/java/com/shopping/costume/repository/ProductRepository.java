package com.shopping.costume.repository;

import com.shopping.costume.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository <Product,Integer>{


    }



