package com.emmanuelnyachoke.openmrsng.plugins;

import org.pf4j.ExtensionPoint;

import java.util.List;

public interface OpenmrsPluginInterface extends ExtensionPoint {
    String identify();
    List<?> reactiveRoutes();
    List<Object> mvcControllers();
}
