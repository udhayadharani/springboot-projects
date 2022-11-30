package com.shop.products.repository;

import com.shop.products.entity.Dresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DressesRepository extends JpaRepository<Dresses,Integer> {
}
