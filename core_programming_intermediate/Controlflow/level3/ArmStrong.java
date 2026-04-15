package core_programming_intermediate.Controlflow.level3;
import java.util.*;
public class ArmStrong {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter the Number: ");
        int number=sc.nextInt();
        int original=number;
        int sum=0;
        int digits = String.valueOf(number).length();
        
       while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

        sc.close();
    }
}