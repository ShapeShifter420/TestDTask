package org.ShapeSHifter420.Fabric;

import org.ShapeSHifter420.Pushes.AgeSpecificPush;
import org.ShapeSHifter420.Pushes.IPush;

import java.util.Map;

public class AgeSpecificPushFactory implements IPushFactory{
    @Override
    public IPush create(Map<String, String> conf) {
        String text = conf.getOrDefault("text", "");
        int age = conf.containsKey("age")? Integer.parseInt(conf.get("age")) : Integer.MAX_VALUE;
        long exp = conf.containsKey("expiry_date")? Long.parseLong(conf.get("expiry_date")): -1;
        return new AgeSpecificPush(text,age,exp);
    }
}
