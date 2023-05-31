package library_management;

public class LibraryApp {
    public static void main(String[] args) {

        LibraryManager<LibraryItem> libraryDirectory = new LibraryManager<>();

        Book book = new Book("Cujo", 1981, "Stephen King", "978-0670451937");
        libraryDirectory.addItem(book);

        DVD dvd = new DVD("Juice", 1992, "Ernest Dickerson", 95);
        libraryDirectory.addItem(dvd);


        libraryDirectory.removeItem(book);
        System.out.println();

        libraryDirectory.displayItem();
        System.out.println();

        Book book2 = new Book("Rich Dad Poor Dad", 2000, "Robert T. Kiyosaki", " 978-0446568814" );
        libraryDirectory.addItem(book2);

        DVD dvd2 = new DVD("It", 1990, "Tommy Lee Wallace", 187);
        libraryDirectory.addItem(dvd2);

        DVD dvd3 = new DVD("Coach Carter", 2005, "Thomas Carter", 136);
        libraryDirectory.addItem(dvd3);
        System.out.println();

        libraryDirectory.removeItem(dvd2);
        libraryDirectory.removeItem(dvd2);
        System.out.println();

        libraryDirectory.displayItem();


    }
}