package com.Project.dao;

import com.Project.bean.Customer;

public class CustomerDAO {

	public void showCustomer(Customer customer) {
		System.out.println(customer.getName());
		System.out.println(customer.getPhone());
		System.out.println(customer.getEmail());
		System.out.println(customer.getAddress());
		System.out.println(customer.getId());
	}

}
