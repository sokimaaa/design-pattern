package com.sokima.pattern.templatemethod;

/**
 * Concrete class for loading Diablo Game that implements steps of {@link BaseGameLoader}.
 *
 * @author Roman Denysov
 */
public class DiabloLoader extends BaseGameLoader {
    @Override
    protected void initializeProfiles() {
        // some impl
    }

    @Override
    protected void downloadHelperFiles() {
        // some impl
    }

    @Override
    protected void createGameObjects(byte[] data) {
        // some impl
    }

    @Override
    protected byte[] loadLocalData() {
        // some impl
        return new byte[0];
    }
}
