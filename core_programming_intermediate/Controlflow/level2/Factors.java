 package core_programming_intermediate.Controlflow.level2;
import java.util.*;
class Factors {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the number: ");
    int number=sc.nextInt();
    for(int i=1;i<=number;i++){
        if(number%i==0){
            System.out.print(" The factor is   : "+ i);
        }
    }
sc.close();
}
    
}