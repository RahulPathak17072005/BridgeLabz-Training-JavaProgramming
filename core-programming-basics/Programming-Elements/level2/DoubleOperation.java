import java.util.Scanner;
public class DoubleOperation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        double a=sc.nextDouble();
        System.out.print("Enter the second Number : ");
        double b=sc.nextDouble();
        System.out.print("Enter the third number : ");
        double c=sc.nextDouble();
         System.out.println("a + b * c = " + (a + b * c));
        System.out.println("a * b + c = " + (a * b + c));
        System.out.println("c + a / b = " + (c + a / b));
        System.out.println("a % b + c = " + (a % b + c));
        sc.close();
    }
}
