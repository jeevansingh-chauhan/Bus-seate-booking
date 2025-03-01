package com.Bus.UseCases;
import com.Bus.model.Bus;
import com.Bus.service.BusService;
import com.Bus.service.BusServiceImpl;

import java.util.List;

public class BusDemo {
	public static void main(String args[]) throws Exception {
		

		BusService service  = new BusServiceImpl()  ;
		
		Bus bst = new Bus(171,"hee","local",1,5)  ;
	
		String  s  = service.saveBus(bst);


		System.out.println(s);
		
		String  d=  service.deleteBus(3333);
		
		System.out.println(d);
		
       String  U=   service.updateBus(121,"local","rde",01,6);
		System.out.println(U);
		
		 List<Bus> Bus = service.getAllBus() ;
		System .out.println(Bus) ;

	
	/*  CustomerServiceImpl Service =new CustomerServiceImpl();
  	   Customer cst=new Customer(2020 ,"rajesh","jeeebsm2@gmail.com","1233444441","djjjee34");
	   String c = Service.saveCustomer(cst);
		System .out.println(c) ;*/

}}

	/// Demo  ---- SERVICE  --- serviceImpl  ---dap --- Dao impl 
	// * 	                                                      | 
	// *                                                         connection
	//*/


		
		
		
		

