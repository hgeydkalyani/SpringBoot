package com.Apitesting.Airline.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Apitesting.Airline.Enitity.Flight;

@Repository
public class Airline_Dao {
    @Autowired
	SessionFactory factory;
	
    public String  insertData(Flight flight) {
    	Session session =factory.openSession();
    	Transaction tx =session.beginTransaction();
    	session.persist(flight);
    	tx.commit();
    	session.close();
    	String msg="flight is inserted";
		return msg;
    	
    }
  
        public String deleteData(Long id) {
        	Session session =factory.openSession();
        	Transaction tx =session.beginTransaction();
        	Flight f1=session.get(Flight.class,id);
        	session.remove(f1);
        	tx.commit();
        	session.close();
        	String msg="flight is deleted";
    		return msg;
        	
        }

		public String updateData(Flight flight, long flightId) {
        	Session session =factory.openSession();
        	Transaction tx =session.beginTransaction();
        	Flight f1=session.get(Flight.class ,flightId);
        	f1.setFlightNumber(flight.getFlightNumber());
        	f1.setArrivalTime(flight.getArrivalTime());
        	f1.setDepartureTime(flight.getDepartureTime());
        	f1.setDestination(flight.getDestination());
        	f1.setSource(flight.getSource());
        	f1.setPrice(flight.getPrice());
        	f1.setAirlineName(flight.getAirlineName());
        	session.merge(f1);
        	tx.commit();
        	session.close();
        	
        	
        	String msg="flight is updated";
    		return msg;
        	
        }
        public Flight getSingleData(long flightId) {

    		Session session = factory.openSession();
    		Transaction tx = session.beginTransaction();
    		String hqlQuery = "from Flight where  flightId=:flightId";
    		Query<Flight> query = session.createQuery(hqlQuery, Flight.class);
    		query.setParameter("flightId", flightId);
    		Flight f1 = query.getSingleResult();
    		tx.commit();
    		session.close();
    		return f1;
    	}
    
        public List<Flight> getAllData() {
        	Session session=factory.openSession();
        	Transaction tx=session.beginTransaction();
        	String hqlQuery="from Flight";
           Query <Flight> query =session.createQuery(hqlQuery,Flight.class);
           List<Flight> list=query.list();
           tx.commit();
           session.close();
			return list;
        	
        }
}
