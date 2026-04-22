package Oops_Basics;
import java.util.Scanner;
class Book {
    private String title;
    private String author;
    private double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Book Title : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : Rs. " + price);
    }
}
public class BookApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();
        System.out.print("Enter Book Price: ");
        double price = sc.nextDouble();
        Book book = new Book(title, author, price);
        System.out.println("\n--- Book Details ---");
        book.displayDetails();
        sc.close();
    }
}

