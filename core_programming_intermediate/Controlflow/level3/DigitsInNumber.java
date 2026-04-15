package core_programming_intermediate.Controlflow.level3;
import java.util.*;
public class DigitsInNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=sc.nextInt();
        int sum=0;
        while(number>0){
            sum += number%10;
            number=number/10;
        }
        System.out.println("the sum of you your number is: "+sum);
        sc.close();
    }
}