package flights_schedule;

enum AirportType {
    NORTH, SOUTH
}

enum FlightType {
    LOCAL, INTERNATIONAL
}

public class Airport {
    private String cityName;
    private AirportType airportType;
    private int maxPlanesAllowed;
    private int currentPlanes;

    public Airport(String cityName, AirportType airportType, int maxPlanesAllowed) {
        this.cityName = cityName;
        this.airportType = airportType;
        this.maxPlanesAllowed = maxPlanesAllowed;
        this.currentPlanes = 0;
    }

    public String getCityName() {
        return cityName;
    }

    public AirportType getAirportType() {
        return airportType;
    }

    public int getMaxPlanesAllowed() {
        return maxPlanesAllowed;
    }

    public int getCurrentPlanes() {
        return currentPlanes;
    }

    public void setCurrentPlanes(int currentPlanes) {
        this.currentPlanes = currentPlanes;
    }
}

