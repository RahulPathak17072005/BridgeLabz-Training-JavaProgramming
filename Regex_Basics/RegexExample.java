package Regex_Basics;
import java.util.regex.*;
public class RegexExample {
public static void main(String[] args) {
    String regex="\\d{3}";
    Pattern pattern=Pattern.compile(regex);
    String Input="The number is 123 and code is 456.";
    Matcher matcher=pattern.matcher(Input);
while(matcher.find()){
    System.out.println("Matched Pattern : "+matcher.group());
}
}
    
}