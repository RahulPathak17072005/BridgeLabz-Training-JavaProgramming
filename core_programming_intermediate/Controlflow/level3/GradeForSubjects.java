package core_programming_intermediate.Controlflow.level3;
import java.util.*;
class GradeForSubjects {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks of the Chemistry out of 100 : ");
        int Chemistry=sc.nextInt();
        System.out.print("Enter the marks of the Physics out of 100 : ");
        int Physics=sc.nextInt();
        System.out.print("Enter the marks of the Maths out of 100 : ");
        int Maths=sc.nextInt();
        int total=Chemistry+Physics+Maths;
        double  percentage = total/3.0;
        System.out.println("Average Marks: " + percentage + "%");

        // Determine grade and remarks
        if (percentage >= 80) {
            System.out.println("Grade: A");
            System.out.println("Remarks: Level 4, above agency-normalized standards");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
            System.out.println("Remarks: Level 3, at agency-normalized standards");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
            System.out.println("Remarks: Level 2, below, but approaching agency-normalized standards");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
            System.out.println("Remarks: Level 1, well below agency-normalized standards");
        } else if (percentage >= 40) {
            System.out.println("Grade: E");
            System.out.println("Remarks: Level 1-, too below agency-normalized standards");
        } else {
            System.out.println("Grade: R");
            System.out.println("Remarks: Remedial standards");
        }

        sc.close();


    }
    
}