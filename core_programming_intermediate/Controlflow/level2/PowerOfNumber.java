package core_programming_intermediate.Controlflow.level2;
import java.util.*;
class PowerOfNumber {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=sc.nextInt();
        System.out.print("Enter the power");
        int power=sc.nextInt();
        int result=1;
        for(int i=1;i<=power;i++){
            result= number*i;
        }
        System.out.println("The result is: "+result);
    }
    
}