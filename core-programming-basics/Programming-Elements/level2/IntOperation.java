import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int a=sc.nextInt();
        System.out.print("Enter the second Number : ");
        int b=sc.nextInt();
        System.out.print("Enter the third number : ");
        int c=sc.nextInt();
         System.out.println("a + b * c = " + (a + b * c));
        System.out.println("a * b + c = " + (a * b + c));
        System.out.println("c + a / b = " + (c + a / b));
        System.out.println("a % b + c = " + (a % b + c));
        sc.close();
    }
}
