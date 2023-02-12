package com.sokima.pattern.state;

/**
 * State Pattern.
 * Interface describes methods applicable to spell.
 * Implementation will change by changing state.
 *
 * @author Roman Denysov
 */
public interface SpellState {
    void onAttack();
}
