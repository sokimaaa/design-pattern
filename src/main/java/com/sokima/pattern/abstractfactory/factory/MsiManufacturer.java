package com.sokima.pattern.abstractfactory.factory;

import com.sokima.pattern.abstractfactory.gpu.Gpu;
import com.sokima.pattern.abstractfactory.gpu.MsiGpu;
import com.sokima.pattern.abstractfactory.monitor.Monitor;
import com.sokima.pattern.abstractfactory.monitor.MsiMonitor;

/**
 * Represent MSI Manufacturer.
 *
 * @author Roman Denysov
 */
public class MsiManufacturer implements Manufacturer {
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
