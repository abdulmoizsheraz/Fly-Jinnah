package flights_schedule;

public class Airport {
    private String cityName;
    private String airportType;
    private int maxPlanesAllowed;
    private int currentPlanes;

    public Airport(String cityName, String airportType, int maxPlanesAllowed) {
        this.cityName = cityName;
        this.airportType = airportType;
        this.maxPlanesAllowed = maxPlanesAllowed;
        this.currentPlanes = 0;
    }

    public String getCityName() {
        return cityName;
    }

    public String getAirportType() {
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