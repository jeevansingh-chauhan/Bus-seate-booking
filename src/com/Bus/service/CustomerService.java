package com.Bus.service;

import java.util.List;

import com.Bus.Dao.CustomerDao;
import com.Bus.model.Customer;

public interface CustomerService {

	public Strisng saveCustomer(Customer cst);
	 
	public List <CustomerDao> getAllCustomer() throws Exception ;
public String deleteCoustomer() throws Exception;
public String updateCustomer()throws Exception;


}
