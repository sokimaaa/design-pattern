package com.sokima.pattern.singleton;

/**
 * Singleton Pattern.
 * Creating a new object of class Database is highly expensive operation,
 * and in order to avoid spending extra resource we create only one instance,
 * and will return it by method calling.
 * Database Class represent real Database and has methods to interact with it.
 *
 * @author Roman Denysov
 */
public class DatabaseHolderLazySingleton {

    public static DatabaseHolderLazySingleton getInstance() {
        return InstanceHolder.instance;
    }

    private static class InstanceHolder {
        private static final DatabaseHolderLazySingleton instance = new DatabaseHolderLazySingleton();
    }

    private DatabaseHolderLazySingleton() {
        // some impl
    }

    // some impl
}
