package review;
import java.util.*;

public class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utility book = new Utility();
        int choice;
        do {
            System.out.println("\n--- Your Address Book Details is Here  ---");
            System.out.println("1. Add Address ");
            System.out.println("2. View Address ");
            System.out.println("3. Modify Address ");
            System.out.println("4. Save Address ");
            System.out.println("5. Delete Address ");
            System.out.println("6. Exit ");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Number: ");
                    String number = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();

                    AddressBook book1 = new AddressBook(id, name, number, address);
                    book.addAddress(book1);
                    break;

                case 2:
                    book.viewAddress();
                    break;

                case 3:
                    System.out.print("Enter ID to Modify: ");
                    int modifyId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Number: ");
                    String newNumber = sc.nextLine();
                    System.out.print("Enter New Address: ");
                    String newAddress = sc.nextLine();

                    book.modifyAddress(modifyId, newName, newNumber, newAddress);
                    break;

                case 4:
                    book.saveToFile();
                    break;

                case 5:
                    book.deleteInfo();

                case 6:
                    book.saveToFile();
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
