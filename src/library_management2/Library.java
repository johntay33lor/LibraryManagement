package library_management2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;



public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> findBooksByPublicationYear (int year) {
        return books.stream()
                .filter(book -> book.getPublicationYear() == year)
                .collect(Collectors.toList());
    }

    public List<Book> findBooksByAuthor (String author) {
        Predicate<Book> byAuthor = book -> book.getAuthor().equals(author);
        return filterBooks(byAuthor);
    }

    private List<Book> filterBooks(Predicate<Book> byAuthor) {
        return books.stream()
                .filter(byAuthor)
                .collect(Collectors.toList());
    }

    public List<Book> findBooksByPages(int minPages) {
        return books.stream()
                .filter(book -> book.getPages() > minPages)
                .collect(Collectors.toList());
    }

    public Book findBookWithMostPages() {
        return books.stream()
                .max(Comparator.comparingInt(Book::getPages))
                .orElse(null);
    }


    public List<Book> getBooksByCategory (String category) {
        return books.stream()
                .filter(book -> book.getCategory().equals(category))
                .collect(Collectors.toList());
    }

    public List<String> getAllBookTitlesSorted() {
        return books.stream()
                .map(Book::getTitle)
                .sorted()
                .collect(Collectors.toList());
    }
}
