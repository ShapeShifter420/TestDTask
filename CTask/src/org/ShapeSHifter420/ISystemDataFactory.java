package org.ShapeSHifter420;

import org.ShapeSHifter420.Pushes.ISystem;

import java.util.Map;

public interface ISystemDataFactory {
    public ISystem create(Map<String, String> conf);
}
