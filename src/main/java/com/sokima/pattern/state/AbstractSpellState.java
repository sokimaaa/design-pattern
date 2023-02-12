package com.sokima.pattern.state;

import com.sokima.pattern.state.spell.FireSpell;

/**
 * Abstract Spell State.
 *
 * @author Roman Denysov
 */
public abstract class AbstractSpellState implements SpellState {

    protected FireSpell fireSpell;

    protected AbstractSpellState(FireSpell fireSpell) {
        this.fireSpell = fireSpell;
    }

    // some impl
}
