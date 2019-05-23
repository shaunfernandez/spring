package com.mastercard.service;

import java.util.List;

import com.mastercard.model.Customer;
import com.mastercard.repository.CustomerRepository;

public class CustomerServiceImplementation implements CustomerService {

	private CustomerRepository customerRepository; //= new HibernateCustomerRepositoryImplementation();
	
	public CustomerServiceImplementation() {
		
	}
	
	//constructor injection
	public CustomerServiceImplementation(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;		
	}
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	//Setter injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
 