package com.ejercicio.startapp.Controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ejercicio.startapp.Models.Customer;
import com.ejercicio.startapp.Repository.CustomerRepository;

@Controller
@RequestMapping("/api")
public class CustomerController {
    private final CustomerRepository repo;

    public CustomerController(CustomerRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/customers")
    public String getCustomers(
            @RequestParam(required = false) String apellido,
            Model model) {

        List<Customer> customerSearch = repo.findAll().stream()
                .filter(c -> apellido == null || c.getLastName().equalsIgnoreCase(apellido))
                .collect(Collectors.toList());
        model.addAttribute("customers", customerSearch);
        return "customer";
    }

}