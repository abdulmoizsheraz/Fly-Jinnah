import java.util.Scanner;

import flights_schedule.FlightSchedule;
import Booking.Booking;
public class Main {
    private static boolean loggedInUser;

    static void ShowMenu(String loggedInUser) {
        System.out.println("\n___________________________Fly Jinnah Airline Systems___________________________");
        System.out.println("Welcome, " + loggedInUser + "!");
        System.out.println("1. View  Available flights");
        System.out.println("2. Book a flight");
        System.out.println("3. Cancel a booking");
        System.out.println("4. Search for Flights");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            if (loggedInUser == false) {
                System.out.println("___________________________ Thanks for Landing on Fly Jinnah Systems____________________");
                System.out.println("1. Login");
                System.out.println("2. Sign up");
                System.out.println("3.View Available Flights");
                System.out.println("4. Search for Availble Flights");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter your username: ");
                        scanner.nextLine(); // Consume the newline character
                        String loginUsername = scanner.nextLine();
                        System.out.print("Enter your password: ");
                        String loginPassword = scanner.nextLine();
                        Login u1 = new Login();
                        boolean loggedInUser = u1.checkCredentials(loginUsername, loginPassword);
                        if (loggedInUser) {
                            ShowMenu(loginUsername);
                               choice = scanner.nextInt();
                switch (choice) {
                case 1:
            FlightSchedule f1=new FlightSchedule();
        f1.displaySchedule();
                break;
                case 2:
              Booking b1=new Booking("A3","ISLAMABAD");
                break;
                case 3:
                // cancelBooking();
                break;
                case 4:
                System.out.println("Enter the City Name for which you want to Search");
                String city=scanner.next();
                FlightSchedule fS=new FlightSchedule();
           fS.printAvailableFlights(city);
                break;
                default:
                System.out.println("Invalid choice. Please try again.");
                            exit=true;
                            break;
                        }} else {
                            System.out.println("Invalid username or password. Please try again.");
                        }
                        break;
                    case 2:
                        System.out.print("Enter your name: ");
                        scanner.nextLine(); // Consume the newline character
                        String name = scanner.nextLine();

                        System.out.print("Enter your email: ");
                        String email = scanner.nextLine();

                        System.out.print("Enter your username: ");
                        String username = scanner.nextLine();

                        System.out.print("Enter your password: ");
                        String password = scanner.nextLine();
                        Signup user = new Signup(name, email, username, password);
                        break;
                        case 3:
     FlightSchedule f2=new FlightSchedule();
        f2.displaySchedule();
                        break;
                        case 4:
  System.out.println("Enter the City Name for which you want to Search");
                String city=scanner.next();
                FlightSchedule fS1=new FlightSchedule();
           fS1.printAvailableFlights(city);
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } 
        }
    
    }}
