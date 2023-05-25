package LoginAndRegistration;
import java.io.Console;
public class User {
String username;
String password;

public User(String username, String password) {
    this.username = username;
    this.password = password;
}
public boolean verifyPassword(String password) {
    return this.password==password;
}

}