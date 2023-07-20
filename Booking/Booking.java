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
        boolean flightFound = false; // Variable to track if the flight is found or not
        FlightSchedule flightSchedule = new FlightSchedule();
        List<Airplane> flights = flightSchedule.flights;

        for (Airplane flight : flights) {
            if (AirplaneID.equalsIgnoreCase(flight.getAirplaneID()) && cityName.equalsIgnoreCase(flight.getAirport().getCityName())) {
                System.out.println("Finding...");
                if (flight.getSeatsAvailable() == 0) {
                    System.out.println("Flight not available. All seats are booked.");
                    flightFound = true;
                    break;
                }

                System.out.println("Flight found!");
                System.out.println("Are you sure you want to book the flight? Enter Yes or No");
                String confirm = scanner.next();
                if (confirm.equalsIgnoreCase("yes")) {
                    int seatsAvailable = flight.getSeatsAvailable();
                    int seats = seatsAvailable - 1;
                    // updating seats..
                    flight.setSeatsAvailable(seats, AirplaneID);
                    System.out.println("Booked!");
                    System.out.println("Your Ticket");
                    System.out.println("Flight ID: " + flight.getAirplaneID());
                    System.out.println("City: " + flight.getAirport().getCityName());
                    System.out.println("Seat no "+ flight.getSeatsAvailable());
                } else {
                    System.out.println("Fine..");
                }
                flightFound = true; 
                break; 
            }
        }

        if (!flightFound) {
            System.out.println("Flight not found");
        }
    }
}
