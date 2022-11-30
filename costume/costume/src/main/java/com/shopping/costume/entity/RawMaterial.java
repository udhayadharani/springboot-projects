package com.shopping.costume.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Raw_material")

public class RawMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "material_name")
    private String materialName;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "uom")
    private String uom;

    @Column(name = "price")
    private long price;

    @Column(name = "total_Amount")
    private long totalAmount;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;


}
