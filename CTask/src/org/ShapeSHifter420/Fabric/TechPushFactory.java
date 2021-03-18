package org.ShapeSHifter420.Fabric;

import org.ShapeSHifter420.Pushes.IPush;
import org.ShapeSHifter420.Pushes.TechPush;

import java.util.Map;

public class TechPushFactory implements IPushFactory{
    @Override
    public IPush create(Map<String, String> conf) {
        String text = conf.getOrDefault("text", "");
        float osversion = conf.containsKey("os_version")? Float.parseFloat(conf.get("os_version")) : -1;
        return new TechPush(text,osversion);
    }
}
