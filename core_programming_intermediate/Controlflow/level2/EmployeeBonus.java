package core_programming_intermediate.Controlflow.level2;
import java.util.*;
class EmployeeBonus {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the salary of yours : ");
    double salary=sc.nextDouble();
    System.out.print("Enter your serving years : ");
    int experience=sc.nextInt();
        if (experience > 5) {
            double bonus = salary * 0.05;
            System.out.println("Your Bonus Amount is: " + bonus);
        } else {
            System.out.println("No bonus awarded (service must be more than 5 years).");
        }

        sc.close();
}
}