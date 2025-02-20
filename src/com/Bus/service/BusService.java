package com.Bus.service;

import java.util.List;

import com.Bus.model.Bus;
import com.Bus.model.Customer;

public interface BusService {
public String saveBus(Bus bst ) ;
	
public Bus getBusByID () throws Exception ;
	
	public List<Bus> getAllBus() throws Exception ;
	
	public String  updateBus(int BusId ,String BusName ,String BusType,int  TotalSeats, int  AvailableSeate)throws Exception ; 
	
	
	public String  deleteBus(int Busid) throws Exception;

	
}

