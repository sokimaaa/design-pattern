package com.sokima.pattern.state;

import com.sokima.pattern.state.spell.FireSpell;
import com.sokima.pattern.state.timer.CoolDownSpellTimer;

/**
 * Spell State is recharged, so do attack after onAttack() method call.
 *
 * @author Roman Denysov
 */
public class RechargedSpellState extends AbstractSpellState {

    private final CoolDownSpellTimer timer;

    public RechargedSpellState(FireSpell fireSpell, CoolDownSpellTimer timer) {
        super(fireSpell);
        this.timer = timer;
    }

    @Override
    public void onAttack() {
        fireSpell.attack();
        timer.restartTimer();
        fireSpell.setState(new CoolDownSpellState(fireSpell, timer));
        // some impl
    }

    // some impl
}
