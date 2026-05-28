package regex;
import java.util.regex.*;
import java.util.regex.Pattern;

public class PasswordValidation {

    public static void main(String[] args) {
        String regex="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        Pattern pattern = Pattern.compile(regex);

    }
}
