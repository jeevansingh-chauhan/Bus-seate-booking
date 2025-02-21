package com.Bus.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.Bus.Dao.CustomerDao;
import com.Bus.Utilty.Dao;

public class CustomerServiceImpl implements CustomerService  {
  CustomerService dao  =new CustomerServiceImpl();
	@Override
	public List<CustomerDao> getAllCustomer() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCoustomer() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCustomer() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	
		

	@Override
	public String saveCustomer(com.Bus.model.Customer cst) {
		// TODO Auto-generated method stub
		String  c = dao.saveCustomer(cst) ;
		  return c;
	}


	}

	


