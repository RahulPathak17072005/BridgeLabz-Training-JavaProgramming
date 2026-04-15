package core_programming_intermediate.Controlflow.level3;
import java.util.*;
public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your weight: ");
        double weight=sc.nextDouble();
        System.out.print("Enter your height: ");
        double height=sc.nextDouble();
        double BMI=weight / (height * height);
        if(BMI<=18.4)System.out.println("Underweight");
        else if(BMI>=18.5 && BMI<=24.9)System.out.println("Normal");
        else if(BMI>=25.0 && BMI<=39.9)System.out.println("OverWeight");
        else if(BMI>=40.0)System.out.println("Obese");else{
            System.out.println("......DANAV.......");
        }
        sc.close();

    }
}