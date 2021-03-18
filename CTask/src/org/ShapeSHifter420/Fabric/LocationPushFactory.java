package org.ShapeSHifter420.Fabric;

import org.ShapeSHifter420.Pushes.IPush;
import org.ShapeSHifter420.Pushes.LocationPush;

import java.util.Map;

public class LocationPushFactory implements IPushFactory{
    @Override
    public IPush create(Map<String, String> conf) {
        String text = conf.getOrDefault("text", "");
        long exp = conf.containsKey("expiry_date")? Long.parseLong(conf.get("expiry_date")): -1;
        float xcoord = conf.containsKey("x_coord")? Float.parseFloat(conf.get("x_coord")) : 0;
        float ycoord = conf.containsKey("y_coord")? Float.parseFloat(conf.get("y_coord")) : 0;
        float radius = conf.containsKey("radius")? Float.parseFloat(conf.get("radius")) : -1;
        return new LocationPush(text,exp,xcoord,ycoord,radius);
    }
}
