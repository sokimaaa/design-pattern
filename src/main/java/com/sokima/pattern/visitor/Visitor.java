package com.sokima.pattern.visitor;

import com.sokima.pattern.visitor.insurance.Bank;
import com.sokima.pattern.visitor.insurance.Resident;
import com.sokima.pattern.visitor.insurance.Restaurant;

/**
 * Visitor Pattern.
 *
 * @author Roman Denysov
 */
public interface Visitor {
    void visitBank(Bank bank);
    void visitRestaurant(Restaurant restaurant);
    void visitResident(Resident resident);
}
