import java.util.*;
public class GuessingApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter you target: ");
     int secretNumber = (int)(Math.random() * 100) + 1;
     int guess=0;
     int attempt=0;
     System.out.println("***************🤞 Welcome to this game Arena: 🤞**************");
     System.out.println("I choose A one Random Number Between 1 to 100🤔💭");
     System.out.println("Try to Guess it🙋‍♂️");
     while(guess!=secretNumber){
        System.out.print("Enter your Guess🤔🤔:- ");
        guess=sc.nextInt();
        attempt++;
        if(guess<secretNumber){
            System.out.println("Too low : Guess more high elle: 😂");
        }else if(guess>secretNumber)System.out.println("Too high : guess low elle: 😒 ");else{
            System.out.println("Congratulations you did it wow😲😲😲:  you played like Magician in " +attempt+ " Try again to better: ");
        }
     }
sc.close();
    }


}