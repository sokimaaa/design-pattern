package com.sokima.pattern.factorymethod.character;

import com.sokima.pattern.factorymethod.bow.Bow;
import com.sokima.pattern.factorymethod.spell.FrostSpell;
import com.sokima.pattern.factorymethod.spell.Spell;
import com.sokima.pattern.factorymethod.sword.GoldenSword;
import com.sokima.pattern.factorymethod.sword.Sword;

/**
 * The concrete {@link Character}.
 *
 * @author Roman Denysov
 */
public class FrozenMagicianCharacter extends Character {
    @Override
    protected Sword instantiateSword() {
        // some impl
        return new GoldenSword();
    }

    @Override
    protected Bow instantiateBow() {
        // some impl
        return null;
    }

    @Override
    protected Spell[] instantiateSpell() {
        // some impl
        return new Spell[]{
                new FrostSpell(),
                new FrostSpell(),
                new FrostSpell()
        };
    }

    // some impl
}
