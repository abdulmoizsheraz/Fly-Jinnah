package flights_schedule;

public class FJApp {
    public static void main(String[] args) {
        Airport islamabadNorthAirport = new Airport("Islamabad", AirportType.NORTH, 5);
        Airport islamabadSouthAirport = new Airport("Islamabad", AirportType.SOUTH, 5);

        Airplane airplane1 = new Airplane("A1", islamabadNorthAirport, FlightType.LOCAL, 50, 2, "09:00", "11:00");
        Airplane airplane2 = new Airplane("A2", islamabadNorthAirport, FlightType.LOCAL, 50, 2, "12:00", "14:00");
        Airplane airplane3 = new Airplane("A3", islamabadNorthAirport, FlightType.INTERNATIONAL, 50, 5, "15:00", "20:00");
        Airplane airplane4 = new Airplane("A4", islamabadNorthAirport, FlightType.LOCAL, 23, 7, "17:00", "12:00");
        Airplane airplane5 = new Airplane("A4", islamabadSouthAirport, FlightType.LOCAL, 23, 7, "17:00", "12:00");
        Airplane airplane6 = new Airplane("A5", islamabadNorthAirport, FlightType.INTERNATIONAL, 50, 6, "19:00", "1:00");
        Airplane airplane7 = new Airplane("A6", islamabadNorthAirport, FlightType.INTERNATIONAL, 50, 6, "19:00", "1:00");

        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.addFlight(airplane1);
        flightSchedule.addFlight(airplane2);
        flightSchedule.addFlight(airplane3);
        flightSchedule.addFlight(airplane4);
        flightSchedule.addFlight(airplane5);
        flightSchedule.addFlight(airplane6);
        flightSchedule.addFlight(airplane7);

        flightSchedule.displaySchedule();
    }
}












