package com.Bus.model;

	public class Administrator {
	    private int adminID;
	    private String name;
	    private String email;
	    private String phone;
	    private String password;

	    // Constructor
	    public Administrator(int adminID, String name, String email, String phone, String password) {
	        this.adminID = adminID;
	        this.name = name;
	        this.email = email;
	        this.phone = phone;
	        this.password = password;
	    }

	    public Administrator() {}
	    // Getters and Setters
	    public int getAdminID() {
	        return adminID;
	    }

	    public void setAdminID(int adminID) {
	        this.adminID = adminID;
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
	        return "Administrator{" +
	                "adminID=" + adminID +
	                ", name='" + name + '\'' +
	                ", email='" + email + '\'' +
	                ", phone='" + phone + '\'' +
	                ", password='" + password + '\'' +
	                '}';
	    }
	
}
