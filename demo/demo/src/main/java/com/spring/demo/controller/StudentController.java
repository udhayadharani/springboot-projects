package com.spring.demo.controller;


import com.spring.demo.entity.Student;
import com.spring.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class StudentController {
        @Autowired
        private StudentService studentService;

        @PostMapping("/saveStudent")
        private  String saveStudent(@RequestBody Student student){
            studentService.save(student);
            return "student saved successfully";

        }
        @GetMapping("/get{studentId}")
        private Optional<Student> getById(@PathVariable("studentId") Integer studentId){
            return studentService.getById(studentId);
        }
        @GetMapping("/getAll")
        private  List<Student> getAll(){
            return studentService.getAll();
        }
        @PutMapping("/update")
        private String update(@RequestBody Student student){
            return studentService.save(student);
        }

        @DeleteMapping("/delete{studentId}")
        private String deleteById(@PathVariable("studentId") Integer studentId){
            return studentService.deleteById(studentId);
        }


    }
