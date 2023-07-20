package flights_schedule;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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
           
        List<List<String>> flightsData = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("flights.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                flightsData.add(Arrays.asList(values));
            }
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        for (List<String> row : flightsData) {
            if (row.get(0).trim().equals(AirplaneID)) {
                row.set(1, Integer.toString(seatsAvailable));
                break;
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("flights.csv"))) {
            for (List<String> row : flightsData) {
                String line = String.join(",", row);
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Seats for flight ID " + AirplaneID + " updated to " + seatsAvailable);
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