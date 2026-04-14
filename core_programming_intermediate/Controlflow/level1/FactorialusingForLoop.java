package core_programming_intermediate.Controlflow.level1;
import java.util.*;
class FactorialusingForLoop {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number");
    int number=sc.nextInt();
    int sum=1;
    for(int i=1;i<=number;i++){
        sum *=i;
    }
    System.out.println("The factorial of the number: "+number + "is: "+sum);
    sc.close();

}
    
}