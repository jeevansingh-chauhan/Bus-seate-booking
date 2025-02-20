package com.Bus.Dao;
import java.sql.Connection;	
import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.Bus.Utilty.Dao;
import com.Bus.model.Bus;



public  class BusDaoImp<resultSet> implements BusDao{

	



	@Override	
	public  String saveBus(Bus bst) {
	 	// TODO Auto-generated method stub
        String a = null  ;
		
		String query = "insert into Bus (BusId, BusName, BusType, TotalSeats, AvailableSeats) Values (?, ?, ?, ?, ?)";
	
		
		try {

			Connection con = Dao.getDao().getConnection() ;
			
			PreparedStatement ppsmt  = con.prepareStatement(query) ;
			
			ppsmt.setInt(1, bst.getBusId() );
			ppsmt.setString(2, bst.getBusName());
			ppsmt.setString(3, bst.getBusTyeps());
			ppsmt.setInt(4,bst.getTotalSeats());
			ppsmt.setInt (5, bst.getAvailableSeats());
			
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



	@Override
	public <Resultset> List<Bus> getAllBus() throws Exception {
		// TODO Auto-generated method stub
		 List<Bus> buses = new ArrayList<>();
		 ResultSet resultSet = null;
		    PreparedStatement ppsmt = null;
		    Connection c = null;

		    try {
		        String query = "SELECT * FROM Bus";
		        c = Dao.getDao().getConnection();
		        ppsmt = c.prepareStatement(query);
		        resultSet= ppsmt.executeQuery();

		        while (resultSet.next()) {
		            int busId =resultSet.getInt("BusID");
		            String name = resultSet.getString("Name");
		            String course =resultSet.getString("Course");
		            String address = resultSet.getString("Address");

		            System.out.println("BusId: " + busId + ", Name: " + name + ", Course: " + course + ", Address: " + address);

		            buses.add(new Bus(busId, name, course, address));  // Assuming Bus has a constructor
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		    	
		        try {
		            if (resultSet != null)resultSet.close();
		            if (ppsmt != null) ppsmt.close();
		            if (c != null) c.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		    return buses;
		}

	@Override
	public String deleteBus(int Busid) throws Exception {
		String a=null;
		try {
			String q = "DELETE FROM Bus  WHERE BusID=?";
			Connection  con =  Dao.getDao().getConnection() ;
			PreparedStatement  ppsmt = con.prepareStatement(q);
		         ppsmt.setInt(1,Busid);
			int ans = ppsmt.executeUpdate();
		
			if (ans>0) {
			  
				a ="Bus deleted Successfully";
		}
	}
		catch (SQLException e) {
			e.printStackTrace();
			
		}
		
		return a= "Bus not found "+Busid;
	
			}
			
			


	@Override
	public String updateBus(int BusID, String BusName, String BusType, int TotalSeats, int AvailableSeate) throws Exception {
		String a=null;
			try {
			String q = "UPDATE Bus SET BusName=?,BusType=?,TotalSeats=?,AvailableSeats=?  WHERE BusID=?";
			Connection  con =  Dao.getDao().getConnection() ;
			PreparedStatement  ppsmt = con.prepareStatement(q);
		 
			 ppsmt.setString(1, BusName);
			ppsmt.setString(2, BusType);
			
			ppsmt.setInt (3,TotalSeats);
			ppsmt.setInt (4, AvailableSeate);
			ppsmt.setInt (5,BusID);
		
			int ans = ppsmt.executeUpdate();
		
		if(  ans>0) {
			a= "Bus Table  Updated Successfully";
		}
			} catch (SQLException e) {
			e.printStackTrace();
			} 
				
				
			
		

		return a="Bus table is not Updated ";
	}

	
	}



	


