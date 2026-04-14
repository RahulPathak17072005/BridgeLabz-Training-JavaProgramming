package core_programming_intermediate.Controlflow.level2;

import java.util.*;

class ThreeFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entering their heights
        System.out.print("Amar's height: ");
        double h1 = sc.nextDouble();
        System.out.print("Akbar's height: ");
        double h2 = sc.nextDouble();
        System.out.print("Anthony's height: ");
        double h3 = sc.nextDouble();

        // Entering their ages
        System.out.print("Amar's Age: ");
        int A1 = sc.nextInt();
        System.out.print("Akbar's Age: ");
        int A2 = sc.nextInt();
        System.out.print("Anthony's Age: ");
        int A3 = sc.nextInt();

        // Find youngest
        if (A1 < A2 && A1 < A3) {
            System.out.println("Amar is the youngest (" + A1 + " years old).");
        } else if (A2 < A1 && A2 < A3) {
            System.out.println("Akbar is the youngest (" + A2 + " years old).");
        } else if (A3 < A1 && A3 < A2) {
            System.out.println("Anthony is the youngest (" + A3 + " years old).");
        } else {
            System.out.println("There is a tie in ages.");
        }

        // Find tallest
        if (h1 > h2 && h1 > h3) {
            System.out.println("Amar is the tallest (" + h1 + " units).");
        } else if (h2 > h1 && h2 > h3) {
            System.out.println("Akbar is the tallest (" + h2 + " units).");
        } else if (h3 > h1 && h3 > h2) {
            System.out.println("Anthony is the tallest (" + h3 + " units).");
        } else {
            System.out.println("There is a tie in heights.");
        }

        sc.close();
    }
}
