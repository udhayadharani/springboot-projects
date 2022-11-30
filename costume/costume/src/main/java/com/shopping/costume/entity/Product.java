package com.shopping.costume.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="product_table")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="product_name")
    private String productName;

    @Column(name="product_type")
    private String productType;

    @Column(name="quantity")
    private int quantity;

    @Column(name="description")
    private String description;

    @Column(name="created_by")
    private String createdBy ;

    @Column(name="created_date")
    private Date createdDate;

    @Column(name="modify_by")
    private String modifyBy;

    @Column(name="modify_date")
    private Date modifyDate;

    @Column(name="raw_material_amount")
    private double rawMaterialAmount;

    @Column(name="product_grand_total")
    private double productGrandTotal;

    @Column(name="status")
    private String status;

    @Column(name="deleted_by")
    private String deletedBy;

    @Column(name="deleted_on")
    private Date deletedOn;


    @OneToMany(mappedBy = "product",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<RawMaterial> rawMaterialList;

    @OneToMany(mappedBy = "product",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<OutputProduct>outputProductList;


}
