package org.ShapeSHifter420.Fabric;

import org.ShapeSHifter420.Pushes.IPush;
import org.ShapeSHifter420.Pushes.SimplePush;

import java.util.Map;

public class SimplePushFactory implements IPushFactory{
    @Override
    public IPush create(Map<String, String> conf) {
        String text = conf.getOrDefault("text", "");
        return new SimplePush(text);
    }
}
