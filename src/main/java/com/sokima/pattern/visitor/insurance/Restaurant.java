package com.sokima.pattern.visitor.insurance;

import com.sokima.pattern.visitor.Visitor;

/**
 * Represent concrete Insurance's client.
 *
 * @author Roman Denysov
 */
public class Restaurant extends Client {

    // some impl

    @Override
    protected void accept(Visitor visitor) {
        visitor.visitRestaurant(this);
    }
}
