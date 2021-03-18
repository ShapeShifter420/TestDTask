package org.ShapeSHifter420;

import org.ShapeSHifter420.Pushes.IPush;

import java.util.Map;

public interface IPushCreator {
    IPush create(Map<String, String> conf);
}
