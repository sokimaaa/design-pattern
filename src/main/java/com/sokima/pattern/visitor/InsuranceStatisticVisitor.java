package com.sokima.pattern.visitor;

import com.sokima.pattern.visitor.insurance.Bank;
import com.sokima.pattern.visitor.insurance.Resident;
import com.sokima.pattern.visitor.insurance.Restaurant;

/**
 * Get statistic about each insurance's clients.
 *
 * @author Roman Denysov
 */
public class InsuranceStatisticVisitor implements Visitor {
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
