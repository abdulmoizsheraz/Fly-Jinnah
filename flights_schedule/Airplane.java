package flights_schedule;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Airplane {
    private String airplaneID;
    private Airport airport;
    private String flightType;
    private int seatsAvailable;
    private int hoursRequired;
    private String arrivalTime;
    private String departureTime;

    public Airplane(String airplaneID, Airport airport, String flightType, int seatsAvailable,
                    int hoursRequired, String arrivalTime, String departureTime) {
        this.airplaneID = airplaneID;
        this.airport = airport;
        this.flightType = flightType;
        this.seatsAvailable = seatsAvailable;
        this.hoursRequired = hoursRequired;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    public String getAirplaneID() {
        return airplaneID;
    }

    public Airport getAirport() {
        return airport;
    }

    public String getFlightType() {
        return flightType;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }


public void setSeatsAvailable(int seatsAvailable,String AirplaneID) {
        this.seatsAvailable = seatsAvailable;
        this.airplaneID=AirplaneID;
           try (BufferedReader reader = new BufferedReader(new FileReader("Flights.csv"))) {
            String line;
            List<String> seats = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] SeatsAvailable = line.split(",");
                String id = SeatsAvailable[0].trim();
                String seat = SeatsAvailable[1].trim();

                       if (id.equalsIgnoreCase(AirplaneID)) {
                 SeatsAvailable[1]=String.valueOf(seatsAvailable);
                    break;
                }

            }}catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }

    }

    public int getHoursRequired() {
        return hoursRequired;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}