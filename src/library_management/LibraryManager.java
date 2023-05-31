package library_management;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager<T extends LibraryItem> implements LibraryOperations<T> {
    private List<T> items;

    public LibraryManager() {
        items = new ArrayList<>();
    }

    @Override
    public void addItem(T item) {
        items.add(item);
        System.out.println("New item added: " + item.getItemDetails());

    }

    @Override
    public void removeItem(T item) {
        if (items.remove(item)) {
            System.out.println("Item has been removed: " + item.getItemDetails()) ;
        } else {
            System.out.println("Item not found... " + item.getItemDetails());
        }

    }

    @Override
    public void displayItem() {
        if (items.isEmpty()) {
            System.out.println("There are no items in the library. ");
        } else {
            System.out.println("Current library: ");
            for (T item : items) {
                System.out.println(item.getItemDetails());
            }
        }

    }
}