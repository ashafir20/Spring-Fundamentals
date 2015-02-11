package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aviv on 2/11/2015.
 */
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
