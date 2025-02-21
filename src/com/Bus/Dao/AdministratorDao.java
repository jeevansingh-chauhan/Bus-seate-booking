package com.Bus.Dao;

import java.util.List;

import com.Bus.model.Customer;

public interface AdministratorDao {
	public String saveAdministratorDao(Customer cst);
	 
	public List <CustomerDao> getAllCustomer() throws Exception ;
public String deleteCoustomer() throws Exception;
public String updateCustomer()throws Exception;


}
