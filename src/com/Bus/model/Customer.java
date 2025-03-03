package com.Bus.model;



	public class Customer {
	    private int customerID;
	    private String name;
	    private String email;
	    private String phone;
	    private String password;

	    // Constructor
	    public Customer(int customerID, String name, String email, String phone, String password) {
	        this.customerID = customerID;
	        this.name = name;
	        this.email = email;
	        this.phone = phone;
	        this.password = password;
	    }
	    public  Customer() {
	    	
	    }

	    // Getters and Setters
	    public int getCustomerID() {
	        return customerID;
	    }

	    public void setCustomerID(int customerID) {
	        this.customerID = customerID;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    @Override
	    public String toString() {
	        return "Customer{" +
	                "customerID=" + customerID +
	                ", name='" + name + '\'' +
	                ", email='" + email + '\'' +
	                ", phone='" + phone + '\'' +
	                ", password='" + password + '\'' +
	                '}';
	    }
	}
