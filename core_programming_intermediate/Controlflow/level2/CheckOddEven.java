package core_programming_intermediate.Controlflow.level2;
import java.util.Scanner;
class CheckOddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int number=sc.nextInt();
        for(int i=0;i<number;i++){
            System.out.println(i%2==0?"The even numbers are: "+i:"The odd numbers are : "+i);
        }
        sc.close();
    }
}
                