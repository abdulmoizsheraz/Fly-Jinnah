import java.util.Scanner;

public class Main {
    private static String loggedInUser = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            if (loggedInUser == null) {
                System.out.println("===== Welcome to Fly Jinnah =====");
                System.out.println("1. Login");
                System.out.println("2. Sign up");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Will implement it");
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
            } else {
                System.out.println("\n===== Airline Management System =====");
                System.out.println("Welcome, " + loggedInUser + "!");
                System.out.println("1. View flights");
                System.out.println("2. Book a flight");
                System.out.println("3. Cancel a booking");
                System.out.println("4. Logout");
                System.out.print("Enter your choice: ");

                // int choice = scanner.nextInt();
                // switch (choice) {
                //     case 1:
                //         // viewFlights();
                //         break;
                //     case 2:
                //         // bookFlight();
                //         break;
                //     case 3:
                //         // cancelBooking();
                //         break;
                //     case 4:
                //         loggedInUser = null;
                //         break;
                //     default:
                //         System.out.println("Invalid choice. Please try again.");

                }
            }
        }
    }


