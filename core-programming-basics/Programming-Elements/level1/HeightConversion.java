import java.util.Scanner;
public class HeightConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in centimeters: ");
        double centimeters = sc.nextDouble();
        double totalInches = centimeters * 0.393701;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;
        System.out.println(" Height in cm is : " + centimeters + " while in feet is : "+ feet + " and inches is : " + inches);

        sc.close();
    }
}
