package org.ShapeSHifter420.Fabric;

import org.ShapeSHifter420.Pushes.GenderAgePush;
import org.ShapeSHifter420.Pushes.IPush;

import java.util.Map;

public class GenderAgePushFactory implements IPushFactory{
    @Override
    public IPush create(Map<String, String> conf) {
        String text = conf.getOrDefault("text", "");
        int age = conf.containsKey("age")? Integer.parseInt(conf.get("age")) : Integer.MAX_VALUE;
        String gender = conf.getOrDefault("gender", "none");
        return new GenderAgePush(text,age,gender);
    }
}
