package core_programming_intermediate.Methods.level1;
import java.util.*;

public class CalculateInterest {
    static int SimpleInterest(int principle,int rate,int time){
        int si=(principle*rate*time)/100;
        return si;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter principle: ");
        int p=sc.nextInt();
        System.out.print("Enter the rate: ");
        int r=sc.nextInt();
        System.out.print("Enter the time: ");
        int t=sc.nextInt();
        System.out.println(SimpleInterest( p, r, t));
        sc.close();
    }

    
}