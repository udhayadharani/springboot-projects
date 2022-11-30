package com.springboot.socialmedia.service;

import com.springboot.socialmedia.Entity.Student;
import com.springboot.socialmedia.dto.StudentDto;
import com.springboot.socialmedia.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public String save(List<StudentDto> studentDtoList){
        List<StudentDto> obj = new ArrayList<StudentDto>();
        Student student1;
        for (StudentDto object : studentDtoList) {
            student1=new Student();
            student1.setName(object.getName());
            student1.setCity(object.getCity());
            student1.setState(object.getState());
            studentRepository.saveAndFlush(student1);
        }
        return "saved";
    }

    public String update(List<StudentDto> studentDtoList) {
        List<StudentDto> obj = new ArrayList<StudentDto>();
        Student student1;
        for (StudentDto object : studentDtoList) {
            student1 = new Student();
            student1.setId(object.getId());
            student1.setCity(object.getCity());
            student1.setState(object.getState());
            studentRepository.saveAndFlush(student1);

        }
        return "update";
    }
    public Optional<Student> getById(Integer id) {
        return studentRepository.findById(id);
    }
    public List<Student> getAll(){
        return studentRepository.findAll();
    }
    public String deleteById(Integer id){
        studentRepository.deleteById(id);
        return "deleted";


    }
}


