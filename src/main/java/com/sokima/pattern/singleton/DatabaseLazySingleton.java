package com.sokima.pattern.singleton;

import java.util.Objects;

/**
 * Singleton Pattern.
 * Creating a new object of class Database is highly expensive operation,
 * and in order to avoid spending extra resource we create only one instance,
 * and will return it by method calling.
 * Database Class represent real Database and has methods to interact with it.
 *
 * @author Roman Denysov
 */
public class DatabaseLazySingleton {
    private static DatabaseLazySingleton instance;

    public static DatabaseLazySingleton getInstance() {
        if (Objects.isNull(instance)) instance = new DatabaseLazySingleton();
        return instance;
    }

    private DatabaseLazySingleton() {
        // some impl
    }

    // some impl
}
