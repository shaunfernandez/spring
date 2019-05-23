package com.mastercard.service;

import java.util.List;

import com.mastercard.model.Customer;
import com.mastercard.repository.CustomerRepository;
import com.mastercard.repository.HibernateCustomerRepositoryImplementation;

public class CustomerServiceImplementation implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImplementation();
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
 