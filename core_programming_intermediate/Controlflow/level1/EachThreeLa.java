package core_programming_intermediate.Controlflow.level1;
import java.util.Scanner;
public class EachThreeLa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1=sc.nextInt();
        System.out.print("Enter the Second number: ");
        int number2=sc.nextInt();
        System.out.print("Enter the third number: ");
        int number3=sc.nextInt();
        boolean isMax1= number1>=number2&&number1>=number3;
         boolean isMax2= number2>=number1&&number2>=number3;
          boolean isMax3= number3>=number2&&number3>=number1;
        System.out.println("is the first number largest among 3: "+ isMax1);
        System.out.println("is the second number largest among 3: "+ isMax2);
        System.out.println("is the third number largest among 3: "+ isMax3);
        sc.close();

    }
}
