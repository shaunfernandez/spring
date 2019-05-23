package com.mastercard.repository;

import java.util.List;

import com.mastercard.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}