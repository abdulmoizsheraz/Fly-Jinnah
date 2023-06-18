package Booking;
import java.util.List;
import java.util.Scanner;

import flights_schedule.Airplane;
import flights_schedule.FlightSchedule;

public class Booking {
    String AirplaneID;
    String cityName;

    public Booking(String AirplaneID, String cityName) {
         Scanner scanner = new Scanner(System.in);
        // boolean flightFound = false;
  FlightSchedule flightSchedule = new FlightSchedule();
    List<Airplane> flights = flightSchedule.flights;
     
        for (Airplane flight : flights) {
     if(AirplaneID.equalsIgnoreCase(flight.getAirplaneID()) && cityName.equalsIgnoreCase(flight.getAirport().getCityName())){
        System.out.println("finding..");
        System.out.println("Flight found!");
        System.out.println("Are really want to book Flight? Enter Yes or No");
        String confirm=scanner.next();
        if(confirm.equalsIgnoreCase("yes")){
            int seatsAvailable=flight.getSeatsAvailable();
            int seats=seatsAvailable-1;
         System.out.println("Before"+flight.getSeatsAvailable());
            flight.setSeatsAvailable(seats,AirplaneID);
            System.out.println("Booked");
           System.out.println(flight.getSeatsAvailable());
        }else{
            System.out.println("OKA");
        }
     }
      
        }

        // if (!flightFound) {
        //     System.out.println("Flight does not exist");
        // }
    }
}
