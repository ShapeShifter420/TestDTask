package org.ShapeSHifter420;

import org.ShapeSHifter420.Pushes.ISystem;
import org.ShapeSHifter420.Pushes.SystemData;

import java.util.Map;

public class SystemDataFactory implements ISystemDataFactory{
    public ISystem create(Map<String, String> conf){
        int age = conf.containsKey("age")? Integer.parseInt(conf.get("age")) : 0;
        long time = conf.containsKey("time")? Long.parseLong(conf.get("time")): 0;
        float xcoord = conf.containsKey("x_coord")? Float.parseFloat(conf.get("x_coord")) : 0;
        float ycoord = conf.containsKey("y_coord")? Float.parseFloat(conf.get("y_coord")) : 0;
        float osversion = conf.containsKey("os_version")? Float.parseFloat(conf.get("os_version")) : 0;
        String gender = conf.getOrDefault("gender", "none");
        return new SystemData(age,time,gender,xcoord,ycoord,osversion);
    }
}
