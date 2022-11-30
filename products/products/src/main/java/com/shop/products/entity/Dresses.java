package com.shop.products.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="dresses")

public class Dresses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="id")
    private int id;

    @Column(name="item_name")
    private String itemName;

    @Column(name="quantity")
    private long quantity;

    @Column(name="price")
    private String price;

    @Column(name="total_amount")
    private int totalAmount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="shopper_id")
    @JsonIgnore
    private Shopper shopper;



}
