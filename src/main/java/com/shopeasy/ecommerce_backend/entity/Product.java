package com.shopeasy.ecommerce_backend.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(precision = 10, scale = 2)
    private BigDecimal oldPrice;

    private String image;
    private Double rating;
    private Integer reviews;
    private String category;
    private String brand;
    private Integer stock;

    public Double getRating() {
        return rating;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getOldPrice() {
        return oldPrice;
    }

    public String getImage() {
        return image;
    }

    public Integer getReviews() {
        return reviews;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public Integer getStock() {
        return stock;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setOldPrice(BigDecimal oldPrice) {
        this.oldPrice = oldPrice;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public void setReviews(Integer reviews) {
        this.reviews = reviews;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
