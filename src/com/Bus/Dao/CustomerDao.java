package com.Bus.Dao;

import java.util.List;

import com.Bus.model.Bus;

public interface CustomerDao { 

	public String saveCustomer(CustomerDao cst);
	 
		public List <CustomerDao> getAllCustomer() throws Exception ;
	public String deleteCoustomer() throws Exception;
public String updateCustomer()throws Exception;


 




}

