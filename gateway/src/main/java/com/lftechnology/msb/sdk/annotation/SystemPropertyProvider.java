package com.lftechnology.msb.sdk.annotation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class SystemPropertyProvider {

    private static final Logger LOGGER = LoggerFactory.getLogger(SystemPropertyProvider.class);

    @Produces
    @SystemProperty("")
    String findProperty(InjectionPoint ip) {
        SystemProperty annotation = ip.getAnnotated()
                .getAnnotation(SystemProperty.class);

        String name = annotation.value();
        String found = System.getProperty(name);
        if (found == null) {
            return annotation.fallback();
        }
        return found;
    }
}
