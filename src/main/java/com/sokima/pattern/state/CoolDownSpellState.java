package com.sokima.pattern.state;

import com.sokima.pattern.state.spell.FireSpell;
import com.sokima.pattern.state.timer.CoolDownSpellTimer;

/**
 * Spell State is cool down, so any happens onAttack() method call.
 *
 * @author Roman Denysov
 */
public class CoolDownSpellState extends AbstractSpellState {

    private final CoolDownSpellTimer timer;

    public CoolDownSpellState(FireSpell fireSpell, CoolDownSpellTimer timer) {
        super(fireSpell);
        this.timer = timer;
    }

    @Override
    public void onAttack() {
        if (timer.isOver()) {
            fireSpell.setState(new RechargedSpellState(fireSpell, timer));
        }

        if (!timer.isStarted()) {
            timer.startTimer();
        }

        doNothing();
    }

    private void doNothing() {
        // some impl
    }
}
