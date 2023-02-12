package com.sokima.pattern.abstractfactory.factory;

import com.sokima.pattern.abstractfactory.gpu.AsusGpu;
import com.sokima.pattern.abstractfactory.gpu.Gpu;
import com.sokima.pattern.abstractfactory.monitor.AsusMonitor;
import com.sokima.pattern.abstractfactory.monitor.Monitor;

/**
 * Represent ASUS Manufacturer.
 *
 * @author Roman Denysov
 */
public class AsusManufacturer implements Manufacturer {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
