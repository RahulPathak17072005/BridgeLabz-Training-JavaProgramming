package core_programming_intermediate.Controlflow.level1;
import java.util.*;
class UntilZero {
    public static void main(String[] args) {
        
        double total= 0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        double number=sc.nextDouble();
        while(number !=0){
            total += number;
                System.out.println("Current total: " + total);
                System.out.print("Enter another number (0 to stop): ");
                number = sc.nextDouble(); 
        }
        System.out.println("Final total sum = " + total);
        sc.close();
    }
    
}