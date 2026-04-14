package core_programming_intermediate.Controlflow.level1;
import java.util.*;

class Factorial {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num=sc.nextInt();
    int i=1;
    int ans=1;
    while(i<=num){
        ans *=i;
        i++;
    }
    System.out.println(ans);
    sc.close();
    
}
    
}