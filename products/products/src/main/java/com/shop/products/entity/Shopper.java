package com.shop.products.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="shopper_detail")

public class Shopper {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="id")
    private int id;

    @Column(name="shopper_name")
    private String name;

    @Column(name="address")
    private String address;

    @Column(name="ph_no")
    private long phNo;

    @Column(name="description")
    private String description;

    @Column(name="grand_total")
    private int grandTotal;

    @OneToMany(mappedBy = "shopper",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Dresses> dressesList;

}
