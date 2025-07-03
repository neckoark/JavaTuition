package com.Project.controller;

import com.Project.bean.*;
import com.Project.dao.*;

public class CustomerController {
	public static void main(String[] args) {
		Customer customer = new Customer();

		customer.setId(1);
		customer.setName("ABC");
		customer.setEmail("abcd@gmail.com");
		customer.setAddress("Satara");
		customer.setPhone("1234567890");

		CustomerDAO customerDAO = new CustomerDAO();
		customerDAO.showCustomer(customer);
	}

}
