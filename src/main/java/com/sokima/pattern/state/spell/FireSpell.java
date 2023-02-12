package com.sokima.pattern.state.spell;

import com.sokima.pattern.state.CoolDownSpellState;
import com.sokima.pattern.state.SpellState;
import com.sokima.pattern.state.timer.CoolDownSpellTimer;

/**
 * Represent Fire Spell that has a method attack().
 * Method attack() has two ways to execute:
 * 1. CoolDownState - nothing happens, spell on cool down
 * 2. RechargedState - fire spell casts, and goes on cool down
 *
 * @author Roman Denysov
 */
public class FireSpell {

    private SpellState state;

    public FireSpell(CoolDownSpellTimer timer) {
        if(!timer.isStarted()) timer.startTimer();
        this.state = new CoolDownSpellState(this, timer);
    }

    public void setState(SpellState state) {
        this.state = state;
    }

    public void attack() {
        // some impl
    }

    // some impl
}
