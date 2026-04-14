package core_programming_intermediate.Controlflow.level2;
import java.util.*;
class GreatestFactor2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number : ");
    int number = sc.nextInt();
    int greatest=1;
    int i=1;
    while(i<number){
        if(number%i==0){
            greatest=Math.max(i,greatest);
        } 
        i++;
    }
    System.out.println("the greatest factor is: "+ greatest);
    sc.close();
}
    
}