package com.Bus.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.Bus.Utilty.Dao;
import com.Bus.model.Bus;

public class CustomerImplDao implements  CustomerDao {
	

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
	public String saveCustomer(CustomerDao cst) {
	    String a = null  ;
		
			String query = "insert into Customer (CustomerId, Name, Email, Phone,Password) Values (?, ?, ?, ?, ?)";
		
			
			try {

				Connection con = Dao.getDao().getConnection() ;
				
				PreparedStatement ppsmt  = con.prepareStatement(query) ;
				
				ppsmt.setInt(1, cst.getCustomerID());  // Fixed method call
				ppsmt.setString(2,cst .getName());
				ppsmt.setString(3, cst.getEmail());
				ppsmt.setString(4, cst.getPhone());
				ppsmt.setString(5, cst.getPassword());  // Fixed method name

				int ans  =  ppsmt.executeUpdate() ;
			
				if (ans>0 ){
					a  = "Bus Have been saved" ;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
		
		return a;
	}


	
}
