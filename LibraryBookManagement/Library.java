package LibraryBookManagement;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private static Library libraryInstance;
    private List<Book> books=new ArrayList<>();
    private List<Observer> observers=new ArrayList<>();

    private Library() {
       System.out.println("Constructor called");
    }
    public static synchronized Library getInstance() {

        if (libraryInstance == null) {
            libraryInstance = new Library();
        }

        return libraryInstance;
    }
    public void addBook(Book book) {

        books.add(book);

        notifyObservers(book.getTitle());
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String bookName) {

        for (Observer observer : observers) {
            observer.update("New Book Available : " + bookName);
        }
    }

    public void displayBooks() {

        System.out.println("Library Books");

        for (Book book : books) {

            System.out.println("Title : " + book.getTitle());
            System.out.println("Author : " + book.getAuthor());
            System.out.println("Edition : " + book.getEdition());
            System.out.println("Genre : "+book.getGenre());
        }
    }
}