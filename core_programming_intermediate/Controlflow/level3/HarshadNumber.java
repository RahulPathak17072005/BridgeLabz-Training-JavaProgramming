package core_programming_intermediate.Controlflow.level3;
import java.util.*;
public class HarshadNumber {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int number=sc.nextInt();
    int original=number;
    int sum=0;
    while(number>0){
        sum +=number%10;
        number=number/10;
    }
    if(original%sum==0)System.out.println("Harshad number: ");else{
        System.out.println("No Its Not the Harshad Number ");
    }
    sc.close();
}
}