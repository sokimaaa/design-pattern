package com.sokima.pattern.factorymethod.character;

/**
 * Interface that has methods to make damage.
 * Methods return an integer which indicate damage per use.
 * Damage shall be between 0 and 100 (min and max possible HP).
 *
 * @author Roman Denysov
 */
public interface Attack {
    int meleeAttack();
    int rangedAttack();
    int magicAttack();
}
