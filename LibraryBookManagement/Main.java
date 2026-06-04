package LibraryBookManagement;

public class Main {

    public static void main(String[] args) {

        Library library = Library.getInstance();
        Library library2=Library.getInstance();
        System.out.println(library.hashCode()==library2.hashCode());

        User student = UserFactory.createUser("student", "Rahul");
        User faculty = UserFactory.createUser("faculty", "Amit");
        User librarian = UserFactory.createUser("librarian", "Rakesh");

        student.showRole();
        faculty.showRole();
        librarian.showRole();

        library.addObserver(student);
        library.addObserver(faculty);
        library.addObserver(librarian);

        Book book1 = new Book.BookBuilder("Rich and Poor").setAuthor("xyz").setEdition("1st").setGenre("Fiction").build();
        //System.out.println(book1);
        Book book2 = new Book.BookBuilder("Concept of Concepts")
    .setAuthor("Rakesh").setEdition("2nd")
                .build();

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();
    }
}