import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Signup {
    public Signup (String name,String email,String username,String password) {

        System.out.println("Signup and Registration Program");
        System.out.println("-------------------------------");

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
    public static void main(String[] args) {
        Signup u1=new Signup("moiz","moiz77131@gmail.com","moiz77131","1234?");
    }
}
