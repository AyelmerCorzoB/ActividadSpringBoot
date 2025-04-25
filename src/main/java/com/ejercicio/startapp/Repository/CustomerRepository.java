package com.ejercicio.startapp.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ejercicio.startapp.Models.Customer;

@Repository
public class CustomerRepository {
    private final List<Customer> customers = new ArrayList<>();
    
    public CustomerRepository(){
        customers.add(new Customer("Ayelmer", "Corzo", "alancorzo1512@gmail.com"));
        customers.add(new Customer("Elidallana", "Cristancho", "Elidallana@gmail.com"));
        customers.add(new Customer("Karen", "Cristancho", "Karen@gmail.com"));
        customers.add(new Customer("Daniel", "Leal", "Daniel@gmail.com"));
        customers.add(new Customer("Yamile", "Corzo", "Yamile@gmail.com"));
        customers.add(new Customer("Yosimar", "Ruiz", "Yosimar@gmail.com"));
        customers.add(new Customer("Haslert", "Ruiz", "Haslert@gmail.com"));
        customers.add(new Customer("Stiven", "Carvajal", "Stiven@gmail.com"));
        customers.add(new Customer("Jeisson", "Perez", "Jeisson@gmail.com"));
        customers.add(new Customer("Jhorman", "Castellanos", "Jhorman@gmail.com"));
        customers.add(new Customer("Freiler", "Ortega", "Freiler@gmail.com"));
        customers.add(new Customer("Jaime", "Barrera", "Jaime@gmail.com"));
        customers.add(new Customer("Mario", "Bolañez", "Mario@gmail.com"));
        customers.add(new Customer("Viviana", "Boada", "Viviana@gmail.com"));
    }

    public List<Customer> findAll(){
        return customers;
    }
}
