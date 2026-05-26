package Exception_Basics;
//import java.util.Exception;
import java.util.*;
public class InputValidation extends Exception {
    public InputValidation(String message){
        super(message);
    }
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            if (age < 0 || age > 120) {
                throw new InputValidation("Age must be between 0 and 120!");
            }
            System.out.println("Valid age entered: " + age);
        } catch (InputValidation e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
    
}




