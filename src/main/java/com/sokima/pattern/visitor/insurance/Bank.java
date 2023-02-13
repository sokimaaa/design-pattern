package com.sokima.pattern.visitor.insurance;

import com.sokima.pattern.visitor.Visitor;

/**
 * Represent concrete Insurance's client.
 *
 * @author Roman Denysov
 */
public class Bank extends Client {

    // some impl

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBank(this);
    }
}
