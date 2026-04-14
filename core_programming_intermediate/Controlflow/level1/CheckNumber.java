package core_programming_intermediate.Controlflow.level1;
import java.util.Scanner;
class CheckNumber {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to check : ");
    int n=sc.nextInt();
    System.out.println(n==0 ?"Zero number":(n>0?"positive number":"negative number"));
    sc.close();
}
    
}