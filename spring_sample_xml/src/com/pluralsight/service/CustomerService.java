package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by aviv on 2/11/2015.
 */
public interface CustomerService {
    List<Customer> findAll();
}
