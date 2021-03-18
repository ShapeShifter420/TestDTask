package org.ShapeSHifter420.Fabric;

import org.ShapeSHifter420.Pushes.GenderPush;
import org.ShapeSHifter420.Pushes.IPush;

import java.util.Map;

public class GenderPushFactory implements IPushFactory{
    @Override
    public IPush create(Map<String, String> conf) {
        String text = conf.getOrDefault("text", "");
        String gender = conf.getOrDefault("gender", "none");
        return new GenderPush(text,gender);
    }
}
