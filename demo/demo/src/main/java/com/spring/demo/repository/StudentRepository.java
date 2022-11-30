package com.spring.demo.repository;

import com.spring.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    Optional<Student> deleteAllById(Integer studentId);
}
