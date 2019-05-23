package com.mastercard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mastercard.model.Customer;
import com.mastercard.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImplementation implements CustomerService {

	//@Autowired //Member
	private CustomerRepository customerRepository; // = new HibernateCustomerRepositoryImplementation();

	@Autowired	//Constructor
	public CustomerServiceImplementation(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	//@Autowired	//Setter Injection
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
 