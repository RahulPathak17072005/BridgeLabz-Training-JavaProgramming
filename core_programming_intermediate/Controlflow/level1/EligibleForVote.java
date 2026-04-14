package core_programming_intermediate.Controlflow.level1;
import java.util.Scanner;
public class EligibleForVote {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age=sc.nextInt();
        System.out.println(age >= 18 ? "Eligible for vote" : "Not Eligible for vote");
        sc.close();
    }
}