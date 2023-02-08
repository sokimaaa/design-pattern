package com.sokima.pattern.factorymethod.character;

import com.sokima.pattern.factorymethod.bow.Bow;
import com.sokima.pattern.factorymethod.bow.EnhancedBow;
import com.sokima.pattern.factorymethod.spell.Spell;
import com.sokima.pattern.factorymethod.sword.Sword;
import com.sokima.pattern.factorymethod.sword.WoodenSword;

/**
 * The concrete {@link Character}.
 *
 * @author Roman Denysov
 */
public class BowmanCharacter extends Character {
    @Override
    protected Sword instantiateSword() {
        // some impl
        return new WoodenSword();
    }

    @Override
    protected Bow instantiateBow() {
        // some impl
        return new EnhancedBow();
    }

    @Override
    protected Spell[] instantiateSpell() {
        // some impl
        return new Spell[0];
    }

    // some impl
}
