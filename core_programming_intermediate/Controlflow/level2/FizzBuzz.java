package core_programming_intermediate.Controlflow.level2;
import java.util.*;

class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = sc.nextInt();

        if (number > 0) {
            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Negative number");
        }

        sc.close();
    }
}
