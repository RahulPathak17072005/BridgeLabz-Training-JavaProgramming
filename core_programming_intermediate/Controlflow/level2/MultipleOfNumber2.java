package core_programming_intermediate.Controlflow.level2;
import java.util.*;
class MultipleOfNumber {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int number= sc.nextInt();
    if(number<=100){
        int i=100;
        while(i>=1){
            if(number%i==0){
                System.out.println("The multiple of the "+ number + " is "+ i);
            }
            i--;
        }
    }else{
        System.out.println("Invalid number: 1 to 100 ");
    }
    sc.close();

}
    
}