package com.Bus.Utilty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao {
	// Dao class is a singleton class so only one object can be created by this DAO Class
	
	
	/// 1 
	
	private static  Dao obj  = null ;

	
	// 2 
	private Dao() {} ;
	
	
	
	// 3 s
	
	public  static Dao getDao() {
		
		if(obj == null) {
			obj  = new Dao()  ;
			
		}
		return obj  ;
		
	}



	public Connection getConnection()  {
		
		Connection con = null  ;
		try {
			 con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/paaj","root", "jeevan@06082005");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con ;
		
		

	}}