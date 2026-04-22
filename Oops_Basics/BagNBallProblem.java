package Oops_Basics;
import java.util.*;
class BallProblem{
    int totalBalls;
    int whiteBalls;
    BallProblem(int totalBalls,int whiteBalls){
        this.totalBalls = totalBalls;
        this.whiteBalls = whiteBalls;
    }
    public double probability(int draws,int whiteDraws){
        return  (combination(whiteBalls, whiteDraws) *combination(totalBalls - whiteBalls, draws - whiteDraws)) /(double) combination(totalBalls, draws);
    }
    public long combination(int n,int r){
        if(r>n)return 0;
        long result=1;
        for(int i=1;i<r;i++){
            result = result * (n - i + 1) / i;

        }
        return result;

    }

}
public class BagNBallProblem {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the totalBalls: ");
int n=sc.nextInt();
System.out.print("Enter the number of white ball: ");
int w=sc.nextInt();
System.out.print("Enter the number of Balls Drawn: ");
int s=sc.nextInt();
System.out.print("Enter the number of white balls drawn: ");
int k=sc.nextInt();
BallProblem ball=new BallProblem(n, w);
double prob = ball.probability(s, k);
System.out.println("Probability of drawing " + k + " white balls in " + s + " draws = " + prob);

sc.close();
}
    
}
