package library_management2;
import java.util.List;
import java.util.ArrayList;

public class Main_Library {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to library
        Book book1 = new Book("A Tale of Two Cities", "Charles Dickens", 1859, 308, "Historical Fiction", false);
        Book book2 = new Book("And Then There Were None", "Agatha Christie", 1939, 272, "Mystery", false);
        Book book3 = new Book("The Hobbit", "J. R. R. Tolkien", 1937, 310, "Fantasy", false);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create users
        User user1 = new User("John Doe", 12345, new ArrayList<>());
        User user2 = new User("Jane Smith", 54321, new ArrayList<>());
        User user3 = new User("Mike Johnson", 98765, new ArrayList<>());

        // User 1 borrows a book
        user1.borrowBooks(book1);
        System.out.println(user1.getName() + " borrowed " + book1.getTitle());

        // User 2 borrows a book
        user2.borrowBooks(book2);
        System.out.println(user2.getName() + " borrowed " + book2.getTitle());

        // User 3 borrows a book
        user3.borrowBooks(book3);
        System.out.println(user3.getName() + " borrowed " + book3.getTitle());

        // User 1 returns a book
        user1.returnBooks(book1);
        System.out.println(user1.getName() + " returned " + book1.getTitle());


        // Return a book
        user3.returnBooks(book3);
        System.out.println(user3.getName() + " returned " + book3.getTitle());

        // Find books by author
        List<Book> booksByAuthor = library.findBooksByAuthor("Charles Dickens");
        System.out.println("Books by Charles Dickens:");
        for (Book book : booksByAuthor) {
            System.out.println(book.getTitle());
        }

        // Find books published in a specific year
        int year = 1939;
        List<Book> booksByYear = library.findBooksByPublicationYear(year);
        System.out.println("Books published in " + year + ":");
        for (Book book : booksByYear) {
            System.out.println(book.getTitle());
        }

        // Find book with most pages
        Book bookWithMostPages = library.findBookWithMostPages();
        System.out.println("Book with most pages: " + bookWithMostPages.getTitle());

        // Find all books in a specific category
        String category = "Mystery";
        List<Book> booksByCategory = library.getBooksByCategory(category);
        System.out.println("Books in category " + category + ":");
        for (Book book : booksByCategory) {
            System.out.println(book.getTitle());
        }

        // Get all book titles sorted alphabetically
        List<String> allBookTitlesSorted = library.getAllBookTitlesSorted();
        System.out.println("All book titles sorted:");
        for (String title : allBookTitlesSorted) {
            System.out.println(title);
        }
    }
}

