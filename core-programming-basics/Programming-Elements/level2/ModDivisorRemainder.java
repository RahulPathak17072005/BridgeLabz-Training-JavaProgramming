//programming-basics.Programming-Elements.level2;

import java.util.Scanner;
class ModDivisorRemainder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int number1= sc.nextInt();
        System.out.print("Enter the second Number : ");
        int number2= sc.nextInt();
        int Quotient = number1 / number2;
        int Remainder = number1 % number2;
        System.out.println(" The Quotient is : "+ Quotient + " and Reminder is : " + Remainder + " of two number " + number1 + " and " + number2);
        sc.close();
        
    }
}
