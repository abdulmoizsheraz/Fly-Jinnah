package flights_schedule;

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

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
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