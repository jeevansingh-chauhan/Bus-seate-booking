package com.Bus.UseCases;
import com.Bus.model.Bus;
import com.Bus.model.Customer;
import com.Bus.service.BusService;
import com.Bus.service.BusServiceImpl;
import com.Bus.*;

import  com.Bus.service.CustomerServiceImpl;






public class BusDemo {
	public static void main(String args[]) throws Exception {
		
		
		BusService service  = new BusServiceImpl()  ;
		
		Bus bst = new Bus(656,"hee","local",105,5)  ;
	
		String  s  = service.saveBus(bst);


		System.out.println(s);
		
		String  d=  service.deleteBus(1);
		
		System.out.println(d);
		
       String  U=   service.updateBus(121,"hee","local",105,5);
		System.out.println(U);
		
		
		
		
	CustomerService  servicec =new CustomerServiceImpl();
	Customer cst=new Customer();
	String c = servicec.saveCustomer(cst);
		
		System.out.println(c);
	/// Demo  ---- SERVICE  --- serviceImpl  ---dap --- Dao impl 	
		                        //                          |-----Connection 
		
	}



		
		
		
		
		///CustomerService  Service1 =new CustomerServiceImpl();
	///	Customer cst=new Customer();
	//	String c = Service1.saveCustomer(cst);
		
	///	System.out.println(c);
	/// Demo  ---- SERVICE  --- serviceImpl  ---dap --- Dao impl 	
		                        //                          |-----Connection 
		
	}


