package com.Bus.model;



public class Bus {
	
	private int BusId;
	private String BusName;
	private String BusTyeps;
	 private int totalSeats;
	 public int getTotalSeats() {
		return totalSeats;
	}


	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}


	public int getAvailableSeats() {
		return AvailableSeats;
	}


	public void setAvailableSeats(int availableSeats) {
		AvailableSeats = availableSeats;
	}
	private int  AvailableSeats;
	public int getBusId() {
		return BusId;
	}
	
	
	public   void setBusId(int busId) {
		BusId = busId;
	}
	public String getBusName() {
		return BusName;
	}

	public void setBusName(String busName) {
		BusName = busName;
	}

	

	

	public String getBusTyeps() {
		return BusTyeps;
	}

	public void setBusTyeps(String busTyeps) {
		BusTyeps = busTyeps;
	}

	



public Bus(int busId, String busName, String busTyeps, int totalSeats, int availableSeats) {
		super();
		BusId = busId;
		BusName = busName;
		BusTyeps = busTyeps;
		this.totalSeats = totalSeats;
		AvailableSeats = availableSeats;
	}


public Bus() {}




	// TODO Auto-generated method stub
	


		
	

	
	

	

}
