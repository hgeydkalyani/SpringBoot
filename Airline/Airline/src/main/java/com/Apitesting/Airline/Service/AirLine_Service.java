package com.Apitesting.Airline.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Apitesting.Airline.Enitity.Flight;
import com.Apitesting.Airline.dao.Airline_Dao;

@Service
public class AirLine_Service {
	@Autowired
    Airline_Dao dao;
	public String InsertData(Flight  air) {
		String msg=dao.insertData(air);
		return msg;
		
	}
	public String deleteData(long FlightId) {
		String msg=dao.deleteData(FlightId);
		return msg;
		
	}
	public String updatedata(Flight air,long flightId) {
		String msg = dao.updateData(air, flightId);
		return msg;
		
	}
	public Flight getSingledata(long flightId) {
	Flight f1=dao.getSingleData(flightId);
		return f1;
		
	}
	public List<Flight> getAllRecord() {
		List<Flight> list=dao.getAllData();
		return list;
	}
}