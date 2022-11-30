package com.springboot.socialmedia.controller;

import com.springboot.socialmedia.Entity.Student;
import com.springboot.socialmedia.dto.StudentDto;
import com.springboot.socialmedia.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
        @Autowired
        private StudentService studentService;

        @PostMapping("/saveStudent")
        private String save(@RequestBody List<StudentDto> studentDto){
            studentService.save(studentDto);
            return "saved successfully";
        }
        @PutMapping("/update/{studentId}")
        private String update(@RequestBody List<StudentDto> studentDto,@PathVariable("studentId")Integer studentId){
            studentService.update(studentDto);
            return "update successfully";
        }
        @GetMapping("/getAllStudent/")
        private List<Student> getAll(){
            return   studentService.getAll();

        }@GetMapping("/getStudent/{id}")
        private Optional<Student> getById(@PathVariable("id") Integer id){
            return studentService.getById(id);
        }
        @DeleteMapping("/deleteStudent/{id}")
        private String deleteById(@PathVariable("id") Integer id){
            studentService.deleteById(id);
            return "deleted successfully";
        }
    }

