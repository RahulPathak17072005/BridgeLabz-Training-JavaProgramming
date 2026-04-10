import java.util.Scanner;
public class PerimeterOfSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the side of the square ");
        double side = sc.nextDouble();
        double perimeterOfSquare = 4 * side;
        System.out.println("The Length of the side " + side + " whose parameter is " + perimeterOfSquare);
        sc.close();
    }
}
