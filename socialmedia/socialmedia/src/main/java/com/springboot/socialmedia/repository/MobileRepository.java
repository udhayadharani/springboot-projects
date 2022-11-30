package com.springboot.socialmedia.repository;


import com.springboot.socialmedia.Entity.Mobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MobileRepository extends JpaRepository<Mobile,Integer> {
    @Query(value = "select * from mobiles where mobile_name=:mobileName", nativeQuery = true)
    Optional<Mobile> findByName(String mobileName);


    @Query(value = "select * from mobiles where mobile_name like 'p%'", nativeQuery = true)
    List<Mobile> findByFirstLetter(String mobileName);
}