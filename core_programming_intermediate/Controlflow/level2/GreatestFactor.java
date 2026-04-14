package core_programming_intermediate.Controlflow.level2;
import java.util.*;
class GreatestFactor {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number : ");
    int number = sc.nextInt();
    int greatest=1;
    for(int i=1;i<number;i++){
        if(number%i==0){
            greatest=Math.max(i,greatest);
        } 
    }
    System.out.println("the greatest factor is: "+ greatest);
    sc.close();
}
    
}