package com.Bus.service;

import java.util.List;

import com.Bus.Dao.BusDao;
import com.Bus.Dao.BusDaoImp;
import com.Bus.model.Bus;



public class BusServiceImpl implements BusService {
	BusDao dao = new BusDaoImp()  ;

	@Override
	public String saveBus(Bus bst) {
		// TODO Auto-generated method stub
		String  s = dao.saveBus(bst) ;
		
		return s;
	}

	@Override
	public Bus getBusByID() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bus> getAllBus() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public    String updateBus(int BusID ,String BusName ,String BusType,int  TotalSeats,int  AvailableSeate) throws Exception {
		// TODO Auto-generated method stub
		  String U= dao.updateBus(BusID , BusName , BusType,  TotalSeats,  AvailableSeate );
	    return U ;
	}

	@Override
	public String deleteBus(int Busid) throws Exception {
		
	    
		// TODO Auto-generabstted method stub
        String  s= dao.deleteBus(Busid);
		return s;
		
	}

}
