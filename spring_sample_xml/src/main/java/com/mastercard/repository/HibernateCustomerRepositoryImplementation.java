package com.mastercard.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.mastercard.model.Customer;

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

	public String getDbUsername() {
		return dbUsername;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}
}
 