import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float number1 = sc.nextFloat();
        System.out.print("Enter the second number: ");  
        float number2 = sc.nextFloat();
        System.out.print("Enter the operator (+, -, *, /): ");
        char opr = sc.next().charAt(0);
        switch(opr){
            case '+':
                System.out.println("The sum is : " + (number1 + number2));
                break;
            case '-':
                System.out.println("The difference is : " + (number1 - number2));
                break;
            case '*':
                System.out.println("The product is : " + (number1 * number2));
                break;
            case '/':
                if(number2 != 0){
                    System.out.println("The quotient is : " + (number1 / number2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");

        }
        sc.close();
    }
}
