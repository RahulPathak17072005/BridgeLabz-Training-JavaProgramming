package Oops_Basics;
import java.util.*;
class Line {
    double x1, y1;
    double x2, y2;
    public double getLength() {
        return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
    }
    public void print() {
        System.out.println("Line from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
        System.out.println("Length of line: " + getLength());
    }
}
public class LineComparisonProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Line l1 = new Line();
        System.out.print("Enter x1 for Line 1: ");
        l1.x1 = sc.nextDouble();
        System.out.print("Enter y1 for Line 1: ");
        l1.y1 = sc.nextDouble();
        System.out.print("Enter x2 for Line 1: ");
        l1.x2 = sc.nextDouble();
        System.out.print("Enter y2 for Line 1: ");
        l1.y2 = sc.nextDouble();
        Line l2 = new Line();
        System.out.print("Enter x1 for Line 2: ");
        l2.x1 = sc.nextDouble();
        System.out.print("Enter y1 for Line 2: ");
        l2.y1 = sc.nextDouble();
        System.out.print("Enter x2 for Line 2: ");
        l2.x2 = sc.nextDouble();
        System.out.print("Enter y2 for Line 2: ");
        l2.y2 = sc.nextDouble();
        System.out.println("\n--- Line Details ---");
        l1.print();
        l2.print();
        if (l1.getLength() > l2.getLength()) {
            System.out.println("Line 1 is longer.");
        } else if (l1.getLength() < l2.getLength()) {
            System.out.println("Line 2 is longer.");
        } else {
            System.out.println("Both lines are equal in length.");
        }

        sc.close();
    }
}
