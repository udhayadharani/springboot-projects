package com.springboot.socialmedia.repository;

import com.springboot.socialmedia.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


}
