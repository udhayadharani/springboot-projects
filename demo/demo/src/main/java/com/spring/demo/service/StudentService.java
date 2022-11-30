package com.spring.demo.service;

import com.spring.demo.entity.Student;
import com.spring.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public String save(Student student){
        studentRepository.saveAndFlush(student);
        return "ok";

    }
    public Optional<Student> getById(Integer studentId){
        return studentRepository.findById(studentId);

    }
    public List<Student> getAll(){
        return studentRepository.findAll();
    }

    public String deleteById(Integer studentId){
          studentRepository.deleteById(studentId);
          return "deleted successfully";



    }
}
