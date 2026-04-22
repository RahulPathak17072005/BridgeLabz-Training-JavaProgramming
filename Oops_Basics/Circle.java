package Oops_Basics;
import java.util.*;
public class Circle {
    double radius;
    double area;
    public double getArea(){
        return (3.14)*(radius*radius);
    }
    public void print(){
        System.out.println("Your calculated Area of circle is : "+getArea());
    }
}
    class Area{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Circle c=new Circle();
            System.out.print("Enter the radius of Circle: ");
            c.radius=sc.nextDouble();
            c.print();
            sc.close();
        }
    }

