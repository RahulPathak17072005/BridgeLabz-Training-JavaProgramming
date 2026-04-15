package core_programming_intermediate.Methods.level1;
import java.util.*;
public class TrinagularTrack {
public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;  
        double distance = 5000;           
        return distance / perimeter;              
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();
        double rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to finish 5 km run.");
        sc.close();
    }
}