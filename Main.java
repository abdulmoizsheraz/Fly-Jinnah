import java.util.Scanner;

import flights_schedule.FlightSchedule;

public class Main {
    private static boolean loggedInUser;

    static void ShowMenu(String loggedInUser) {
        System.out.println("\n-----------Fly Jinnah Airline Systems------------");
        System.out.println("Welcome, " + loggedInUser + "!");
        System.out.println("1. View flights");
        System.out.println("2. Book a flight");
        System.out.println("3. Cancel a booking");
        System.out.println("4. Logout");
        System.out.print("Enter your choice: ");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            if (loggedInUser == false) {
                System.out.println("===== Welcome to Fly Jinnah =====");
                System.out.println("1. Login");
                System.out.println("2. Sign up");
                System.out.println("3. Exit");
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
            //  ViewFlights
                break;
                case 2:
                // bookFlight();
                break;
                case 3:
                // cancelBooking();
                break;
                case 4:
                // loggedInUser = null;
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
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } 
        }
    
    }}
