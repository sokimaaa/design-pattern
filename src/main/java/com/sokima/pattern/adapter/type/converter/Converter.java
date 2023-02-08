package com.sokima.pattern.adapter.type.converter;

import com.sokima.pattern.adapter.type.BasicType;
import com.sokima.pattern.adapter.type.Type;

/**
 * Interface for converting from one type to another.
 *
 * @param <O> - the output type
 * @author Roman Denysov
 */
public interface Converter<O extends BasicType> {
    O convert(Type input);
}
