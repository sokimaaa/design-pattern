package com.sokima.pattern.flyweight;

/**
 * Flyweight Class.
 * It stores the intrinsic state of the object,
 * This state is invariant.
 * Context independent, shareable and never altered at runtime.
 * Flyweights are immutable.
 *
 * @author Roman Denysov
 */
public record BookType(
        String type,
        String distributor,
        String otherData
) {
}
