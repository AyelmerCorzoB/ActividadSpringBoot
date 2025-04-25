package com.ejercicio.startapp.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ejercicio.startapp.Models.Product;

@Repository
public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    public ProductRepository() {
        products.add(new Product("Lechuga", "Vegetal", 2.500, 8));
        products.add(new Product("Zanahoria", "Vegetal", 1.800, 15));
        products.add(new Product("Pollo", "Carnes", 8.000, 5));
        products.add(new Product("Res", "Carnes", 12.000, 6));
        products.add(new Product("Arroz", "Granos", 4.200, 20));
        products.add(new Product("Lentejas", "Granos", 3.800, 18));
        products.add(new Product("Banano", "Fruta", 2.000, 10));
        products.add(new Product("Uvas", "Fruta", 6.500, 7));
        products.add(new Product("Yogurt", "Lácteo", 3.500, 9));
        products.add(new Product("Queso", "Lácteo", 7.800, 4));
        products.add(new Product("Pan", "Panadería", 1.200, 12));
        products.add(new Product("Galletas", "Snack", 4.000, 15));
        products.add(new Product("Jabón", "Limpieza", 5.500, 6));
        products.add(new Product("Shampoo", "Higiene", 8.000, 5));
        products.add(new Product("Atún", "Enlatado", 6.000, 8));
        products.add(new Product("Sardinas", "Enlatado", 5.500, 7));
        products.add(new Product("Huevos", "Granja", 9.000, 30));
        products.add(new Product("Mantequilla", "Lácteo", 4.500, 5));
        products.add(new Product("Papel Higiénico", "Hogar", 12.000, 4));
        products.add(new Product("Detergente", "Limpieza", 10.000, 3));
        products.add(new Product("Cereal", "Desayuno", 7.500, 6));
    }

    public List<Product> findAll(){
        return products;
    }
}
