package flights_schedule;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FlightSchedule {
    public  List<Airplane> flights;
    public FlightSchedule() {
        this.flights = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("Flights.csv"))) {
            String line;
            List<String> seats = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] SeatsAvailable = line.split(",");
                String seat = SeatsAvailable[1].trim();
                seats.add(seat);
            }

            int A1S =Integer.parseInt(seats.get(0));
            int A2S =Integer.parseInt(seats.get(1));
            int A3S =Integer.parseInt(seats.get(2));
            int A4S =Integer.parseInt(seats.get(3));
            int A5S =Integer.parseInt(seats.get(4));
            int A6S =Integer.parseInt(seats.get(5));
             flights = new ArrayList<>();
  Airport islamabadNorthAirport = new Airport("Islamabad", "NORTH", 5);
        Airport islamabadSouthAirport = new Airport("Islamabad", "SOUTH", 5);
        Airplane airplane1 = new Airplane("A1", islamabadNorthAirport, "LOCAL", A1S, 2, "09:00", "11:00");
        Airplane airplane2 = new Airplane("A2", islamabadNorthAirport, "LOCAL", A2S, 2, "12:00", "14:00");
        Airplane airplane3 = new Airplane("A3", islamabadNorthAirport, "INTERNATIONAL", A3S, 5, "15:00", "20:00");
        Airplane airplane4 = new Airplane("A4", islamabadNorthAirport, "LOCAL", A4S, 7, "17:00", "12:00");
        Airplane airplane5 = new Airplane("A4", islamabadSouthAirport, "LOCAL", A5S, 7, "17:00", "12:00");
        Airplane airplane6 = new Airplane("A5", islamabadNorthAirport, "INTERNATIONAL", A6S, 6, "19:00", "1:00");
       
        flights.add(airplane1);
        flights.add(airplane2);
        flights.add(airplane3);
        flights.add(airplane4);
        flights.add(airplane5);
        flights.add(airplane6);

        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }

    }
public void printAvailableFlights(String keyword) {
    boolean foundMatchingFlights = false;

    for (Airplane flight : flights) {
        if (flight.getAirplaneID().contains(keyword) || flight.getAirport().getCityName().contains(keyword)) {
            System.out.println("Flight ID: " + flight.getAirplaneID());
            System.out.println("City: " + flight.getAirport().getCityName());
            System.out.println("Available Seats: " + flight.getSeatsAvailable());
            System.out.println("--------------------------");
            foundMatchingFlights = true;
        }
    }

    if (!foundMatchingFlights) {
        System.out.println("No available flights matching the keyword: " + keyword);
    }
}
    public void displaySchedule() {
        for (Airplane flight : flights) {
            System.out.println("Flight ID: " + flight.getAirplaneID());
            System.out.println("City: " + flight.getAirport().getCityName());
            System.out.println("Airport Type: " + flight.getAirport().getAirportType());
            System.out.println("Flight Type: " + flight.getFlightType());
            System.out.println("Seats Available: " + flight.getSeatsAvailable());
            System.out.println("Hours Required: " + flight.getHoursRequired());
            System.out.println("Arrival Time: " + flight.getArrivalTime());
            System.out.println("Departure Time: " + flight.getDepartureTime());
            System.out.println("___________________________________");
        }
    }

}
