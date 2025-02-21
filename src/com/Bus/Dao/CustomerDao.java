package com.Bus.Dao;

import java.util.List;

import com.Bus.model.Bus;
import com.Bus.model.Customer;

public interface CustomerDao { 

	public String saveCustomer(Customer cst);
	 
		public List <CustomerDao> getAllCustomer() throws Exception ;
	public String deleteCoustomer() throws Exception;
public String updateCustomer()throws Exception;


 




}

