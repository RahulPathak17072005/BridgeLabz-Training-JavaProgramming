import java.util.Scanner;
public class UniversityDiscount {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the original fee: ");
        double originalFee = sc.nextDouble();   
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = sc.nextDouble();

    double discount= (originalFee * discountPercentage) / 100.0;
    double finalFee =  originalFee - discount;
    System.out.println(
        " The discount amount is INR"+ discount + " and final discounted fee is INR " +finalFee
    );
    sc.close();
    }
}
