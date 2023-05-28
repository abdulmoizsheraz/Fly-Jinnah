import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Signup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Signup and Registration Program");
        System.out.println("-------------------------------");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Create a comma-separated string of user data
        String userData = name + "," + email + "," + username + "," + password;

        // Write user data to CSV file
        try {
            FileWriter writer = new FileWriter("users.csv", true); // "true" for append mode
            writer.write(userData);
            writer.write("\n"); // Add a new line after each user
            writer.close();
            System.out.println("Registration successful. User data saved to users.csv");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
