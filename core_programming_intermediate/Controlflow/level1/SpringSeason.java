package core_programming_intermediate.Controlflow.level1;
import java.util.Scanner;
import java.time .LocalDate;
class SpringSeason {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the Day: ");
    int day=sc.nextInt();
    System.out.print("Enter the Month: ");
    int month=sc.nextInt();
    // boolean isSpring=(date>=20 && month>=3) || (date<=31 && month<=6);
     LocalDate date = LocalDate.of(2026, month, day); // year, month, day

        LocalDate springStart = LocalDate.of(date.getYear(), 3, 20);
        LocalDate springEnd = LocalDate.of(date.getYear(), 6, 20);

        boolean isSpring = !date.isBefore(springStart) && !date.isAfter(springEnd);
        if(isSpring)System.out.println("Yeah! Its Spring Season");else{
            System.out.println("oops! no spring month");
        }
        sc.close();

}
    
}