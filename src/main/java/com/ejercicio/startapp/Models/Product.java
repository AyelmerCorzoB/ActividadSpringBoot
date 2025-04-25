package com.ejercicio.startapp.Models;

public class Product {
    private Long id;
    private String name;
    private String Category;
    private Double price;
    private int stock;
    public Product() {
    }
    public Product(Long id, String name, String category, Double price, int stock) {
        this.id = id;
        this.name = name;
        Category = category;
        this.price = price;
        this.stock = stock;
    }
    public Product(String name, String category, Double price, int stock) {
        this.name = name;
        Category = category;
        this.price = price;
        this.stock = stock;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return Category;
    }
    public void setCategory(String category) {
        Category = category;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    
}
