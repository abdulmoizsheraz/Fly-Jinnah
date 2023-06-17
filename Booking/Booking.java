package Booking;
import java.util.List;
import java.util.Scanner;

import flights_schedule.Airplane;
import flights_schedule.FlightSchedule;

public class Booking {
    String flightID;
    String cityName;

    public Booking(String flightID, String cityName) {
         Scanner scanner = new Scanner(System.in);
        // boolean flightFound = false;
 FlightSchedule flightSchedule = new FlightSchedule();
    List<Airplane> flights = flightSchedule.flights;
      int index = 0;
        for (Airplane flight : flights) {
     if(flightID.equalsIgnoreCase(flight.getAirplaneID()) && cityName.equalsIgnoreCase(flight.getAirport().getCityName())){
        System.out.println("finding..");
        System.out.println("Flight found!");
        System.out.println("Are really want to book Flight? Enter Yes or No");
        String confirm=scanner.next();
        if(confirm.equalsIgnoreCase("yes")){
            int seatsAvailable=flight.getSeatsAvailable();
            int seats=seatsAvailable-1;
            flight.setSeatsAvailable(seats);
            System.out.println("Booked");
           System.out.println(flight.getSeatsAvailable());
        }else{
            System.out.println("OKA");
        }
     }
      index++;
        }

        // if (!flightFound) {
        //     System.out.println("Flight does not exist");
        // }
    }
}
