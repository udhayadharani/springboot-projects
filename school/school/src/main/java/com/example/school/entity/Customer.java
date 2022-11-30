package com.example.school.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customer_details")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_id")
    private int id;

    @Column(name="customer_name")
    private String customerName;

    @OneToMany(mappedBy = "customer" ,fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Address> addressList;


}
