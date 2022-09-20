import java.util.Date;

public class User {
    String fname,lname,address,email;
    Date dob;
    int userID;

    public User(){

    }
    public User(String fn, String ln, String address, String email, Date dob,int userID){
        this.fname = fn;
        this.lname = ln;
        this.address = address;
        this.email = email ;
        this.dob = dob;
        this.userID = userID;

    }
}
