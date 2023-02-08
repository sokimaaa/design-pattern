package com.sokima.pattern.adapter.type.converter;

import com.sokima.pattern.adapter.type.Type;
import com.sokima.pattern.adapter.type.XMLType;

/**
 * Implementation of {@link Converter}.
 *
 * @author Roman Denysov
 */
public class XMLConverter implements Converter<XMLType> {
    public XMLType convert(Type input) {
        // some impl
        return new XMLType();
    }
}
