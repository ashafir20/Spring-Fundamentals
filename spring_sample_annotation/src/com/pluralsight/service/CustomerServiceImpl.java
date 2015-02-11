package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	//ctor injection
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using ctor injection");
		
		this.customerRepository = customerRepository;
	}
	
	//member injection
	/*@Autowired*/
    private CustomerRepository customerRepository;
    
    //setter injection
	/*@Autowired*/
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection");
		
		this.customerRepository = customerRepository;
	}
	
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
