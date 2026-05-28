package regex;
import java.util.regex.Pattern;
import java.util.regex.*;
public class Example1 {
    public static void main(String[] args) {
        String regex="a";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher = pattern.matcher("ab");
        Matcher matcher1 = pattern.matcher("a");
        boolean matches=matcher.matches();
        boolean matches1=matcher1.matches();
        System.out.println("Result without matched pattern : "+ matches);
        System.out.println("Result with matched Pattern : "+matches1);

    }
}
