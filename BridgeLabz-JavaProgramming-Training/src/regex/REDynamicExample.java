package regex;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.*;
public class REDynamicExample {
    public static void checkStringAgainstRE(String re,String str){
        Pattern pattern=Pattern.compile(re);
       Matcher matcher= pattern.matcher(str);
       boolean matches= matcher.matches();
        System.out.println(matches);
    }



    public static void main(String[] args) {
        while(true){
            System.out.println("Enter the Regular Expression: ");
            Scanner sc=new Scanner(System.in);
            String re=sc.nextLine();
            System.out.println("Enter the String: ");
            String str=sc.nextLine();
            checkStringAgainstRE(re,str);
            System.out.println("If you want to exit [Y/N]");
            String choice=sc.nextLine();
            if(choice.equalsIgnoreCase("Y")){
                System.out.println("===========Thanks for using our program==========");
break;
            }
        }

    }
}
