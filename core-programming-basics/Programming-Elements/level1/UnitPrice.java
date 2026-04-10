import java.util.Scanner;
public class UnitPrice {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the unit price of the item : ");
        double unitPrice = sc.nextDouble();
        System.out.println("Enter the quantity of the item : ");
        int quantity = sc.nextInt();
        double totalPrice = unitPrice * quantity;
        System.out.println("the total purchase price in INR is : "+ totalPrice + " if the quantity is " + quantity + " and unit price in INR is "+ unitPrice);
        sc.close();
    }
    
}
