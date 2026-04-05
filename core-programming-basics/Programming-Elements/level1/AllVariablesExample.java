import java.util.Scanner;
public class AllVariablesExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=10;// fixed value
        int b=20;// fixed value
        System.out.println("Enter the  first value :");
        int input1=sc.nextInt();// user input1
        System.out.println("Enter the  second value :");
        int input2=sc.nextInt();// user input2
        int sum=a+b+input1+input2; // sum of all the values
        System.out.println("The sum of all the values is :"+sum);
        int product=a*b*input1*input2; // product of all the values
        System.out.println("The product of all the values is :"+product);   
        System.out.println("Fixed Values :"+ a +"," + b);
        System.out.println("User Inputs: " + input1 + ", " + input2);
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        sc.close();
    }
}