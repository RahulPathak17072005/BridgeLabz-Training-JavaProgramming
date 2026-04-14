package core_programming_intermediate.Controlflow.level2;
import java.util.*;
class Multiple {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n=sc.nextInt();
    for(int i=6;i<=9;i++){
        System.out.println(n+ " * "+i + " = "+ n*i);
    }
    sc.close();
}
    
}