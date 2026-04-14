package core_programming_intermediate.Controlflow.level1;

import java.util.Scanner;
public class NaturalSum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        if(n>0){
            System.out.println("The sum of "+n +"natural number is: "+ n*(n+1)/2); 
        }else{
            System.out.println("Enter the valid Natural Number: ");
        }
        sc.close();
    }
}
