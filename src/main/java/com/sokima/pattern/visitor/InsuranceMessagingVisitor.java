package com.sokima.pattern.visitor;

import com.sokima.pattern.visitor.insurance.Bank;
import com.sokima.pattern.visitor.insurance.Resident;
import com.sokima.pattern.visitor.insurance.Restaurant;

/**
 * Message each insurance's clients in a way proper to each.
 *
 * @author Roman Denysov
 */
public class InsuranceMessagingVisitor implements Visitor {
    @Override
    public void visitBank(Bank bank) {
        // some impl
    }

    @Override
    public void visitRestaurant(Restaurant restaurant) {
        // some impl
    }

    @Override
    public void visitResident(Resident resident) {
        // some impl
    }
}
