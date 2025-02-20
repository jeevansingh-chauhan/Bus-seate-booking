package com.Bus.service;

import java.util.List;

import com.Bus.Dao.CustomerDao;

public interface CustomerService {
	 public String save(CustomerService  cst) throws Exception ;
		
	 public String Customer() throws Exception;	 
		public List<CustomerDao> getAllCustomer() throws Exception ;
	public String deleteCoustomer() throws Exception;
public String updateCustomer()throws Exception;


}
