package com.Bus.model;


	import java.util.Date;

	public class Payment {
	    private int paymentID;
	    private int bookingID;
	    private double amount;
	    private String paymentStatus;
	    private Date paymentDate;

	    public Payment(int paymentID, int bookingID, double amount, String paymentStatus, Date paymentDate) {
	        this.paymentID = paymentID;
	        this.bookingID = bookingID;
	        this.amount = amount;
	        this.paymentStatus = paymentStatus;
	        this.paymentDate = paymentDate;
	    }
	    public Payment() {
	    	
	    }

	    // Getters and Setters
	    public int getPaymentID() { return paymentID; }
	    public void setPaymentID(int paymentID) { this.paymentID = paymentID; }

	    public int getBookingID() { return bookingID; }
	    public void setBookingID(int bookingID) { this.bookingID = bookingID; }

	    public double getAmount() { return amount; }
	    public void setAmount(double amount) { this.amount = amount; }

	    public String getPaymentStatus() { return paymentStatus; }
	    public void setPaymentStatus(String paymentStatus) { this.paymentStatus = paymentStatus; }

	    public Date getPaymentDate() { return paymentDate; }
	    public void setPaymentDate(Date paymentDate) { this.paymentDate = paymentDate; }

	    @Override
	    public String toString() {
	        return "Payment{" +
	                "paymentID=" + paymentID +
	                ", bookingID=" + bookingID +
	                ", amount=" + amount +
	                ", paymentStatus='" + paymentStatus + '\'' +
	                ", paymentDate=" + paymentDate +
	                '}';
	    }
	
}
