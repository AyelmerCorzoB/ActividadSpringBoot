package com.ejercicio.startapp.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ejercicio.startapp.Models.Customer;

@Repository
public class CustomerRepository {
    private final List<Customer> customers = new ArrayList<>();
    
    public CustomerRepository(){
        customers.add(new Customer(1,"Ayelmer", "Corzo", "alancorzo1512@gmail.com"));
        customers.add(new Customer(2,"Elidallana", "Cristancho", "Elidallana@gmail.com"));
        customers.add(new Customer(3,"Karen", "Cristancho", "Karen@gmail.com"));
        customers.add(new Customer(4,"Daniel", "Leal", "Daniel@gmail.com"));
        customers.add(new Customer(5,"Yamile", "Corzo", "Yamile@gmail.com"));
        customers.add(new Customer(6,"Yosimar", "Ruiz", "Yosimar@gmail.com"));
        customers.add(new Customer(7,"Haslert", "Ruiz", "Haslert@gmail.com"));
        customers.add(new Customer(8,"Stiven", "Carvajal", "Stiven@gmail.com"));
        customers.add(new Customer(9,"Jeisson", "Perez", "Jeisson@gmail.com"));
        customers.add(new Customer(10,"Jhorman", "Castellanos", "Jhorman@gmail.com"));
        customers.add(new Customer(11,"Freiler", "Ortega", "Freiler@gmail.com"));
        customers.add(new Customer(12,"Jaime", "Barrera", "Jaime@gmail.com"));
        customers.add(new Customer(13,"Mario", "Bolañez", "Mario@gmail.com"));
        customers.add(new Customer(14,"Viviana", "Boada", "Viviana@gmail.com"));
    }

    public List<Customer> findAll(){
        return customers;
    }
}
