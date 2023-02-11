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
public class DatabaseThreadSafeSingleton {
    private static volatile DatabaseThreadSafeSingleton instance;

    public static DatabaseThreadSafeSingleton getInstance() {
        DatabaseThreadSafeSingleton localInstance = instance;
        if (Objects.isNull(localInstance)) {
            synchronized (DatabaseThreadSafeSingleton.class) {
                localInstance = instance;
                if (Objects.isNull(localInstance)) localInstance = new DatabaseThreadSafeSingleton();
            }
        }

        return localInstance;
    }

    private DatabaseThreadSafeSingleton() {
        // some impl
    }

    // some impl
}
