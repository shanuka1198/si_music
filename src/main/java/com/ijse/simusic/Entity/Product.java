package com.ijse.simusic.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long product_id;
  @Column(name="pro_name",nullable = false)
  private String product_name;
  @Column(name="pro_brand",nullable = false)
  private String brand;
  @Column(name="pro_model",nullable = false)
  private String model;
  @Column(name="price",nullable = false)
  private Double price;

@ManyToOne
@JoinColumn(name = "cat_id")
  private Category category;
}
