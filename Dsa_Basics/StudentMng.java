package Dsa_Basics;
import java.util.*;

public class StudentMng{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> studentDB = new HashMap<>();
        studentDB.put(101, "Rahul");
        studentDB.put(102, "Priya");
        studentDB.put(103, "Amit");
        HashMap<String, String> phoneDirectory = new HashMap<>();
        phoneDirectory.put("Rahul", "9876543210");
        phoneDirectory.put("Priya", "9123456789");
        phoneDirectory.put("Amit", "9988776655");
        while (true) {
            System.out.println("\n--- HashMap Applications ---");
            System.out.println("1. Student Database");
            System.out.println("2. Word Frequency Counter");
            System.out.println("3. Phone Directory");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.println("\n--- Student Database ---");
                    System.out.println("Students: " + studentDB);
                    System.out.print("Enter roll number to search: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    if (studentDB.containsKey(roll)) {
                        System.out.println("Student Found: " + studentDB.get(roll));
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Word Frequency Counter ---");
                    System.out.print("Enter a sentence: ");
                    String sentence = sc.nextLine().toLowerCase();
                    String[] words = sentence.split("\\s+");
                    HashMap<String, Integer> wordCount = new HashMap<>();
                    for (String w : words) {
                        wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
                    }
                    System.out.println("Word Frequencies: " + wordCount);
                    break;

                case 3:
                    System.out.println("\n--- Phone Directory ---");
                    System.out.print("Enter name to search: ");
                    String name = sc.nextLine();
                    if (phoneDirectory.containsKey(name)) {
                        System.out.println("Phone Number: " + phoneDirectory.get(name));
                    } else {
                        System.out.println("Name not found!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
