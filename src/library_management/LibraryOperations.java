package library_management;
public interface LibraryOperations<T extends LibraryItem> {

    void addItem(T item);
    void removeItem(T item);
    void displayItem();
}

