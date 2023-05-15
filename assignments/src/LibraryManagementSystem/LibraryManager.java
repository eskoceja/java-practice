package LibraryManagementSystem;

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
        System.out.println("Item added to cart: " + item.getTitle());
    }

    @Override
    public void removeItem(T item) {
        if (items.remove(item)) {
            System.out.println("Item removed from cart: " + item.getTitle());
        } else {
            System.out.println("Item not found in cart: " + item.getTitle());
        }
    }

    @Override
    public void displayItems() {
        System.out.println("Library Items: ");
        for (T item : items) {
            System.out.println(item.getItemDetails());
        }
    }
}
