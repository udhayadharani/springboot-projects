package com.spring.demo.repository;

import com.spring.demo.entity.Workers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkerRepository extends JpaRepository<Workers,Integer> {


}
