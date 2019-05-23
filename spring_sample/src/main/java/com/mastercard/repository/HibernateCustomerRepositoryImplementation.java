package com.mastercard.repository;

import java.util.ArrayList;
import java.util.List;

import com.mastercard.model.Customer;

public class HibernateCustomerRepositoryImplementation implements CustomerRepository {
	
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Shaun");
		customer.setLastName("Fernandez");
		
		customers.add(customer);
		return customers;
	}
}
 