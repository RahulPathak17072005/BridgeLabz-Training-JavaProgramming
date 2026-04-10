import java.util.Scanner;
public class MaxHandShakes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the number of Students ");
        int numberOfStudents = sc.nextInt();
        int maxHandShakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of handshakes that can occur among " + numberOfStudents + " students is : " + maxHandShakes);
        sc.close();
        
    }
    
}
