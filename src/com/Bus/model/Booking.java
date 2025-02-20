package com.Bus.model;

	import java.util.Date;

	public class Booking {
	    private int bookingID;
	    private int customerID;
	    private int adminID;
	    private int busID;
	    private int routeID;
	    private String seatNumber;
	    private Date bookingDate;
	    private String status;  // Pending, Confirmed, Cancelled

	    public Booking(int bookingID, int customerID, int adminID, int busID, int routeID, String seatNumber, Date bookingDate, String status) {
	        this.bookingID = bookingID;
	        this.customerID = customerID;
	        this.adminID = adminID;
	        this.busID = busID;
	        this.routeID = routeID;
	        this.seatNumber = seatNumber;
	        this.bookingDate = bookingDate;
	        this.status = status;
	    }
public Booking() {
	
}
	    // Getters and Setters
	    public int getBookingID() { return bookingID; }
	    public void setBookingID(int bookingID) { this.bookingID = bookingID; }

	    public int getCustomerID() { return customerID; }
	    public void setCustomerID(int customerID) { this.customerID = customerID; }

	    public int getAdminID() { return adminID; }
	    public void setAdminID(int adminID) { this.adminID = adminID; }

	    public int getBusID() { return busID; }
	    public void setBusID(int busID) { this.busID = busID; }

	    public int getRouteID() { return routeID; }
	    public void setRouteID(int routeID) { this.routeID = routeID; }

	    public String getSeatNumber() { return seatNumber; }
	    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }

	    public Date getBookingDate() { return bookingDate; }
	    public void setBookingDate(Date bookingDate) { this.bookingDate = bookingDate; }

	    public String getStatus() { return status; }
	    public void setStatus(String status) { this.status = status; }
	    

	    @Override
	    public String toString() {
	        return "Booking{" +
	                "bookingID=" + bookingID +
	                ", customerID=" + customerID +
	                ", adminID=" + adminID +
	                ", busID=" + busID +
	                ", routeID=" + routeID +
	                ", seatNumber='" + seatNumber + '\'' +
	                ", bookingDate=" + bookingDate +
	                ", status='" + status + '\'' +
	                '}';
	    }
	}

