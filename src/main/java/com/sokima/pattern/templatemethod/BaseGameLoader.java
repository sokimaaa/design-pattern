package com.sokima.pattern.templatemethod;

/**
 * Template Method Pattern.
 * Class has template method {@link BaseGameLoader#load()} that fully loads game.
 * Template method calls another methods called stepN().
 * Step methods may be implemented in the concrete class or here as well (with default implementation).
 *
 * @author Roman Denysov
 */
public abstract class BaseGameLoader {

    public void load() {
        byte[] data = loadLocalData();
        createGameObjects(data);
        downloadHelperFiles();
        cleanTemporaryFiles();
        initializeProfiles();
    }

    protected abstract void initializeProfiles();

    protected abstract void downloadHelperFiles();

    protected abstract void createGameObjects(byte[] data);

    protected abstract byte[] loadLocalData();

    protected void cleanTemporaryFiles() {
        // some impl
    }
}
