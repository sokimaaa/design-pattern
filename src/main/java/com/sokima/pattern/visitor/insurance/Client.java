package com.sokima.pattern.visitor.insurance;

import com.sokima.pattern.visitor.Visitor;

/**
 * Represent Insurance's client.
 *
 * @author Roman Denysov
 */
public abstract class Client {

    // some impl

    protected abstract void accept(Visitor visitor);
}
