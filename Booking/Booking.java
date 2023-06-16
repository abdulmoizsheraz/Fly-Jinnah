package Booking;

import flights_schedule.Airplane;
import flights_schedule.FlightSchedule;

public class Booking {
    int flightID;
    String CityName;
    Booking(String flightID,String CityName) {
for (Airplane flight : FlightSchedule.flights) {
    if((flight.getAirplaneID().equals(flightID) )&& (flight.getAirport().getCityName().equals(CityName))){
    System.out.println(flight.getSeatsAvailable()); 

    }else{
        System.out.println("Flight Doesnot exist");
    }
        }
    }
}
