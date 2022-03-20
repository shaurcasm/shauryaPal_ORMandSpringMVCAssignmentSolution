package com.shaurya.customerRelationshipManager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shaurya.customerRelationshipManager.dao.CustomerDAO;
import com.shaurya.customerRelationshipManager.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	// Injecting Customer DAO
	@Autowired
	private CustomerDAO customerDAO;

	@Override
	public List<Customer> findAll() {
		return customerDAO.getAllCustomers();
	}

	@Override
	public Customer findById(int id) {
		return customerDAO.findCustomerById(id);
	}

	@Override
	public void save(Customer customer) {
		customerDAO.saveCustomer(customer);
	}

	@Override
	public void deleteById(int id) {
		customerDAO.deleteCustomerById(id);
	}

}
