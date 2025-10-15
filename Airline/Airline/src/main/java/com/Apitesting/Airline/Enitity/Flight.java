package com.Apitesting.Airline.Enitity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Flight {
	@Id
   private Long flightId;
   private String flightNumber;
   private String airlineName;
   private String source;
   private String destination;
   private LocalDateTime departureTime;
   private LocalDateTime arrivalTime;
   private double price;
   public Flight() {
	super();
	// TODO Auto-generated constructor stub
   }
   public Flight(Long flightId, String flightNumber, String airlineName, String source, String destination,
		LocalDateTime departureTime, LocalDateTime arrivalTime, double price) {
	super();
	this.flightId = flightId;
	this.flightNumber = flightNumber;
	this.airlineName = airlineName;
	this.source = source;
	this.destination = destination;
	this.departureTime = departureTime;
	this.arrivalTime = arrivalTime;
	this.price = price;
   }
   public Long getFlightId() {
	return flightId;
   }
   public void setFlightId(Long flightId) {
	this.flightId = flightId;
   }
   public String getFlightNumber() {
	return flightNumber;
   }
   public void setFlightNumber(String flightNumber) {
	this.flightNumber = flightNumber;
   }
   public String getAirlineName() {
	return airlineName;
   }
   public void setAirlineName(String airlineName) {
	this.airlineName = airlineName;
   }
   public String getSource() {
	return source;
   }
   public void setSource(String source) {
	this.source = source;
   }
   public String getDestination() {
	return destination;
   }
   public void setDestination(String destination) {
	this.destination = destination;
   }
   public LocalDateTime getDepartureTime() {
	return departureTime;
   }
   public void setDepartureTime(LocalDateTime departureTime) {
	this.departureTime = departureTime;
   }
   public LocalDateTime getArrivalTime() {
	return arrivalTime;
   }
   public void setArrivalTime(LocalDateTime arrivalTime) {
	this.arrivalTime = arrivalTime;
   }
   public double getPrice() {
	return price;
   }
   public void setPrice(double price) {
	this.price = price;
   }
   @Override
   public String toString() {
	return "AirLine_Enitity [flightId=" + flightId + ", flightNumber=" + flightNumber + ", airlineName=" + airlineName
			+ ", source=" + source + ", destination=" + destination + ", departureTime=" + departureTime
			+ ", arrivalTime=" + arrivalTime + ", price=" + price + "]";
   }
   
   
}
