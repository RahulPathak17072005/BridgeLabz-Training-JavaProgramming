package Regex_Basics;
import java.util.regex.*;
public class MetaCharactersExample {
public static void main(String[] args) {
    String regex="\\d\\D";
    Pattern pattern=Pattern.compile(regex);
    String input="7a 8b 99";
    Matcher matcher=pattern.matcher(input);
    while(matcher.find()){
        System.out.println("Matcher Group  --> "+ matcher.group());
    }

}
    
}