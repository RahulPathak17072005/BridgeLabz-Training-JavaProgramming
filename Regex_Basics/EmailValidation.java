package Regex_Basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.util.regex.*;
public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String regex="^[a-zA-Z0-9$_.]+@[a-zA-Z0-9_]+\\.[a-zA-Z]{2,}$";
        Pattern pattern=Pattern.compile(regex);
        System.out.println("Enter email address: -->  ");
        String input=sc.nextLine();
        Matcher matcher = pattern.matcher(input);

        boolean matches=matcher.matches();

        System.out.println("you are putting the :->" +matches+" Email address : "+input);

    }
}
