package com.spring.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="Worker")

public class Workers {

    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)

    @Column(name ="id")
    private int workersId;
    @Column(name ="name")
    private String name;
    @Column(name ="empCode")
    private int empCode;
    @Column(name ="salary")
    private long salary;
    @Column(name ="address")
    private String address;

}
