package com.sokima.pattern.adapter.type.converter;

import com.sokima.pattern.adapter.type.JSONType;
import com.sokima.pattern.adapter.type.Type;

/**
 * Implementation of {@link Converter}.
 *
 * @author Roman Denysov
 */
public class JSONConverter implements Converter<JSONType>{
    public JSONType convert(Type input) {
        // some impl
        return new JSONType();
    }
}
