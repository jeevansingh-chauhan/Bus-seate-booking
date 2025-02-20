package com.Bus.Dao;

import java.util.List;

import com.Bus.model.Bus;


public interface BusDao {
	

 public String saveBus(Bus bst ) ;
	
	 
	public List<Bus> getAllBus() throws Exception ;
public String deleteBus( int Busid) throws Exception;



public String updateBus(int BusID, String BusName, String BusType, int TotalSeats, int AvailableSeate)throws Exception;


<Resultset> List<Bus> getAllBus() throws Exception;

}


