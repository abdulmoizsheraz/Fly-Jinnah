package flights_schedule;
import java.util.ArrayList;
import java.util.List;

public class FlightSchedule {
   public static List<Airplane> flights;

    public FlightSchedule() {
        this.flights = new ArrayList<>();
 Airport islamabadNorthAirport = new Airport("Islamabad", "NORTH", 5);
        Airport islamabadSouthAirport = new Airport("Islamabad", "SOUTH", 5);
        Airplane airplane1 = new Airplane("A1", islamabadNorthAirport, "LOCAL", 50, 2, "09:00", "11:00");
        Airplane airplane2 = new Airplane("A2", islamabadNorthAirport, "LOCAL", 50, 2, "12:00", "14:00");
        Airplane airplane3 = new Airplane("A3", islamabadNorthAirport, "INTERNATIONAL", 50, 5, "15:00", "20:00");
        Airplane airplane4 = new Airplane("A4", islamabadNorthAirport, "LOCAL", 23, 7, "17:00", "12:00");
        Airplane airplane5 = new Airplane("A4", islamabadSouthAirport, "LOCAL", 23, 7, "17:00", "12:00");
        Airplane airplane6 = new Airplane("A5", islamabadNorthAirport, "INTERNATIONAL", 50, 6, "19:00", "1:00");
        Airplane airplane7 = new Airplane("A6", islamabadNorthAirport, "INTERNATIONAL", 50, 6, "19:00", "1:00");
           flights.add(airplane1);
    flights.add(airplane2);
    flights.add(airplane3);
    flights.add(airplane4);
    flights.add(airplane5);
    flights.add(airplane6);
    flights.add(airplane7);
    }




    public void removeFlight(Airplane airplane) {
        flights.remove(airplane);
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

    public void updateAvailableSeats(Airplane airplane, int numSeats) {
        airplane.setSeatsAvailable(numSeats);
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