package com.ejercicio.startapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ejercicio.startapp.Models.Product;
import com.ejercicio.startapp.Repository.ProductRepository;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/api")
public class ProductController {
        private final ProductRepository repo;

        public ProductController(ProductRepository repo) {
                this.repo = repo;
        }

        @GetMapping("/products")
        public String getProducts(
                        @RequestParam(required = false) Double minPrice,
                        @RequestParam(required = false) Double maxPrice,
                        @RequestParam(required = false) String category,
                        @RequestParam(defaultValue = "0") int page,
                        @RequestParam(defaultValue = "10") int size,
                        Model model) {
                List<Product> filteredProducts = repo.findAll().stream()
                                .filter(p -> minPrice == null || p.getPrice() >= minPrice)
                                .filter(p -> maxPrice == null || p.getPrice() <= maxPrice)
                                .filter(p -> category == null || p.getCategory().equalsIgnoreCase(category))
                                .collect(Collectors.toList());
                model.addAttribute("products", filteredProducts);
                return "filterProducts";
        }

        @GetMapping("/products/stats")
        public String getStats(
                @RequestParam(required = false) String category,
                Model model
        ) {
            DoubleSummaryStatistics statistics = repo.findAll().stream()
                    .filter(p -> category == null || p.getCategory().equalsIgnoreCase(category))
                    .mapToDouble(Product::getPrice)
                    .summaryStatistics();

                Map resultado =  Map.of(
                        "count", (double) statistics.getCount(),
                        "avgPrice", statistics.getAverage(),
                        "minPrice", statistics.getMin(),
                        "maxPrice", statistics.getMax(),
                        "totalValue", statistics.getSum()
                );
                model.addAttribute("resultado", resultado);
            return "product";
        }

}