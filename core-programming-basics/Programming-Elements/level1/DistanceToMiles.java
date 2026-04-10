import java.util.*;
public class DistanceToMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the distance in kilometers: ");
        double distance= sc.nextDouble();
        double miles = distance * 1.6;
        System.out.println("The distance in miles is : " + miles);
        sc.close();
    }
}