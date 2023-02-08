package com.sokima.pattern.adapter.request;

import com.sokima.pattern.adapter.library.Book;
import com.sokima.pattern.adapter.library.Library;
import com.sokima.pattern.adapter.type.JSONType;
import com.sokima.pattern.adapter.type.Type;
import com.sokima.pattern.adapter.type.converter.JSONConverter;

/**
 * Adapter Pattern.
 * We are adapt {@link Library} to our interface.
 * We aren't changed {@link Library}, so nothing were broken.
 *
 * @author Roman Denysov
 */
public class LibraryRequestSender implements RequestSender {

    private final Library library;

    private final JSONConverter jsonConverter;

    public LibraryRequestSender(Library library, JSONConverter jsonConverter) {
        this.library = library;
        this.jsonConverter = jsonConverter;
    }

    @Override
    public void send(Type message) {
        JSONType json = jsonConverter.convert(message);
        Book book = library.findBook(json);
        // some impl
    }

    // some impl
}
