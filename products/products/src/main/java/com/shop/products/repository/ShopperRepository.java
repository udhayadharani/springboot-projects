package com.shop.products.repository;

import com.shop.products.entity.Shopper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopperRepository extends JpaRepository<Shopper,Integer> {
}
