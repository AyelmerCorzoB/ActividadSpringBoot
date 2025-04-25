package com.ejercicio.startapp.Controllers;


import org.springframework.web.bind.annotation.*;

import com.ejercicio.startapp.Models.Product;
import com.ejercicio.startapp.Repository.ProductRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.DoubleSummaryStatistics;

@RestController
@RequestMapping("/api")
public class ProductController {
    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/products")
    public List<Product> getProducts(
            @RequestParam(required = false) Double minPrice,
            @RequestParam(required = false) Double maxPrice,
            @RequestParam(required = false) String category,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size
    ) {
        List<Product> filteredProducts = repo.findAll().stream()
                .filter(p -> minPrice == null || p.getPrice() >= minPrice)
                .filter(p -> maxPrice == null || p.getPrice() <= maxPrice)
                .filter(p -> category == null || p.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());

        return filteredProducts.stream()
                .skip(page * size)
                .limit(size)
                .collect(Collectors.toList());
    }

    @GetMapping("/products/stats")
    public Map<String, Double> getStats(
            @RequestParam(required = false) String category
    ) {
        DoubleSummaryStatistics statistics = repo.findAll().stream()
                .filter(p -> category == null || p.getCategory().equalsIgnoreCase(category))
                .mapToDouble(Product::getPrice)
                .summaryStatistics();

        return Map.of(
                "count", (double) statistics.getCount(),
                "avgPrice", statistics.getAverage(),
                "minPrice", statistics.getMin(),
                "maxPrice", statistics.getMax(),
                "totalValue", statistics.getSum()
        );
    }
}