package com.ejercicio.startapp.Controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.startapp.Models.Customer;
import com.ejercicio.startapp.Repository.CustomerRepository;

@RestController
@RequestMapping("/api")
public class CustomerController {
    private final CustomerRepository repo;

    public CustomerController(CustomerRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers(
        @RequestParam(required = false) String lastName) {
        
        return repo.findAll().stream()
            .filter(customer -> 
                lastName == null || 
                (customer.getLastName() != null && 
                 customer.getLastName().equalsIgnoreCase(lastName)))
            .collect(Collectors.toList());
    }
}