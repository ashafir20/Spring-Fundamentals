package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<Customer>();

        Customer customer = new Customer();

        customer.setFirstname("bryan");
        customer.setLastname("bryan");

        customers.add(customer);

        return customers;
    }
}
