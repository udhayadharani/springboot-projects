package com.spring.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="Student_test")

public class Student {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)

    @Column(name ="id")
    private int id;

    @Column(name ="name")
    private String name;

    @Column(name ="age")
    private String age;



}
