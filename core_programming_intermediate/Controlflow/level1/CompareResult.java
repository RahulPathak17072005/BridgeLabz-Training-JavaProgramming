package core_programming_intermediate.Controlflow.level1;
import java.util.*;
class CompareResult {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the natural number: ");
    int n=sc.nextInt();
    int result=n*(n+1)/2;
    int sum=0;
    int i=1;
    while(i<=n){
        sum +=i;
        i++;

    }
    System.out.println("result using Formula : "+ result + " Result Using while loop : "+ sum +" and the difference between both = " + (result-sum));
    sc.close();

}
    
}