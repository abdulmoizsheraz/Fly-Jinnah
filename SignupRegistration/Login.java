import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class Login {
   static boolean checkCredentials(String username, String password) {
        try {
            FileReader fileReader = new FileReader("users.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] userData = line.split(",");

                if (userData.length >= 4) {
                    String storedUsername = userData[2];
                    String storedPassword = userData[3];

                    if (storedUsername.equals(username) && storedPassword.equals(password)) {
                        bufferedReader.close();
                        return true;
                    }
                }
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Login");
        System.out.println("-----------------------");

        System.out.print("Enter your username: ");
        String loginUsername = scanner.nextLine();

        System.out.print("Enter your password: ");
        String loginPassword = scanner.nextLine();

        // Check user credentials
        boolean loggedIn = checkCredentials(loginUsername, loginPassword);

        if (loggedIn) {
            System.out.println("Login successful. Welcome, " + loginUsername + "!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }
}

   

