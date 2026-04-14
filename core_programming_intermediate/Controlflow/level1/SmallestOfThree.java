package core_programming_intermediate.Controlflow.level1;
import java.util.Scanner;
public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1=sc.nextInt();
        System.out.print("Enter the Second number: ");
        int number2=sc.nextInt();
        System.out.print("Enter the third number: ");
        int number3=sc.nextInt();
        boolean isMax= number1<=number2&&number1<=number3;
        System.out.println("is the first number smallest among 3: "+ isMax);
        sc.close();

    }
}
