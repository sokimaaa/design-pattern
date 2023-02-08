package com.sokima.pattern.factorymethod.character;

import com.sokima.pattern.factorymethod.bow.Bow;
import com.sokima.pattern.factorymethod.spell.Spell;
import com.sokima.pattern.factorymethod.sword.Sword;

/**
 * Abstract class of Character.
 * Each character has weapons and skill level of using it.
 * Each character can use any weapons depend on situation he has.
 * DPS calculates dynamically and depends on different situation.
 * For example,
 * - When MP is too low, your magic attack damage will go to zero
 * - When count of arrows is equal to zero, you can't use ranged attack anymore
 * - After each melee attack your stamina decreases
 * And so on.
 * Weapons remain static and because of weapon could increase or decrease damage.
 *
 * @author Roman Denysov
 */
public abstract class Character implements Attack {

    // some fields

    protected Character() {
        // some impl
    }

    @Override
    public int meleeAttack() {
        Sword sword = instantiateSword();
        // some dps calculating
        return 0;
    }

    @Override
    public int rangedAttack() {
        Bow bow = instantiateBow();
        // some dps calculating
        return 0;
    }

    @Override
    public int magicAttack() {
        Spell[] spells = instantiateSpell();
        // some dps calculating
        return 0;
    }

    /**
     * Abstract Method Pattern.
     * Each concrete implementation of {@link Character} has own weapons.
     * So, weapons will be using in a superclass, but subclasses will alter the concrete weapons.
     *
     * @return Bow, Sword or Spells
     */

    protected abstract Sword instantiateSword();
    protected abstract Bow instantiateBow();
    protected abstract Spell[] instantiateSpell();

    // some impl
}
