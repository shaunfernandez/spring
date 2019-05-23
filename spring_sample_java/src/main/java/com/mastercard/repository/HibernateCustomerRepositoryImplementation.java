package com.mastercard.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.mastercard.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImplementation implements CustomerRepository {
	
	@Value("${dbUsername}")
	private String dbUsername;
	
	@Override
	public List<Customer> findAll() {
		System.out.println(dbUsername);
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Shaun");
		customer.setLastName("Fernandez");
		
		customers.add(customer);
		return customers;
	}
}
 