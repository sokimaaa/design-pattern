package com.sokima.pattern.flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * Represent book store.
 *
 * @author Roman Denysov
 */
public class BookStore {
    private final List<Book> books = new ArrayList<>();

    public void storeBook(String name, double price, String type, String distributor, String otherData) {
        BookType bookType = BookFactory.getBookType(type, distributor, otherData);
        books.add(new Book(name, price, bookType));
    }
}
