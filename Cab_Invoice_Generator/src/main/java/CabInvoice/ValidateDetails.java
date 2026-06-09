package CabInvoice;

public class ValidateDetails {


    public boolean ValidationEmail(String email) {
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }
    public boolean ValidationPhone(String phone) {
        return phone.matches("[6-9][0-9]{9}");
    }
    public boolean ValidationPassword(String password){
        return password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
    }

}
