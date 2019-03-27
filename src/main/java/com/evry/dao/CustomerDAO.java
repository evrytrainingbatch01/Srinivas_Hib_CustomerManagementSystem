package com.evry.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.evry.model.RegisterCustomer;
import com.evry.uitl.HibernteUtil;

public class CustomerDAO {

	public void addCustomerDetails(String username, String password, String age, String email, String Address,
			String mobileno) {
		Session session = HibernteUtil.getSession();

		Transaction tx = session.beginTransaction();

		RegisterCustomer customer = new RegisterCustomer();
		customer.setUsername(username);
		customer.setPassword(password);
		customer.setAge(age);
		customer.setEmail(email);
		customer.setAddress(Address);
		customer.setMobileno(mobileno);
		session.save(customer);
		tx.commit();
		System.out.println("Customer Added Successfully !!!");

		session.close();
	}

}
