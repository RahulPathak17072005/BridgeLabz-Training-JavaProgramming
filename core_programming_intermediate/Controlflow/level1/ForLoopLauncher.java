 package core_programming_intermediate.Controlflow.level1;
import java.util.Scanner;
class RocketLauncher {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter  the counter value countDown Start - ");
    int counter=sc.nextInt();
   for(int i=counter;i>1;i--){
        counter=counter-1;
        System.out.println("tick-tick "+counter);
    }
    sc.close();
}
    
}