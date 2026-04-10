import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base of the triangle in cm: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the triangle in cm: ");
        double height = sc.nextDouble();
        double areaInCm  = 0.5 * base * height;
        double areaInInches = areaInCm * 0.155;
        double areaInFeet = areaInInches / 144;
        System.out.println(" The Area in square cm is " + areaInCm + " while AreaInfeet is " + areaInFeet + " and in inches Is "+ areaInInches);
        sc.close();

    }
}
