package review;
import java.util.Scanner;
public class StudentManagement {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter your name : ");
    String name=sc.nextLine();

    System.out.print("Enter your roll no.: ");
    int roll=sc.nextInt();
    sc.nextLine();

    System.out.print("Enter how many  number of Subjects: ");
    int n=sc.nextInt();
    sc.nextLine();
    String[] subjects=new String[n];
    String[] subjectGrade=new String[n];
    int[] marks=new int[n];
    int total=0;
    for(int i=0;i<n;i++){
        System.out.print("Enter subject "+(i+1 )+ " : ");
        subjects[i]=sc.nextLine();

        System.out.print("Enter the marks for"+ subjects[i]+" : ");
        marks[i]=sc.nextInt();
        sc.nextLine();
        total +=marks[i];
        if(marks[i]<34)subjectGrade[i]="Fail";
        else if(marks[i]>=90)subjectGrade[i]="A+";
        else if(marks[i]>=75)subjectGrade[i]="A";
        else if(marks[i]>=60)subjectGrade[i]="B+";
        else{
            subjectGrade[i]="B";
        }



    }
    String Overallgrade;
    double percent=(double ) total/n;
    if(percent<34)Overallgrade= "fail grade F";
    else if(percent>=90)Overallgrade="A+";
    else if(percent>=75)Overallgrade="A";
    else if(percent>=60)Overallgrade="B+";else{
        Overallgrade="B";
    }
    System.out.println("/n----- Student report ---------------");
    System.out.println("Name: "+ name);
    System.out.println("Roll no: " + roll);
    System.out.println("Subjects and marks: ");
    for(int i=0;i<n;i++){
        System.out.println(" Subject : "+i+" "+subjects[i]+" Marks : "+ marks[i]+ " -> "+ subjectGrade[i]);

    }
    System.out.println("Total Marks: "+ total);
    System.out.println("Your Percentage "+ percent + " % " );
    System.out.println("Your Grade : "+ Overallgrade );
    sc.close();
}
    
}
