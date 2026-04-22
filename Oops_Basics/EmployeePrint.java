package Oops_Basics;
import java.util.*;
class Employee{
    public static void main(String[] args) {
        EmployeePrint E=new EmployeePrint();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name: ");
        E.name=sc.next();
        System.out.print("Enter your id: ");
        E.id=sc.nextInt();
        System.out.println("Enter your Salary: ");
        E.salary=sc.nextDouble();
        E.print();
        sc.close();
    }
}
public class EmployeePrint {

    String name;
    int id;
    double salary;
    public  void print(){
        System.out.println(" name: "+name+" id: "+id + " salary :"+salary);
    }
}
