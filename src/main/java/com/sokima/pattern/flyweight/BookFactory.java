package com.sokima.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Flyweight Factory.
 * Consists a map to cache the values of our flyweights.
 *
 * @author Roman Denysov
 */
public class BookFactory {
    private static final Map<String, BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String type, String distributor, String otherData) {
        if (Objects.isNull(bookTypes.get(type))) bookTypes.put(type, new BookType(type, distributor, otherData));
        return bookTypes.get(type);
    }
}
