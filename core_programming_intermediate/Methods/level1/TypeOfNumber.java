package core_programming_intermediate.Methods.level1;
import java.util.*;
public class TypeOfNumber {
private static String Type(int num){
    String s="";
    if(num<0)s="negative";
    else if(num>0)s="positive";
    else if(num==0)s="zero";
    else{
        s="Invalid input";
    }
    return s;

}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num=sc.nextInt();
    System.out.println(Type(num));
    sc.close();
}

    
}