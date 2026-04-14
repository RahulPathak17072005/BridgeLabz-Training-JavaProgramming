package core_programming_intermediate.Controlflow.level2;
import java.util.*;
class PowerOfNumber2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number=sc.nextInt();
        System.out.print("Enter the power");
        int power=sc.nextInt();
        int result=1;
        int i=0;
        while(i<power){
            result= result*number;
            i++;
        }
        System.out.println("The result is: "+result);
        sc.close();
    }
    
}