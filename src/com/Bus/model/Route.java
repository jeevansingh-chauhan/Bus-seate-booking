package com.Bus.model;


	public class Route {
	    private int routeID;
	    private String source;
	    private String destination;

	    public Route(int routeID, String source, String destination) {
	        this.routeID = routeID;
	        this.source = source;
	        this.destination = destination;
	    }
	    public  Route() {
	    	
	    }

	    // Getters and Setters
	    public int getRouteID() 
	    { return routeID; }
	    public void setRouteID(int routeID) 
	    { this.routeID = routeID; }

	    public String getSource() { return source; }
	    public void setSource(String source)
	    { this.source = source; }

	    public String getDestination() 
	    { return destination; }
	    public void setDestination(String destination) 
	    { this.destination = destination; }

	    @Override
	    public String toString() {
	        return "Route{" +
	                "routeID=" + routeID +
	                ", source='" + source + '\'' +
	                ", destination='" + destination + '\'' +
	                '}';
	    }
	}


