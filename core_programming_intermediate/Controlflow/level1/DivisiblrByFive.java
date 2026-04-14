package core_programming_intermediate.Controlflow.level1;
import java.util.Scanner;
public class DivisiblrByFive {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int n = sc.nextInt();

        boolean isDivisible = (n % 5 == 0);  // simplified

        System.out.println("Is the number " + n + " divisible by 5? " + isDivisible);

        sc.close();
    }
}
