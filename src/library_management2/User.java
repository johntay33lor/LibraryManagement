package library_management2;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class User {
    private String name;
    private int cardNumber;
    private List<Book> booksLoanedOut;
    private LocalDate dueDate;

    public User(String name, int cardNumber, List<Book> bookLoanedOut) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.booksLoanedOut = bookLoanedOut;
        this.dueDate = null;
    }

    public String getName() {
        return name;
    }


    public void borrowBooks (Book book) {
        booksLoanedOut.add(book);
        book.setOnLoan(true);
        dueDate = LocalDate.now().plusWeeks(2);
        System.out.println("Book '" + book.getTitle() + "' has been borrowed by " + name);
        System.out.println("Due date: " + dueDate);
    }

    public void returnBooks (Book book) {
        booksLoanedOut.remove(book);
        book.setOnLoan(false);
        dueDate = null;
        System.out.println("Book '" + book.getTitle() + "' has been returned by " + name);
    }

    public boolean isLate() {
        if (dueDate != null) {
            LocalDate currentDate = LocalDate.now();
            return currentDate.isAfter(dueDate);
        }
        return false;
    }

    public double calculateLateFees() {
        if (isLate()) {
            long daysLate = ChronoUnit.DAYS.between(dueDate, LocalDate.now());
            double feePerDay = 1.00;
            return daysLate * feePerDay;
        }
        return 0.0;
    }

}
