package com.sokima.pattern.abstractfactory.factory;

import com.sokima.pattern.abstractfactory.gpu.Gpu;
import com.sokima.pattern.abstractfactory.monitor.Monitor;

/**
 * Abstract Factory Pattern.
 * Describes methods to create component.
 *
 * @author Roman Denysov
 */
public interface Manufacturer {
    Gpu createGpu();
    Monitor createMonitor();
}
