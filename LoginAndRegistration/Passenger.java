package LoginAndRegistration;

public class Passenger extends User {
    String CNIC;
    public Passenger(String username, String password, String CNIC) {
        super(username, password);
     this.CNIC = CNIC;

    }

    // public String getCnic() {
    //     // return cnic;
    // }
}
