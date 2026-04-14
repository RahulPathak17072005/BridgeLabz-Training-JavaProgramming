package core_programming_intermediate.Controlflow.level3;
import java.util.*;
class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year=sc.nextInt();
        boolean isLeap=(year%4==0)&&(year%100==0&&year%400==0);
        System.out.println(isLeap?"The year you enter is Leap year":"The year you enterd is not leap year ");
        sc.close();
    }
    
}