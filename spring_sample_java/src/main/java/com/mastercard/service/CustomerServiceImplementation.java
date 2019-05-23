package com.mastercard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mastercard.model.Customer;
import com.mastercard.repository.CustomerRepository;

@Service("customerService")
@Scope("prototype")
public class CustomerServiceImplementation implements CustomerService {

	private CustomerRepository customerRepository;//= new HibernateCustomerRepositoryImplementation();
	
	public CustomerServiceImplementation() {
		
	}
	
	public CustomerServiceImplementation(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
 