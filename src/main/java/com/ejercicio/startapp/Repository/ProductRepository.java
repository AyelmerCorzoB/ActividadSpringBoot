package com.ejercicio.startapp.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ejercicio.startapp.Models.Product;

@Repository
public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product("Lechuga", "Vegetales", 2.500, 8));
        products.add(new Product("Zanahoria", "Vegetales", 1.800, 15));
        products.add(new Product("Espinaca", "Vegetales", 3.000, 10));
        products.add(new Product("Tomate", "Vegetales", 4.200, 12));
        products.add(new Product("Pepino", "Vegetales", 2.800, 7));
        products.add(new Product("Pollo", "Carnes", 8.000, 5));
        products.add(new Product("Res", "Carnes", 12.000, 6));
        products.add(new Product("Cerdo", "Carnes", 9.500, 8));
        products.add(new Product("Pavo", "Carnes", 10.000, 3));
        products.add(new Product("Cordero", "Carnes", 15.000, 4));
        products.add(new Product("Yogurt", "Lacteos", 3.500, 9));
        products.add(new Product("Queso", "Lacteos", 7.800, 4));
        products.add(new Product("Leche", "Lacteos", 5.000, 10));
        products.add(new Product("Mantequilla", "Lacteos", 4.500, 5));
        products.add(new Product("Crema", "Lacteos", 6.200, 7));
        products.add(new Product("Arroz", "Granos", 4.200, 20));
        products.add(new Product("Lentejas", "Granos", 3.800, 18));
        products.add(new Product("Frijoles", "Granos", 4.000, 25));
        products.add(new Product("Maíz", "Granos", 3.500, 30));
        products.add(new Product("Garbanzos", "Granos", 4.100, 15));
    }

    public List<Product> findAll() {
        return products;
    }
}
