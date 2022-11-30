package com.shopping.costume.repository;

import com.shopping.costume.entity.OutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {
}
