package core_programming_intermediate.Methods.level1;

import java.util.Scanner;
public class Handshak {

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;   // combination formula
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        int maxHandshakes = calculateHandshakes(numberOfStudents);

        System.out.println("Maximum number of possible handshakes = " + maxHandshakes);

        sc.close();
    }
}