package com.Apitesting.Airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Apitesting.Airline.Enitity.Flight;
import com.Apitesting.Airline.Service.AirLine_Service;

@RestController
@RequestMapping("/Airline")
public class Airline_Controller {
	@Autowired
	AirLine_Service service;

	@PostMapping("/create")
	public String Create_Flight(@RequestBody Flight air) {
		String msg = service.InsertData(air);
		return msg;

	}

	@GetMapping("/all_flights")
	public List<Flight> Get_All_Flights() {
		List<Flight> list = service.getAllRecord();
		return list;

	}

	@GetMapping("/get_flight/{FlightId}")
	public Flight Get_flight_by_id(@PathVariable long FlightId) {
		Flight f1 = service.getSingledata(FlightId);
		return f1;

	}

	@PutMapping("/update_flight/{FlightId}")
	public String Update_flight(@RequestBody Flight air, @PathVariable long FlightId) {
		String msg = service.updatedata(air, FlightId);
		return msg;

	}

	@DeleteMapping("/delete_flights/{FlightId}")
	public String Delete_flight(@PathVariable long FlightId) {
		String msg = service.deleteData(FlightId);
		return msg;

	}

	@GetMapping("/search_flight/{FlightId}")
     public Flight Search_flights(@PathVariable long FlightId) {
		
    	 Flight f1=service.getSingledata(FlightId);
 		return f1 ;
	}
}
	

	// @PostMapping("/booking_flight")
	// public String Book_Ticket(@RequestBody Flight air) {
	// String msg=service.InsertData(air);
	// return msg ;

	// }

	// @GetMapping("/history")
	// public String Get_all_booking() {
	// return "your booking history";

	// }

	// @DeleteMapping("/cancle")
	// public String Cancle_booking() {
	//return"your flight will cancled";

	// }

	// @PostMapping("/get_all_booking_by_id")
	// public String Get_all_booking_by_id() {
	// return "booking history";

	// }


