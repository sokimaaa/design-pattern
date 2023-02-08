package com.sokima.pattern.factorymethod.character;

import com.sokima.pattern.factorymethod.bow.Bow;
import com.sokima.pattern.factorymethod.bow.WoodenBow;
import com.sokima.pattern.factorymethod.spell.Spell;
import com.sokima.pattern.factorymethod.sword.IronSword;
import com.sokima.pattern.factorymethod.sword.Sword;

/**
 * The concrete {@link Character}.
 *
 * @author Roman Denysov
 */
public class WarriorCharacter extends Character {
    @Override
    protected Sword instantiateSword() {
        // some impl
        return new IronSword();
    }

    @Override
    protected Bow instantiateBow() {
        // some impl
        return new WoodenBow();
    }

    @Override
    protected Spell[] instantiateSpell() {
        // some impl
        return new Spell[0];
    }

    // some impl
}
