package com.sokima.pattern.adapter.library;

import com.sokima.pattern.adapter.type.JSONType;

/**
 * Represent real library, where you could make a request to find books.
 * Class was written a long time ago, so it can accept only XML type search request.
 * As a way, class was written for another goals, so we can't modify it.
 *
 * @author Roman Denysov
 */
public class Library {

    public Library() {

    }

    public Book findBook(JSONType json) {
        // some impl
        return new Book();
    }

    // any other methods
}
