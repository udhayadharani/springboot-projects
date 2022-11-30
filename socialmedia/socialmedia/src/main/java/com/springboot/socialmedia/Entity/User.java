package com.springboot.socialmedia.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_details")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(name="user_name")
    private String userName;
    @Column(name="dob")
    private String dob;
    @Column(name="city")
    private String city;
    @Column(name="country")
    private String country;


}
