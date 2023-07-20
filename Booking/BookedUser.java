package Booking;

public class BookedUser {
    private String username;
    private String flightID;

    public BookedUser(String username, String flightID) {
        this.username = username;
        this.flightID = flightID;
    }

    public String getUsername() {
        return username;
    }

    public String getFlightID() {
        return flightID;
    }

}
