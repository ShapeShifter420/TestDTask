package org.ShapeSHifter420.Fabric;

import org.ShapeSHifter420.Pushes.IPush;
import org.ShapeSHifter420.Pushes.LocationAgePush;

import java.util.Map;

public class LocationAgePushFactory implements IPushFactory{

    @Override
    public IPush create(Map<String, String> conf) {
        String text = conf.getOrDefault("text", "");
        int age = conf.containsKey("age")? Integer.parseInt(conf.get("age")) : Integer.MAX_VALUE;
        float xcoord = conf.containsKey("x_coord")? Float.parseFloat(conf.get("x_coord")) : 0;
        float ycoord = conf.containsKey("y_coord")? Float.parseFloat(conf.get("y_coord")) : 0;
        float radius = conf.containsKey("radius")? Float.parseFloat(conf.get("radius")) : -1;
        return new LocationAgePush(text,age,xcoord,ycoord,radius);
    }
}
