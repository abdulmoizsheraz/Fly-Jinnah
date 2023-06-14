package flights_schedule;
import java.util.ArrayList;
import java.util.List;

public class FlightSchedule {
    private List<Airplane> flights;

    public FlightSchedule() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(Airplane airplane) {
        flights.add(airplane);
    }

    public void removeFlight(Airplane airplane) {
        flights.remove(airplane);
    }

    public List<Airplane> searchFlights(String keyword) {
        List<Airplane> matchingFlights = new ArrayList<>();
        for (Airplane flight : flights) {
            if (flight.getAirplaneID().contains(keyword) || flight.getAirport().getCityName().contains(keyword)) {
                matchingFlights.add(flight);
            }
        }
        return matchingFlights;
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
            System.out.println("------------------------------");
        }
    }
}