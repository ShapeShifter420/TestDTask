package org.ShapeSHifter420.Fabric;

import org.ShapeSHifter420.Pushes.IPush;

import java.util.Map;

public interface IPushFactory {
    IPush create(Map<String,String> conf);
}
