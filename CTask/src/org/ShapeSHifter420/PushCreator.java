package org.ShapeSHifter420;

import org.ShapeSHifter420.Fabric.*;
import org.ShapeSHifter420.Pushes.*;

import java.util.Map;

public class PushCreator implements IPushCreator{
    public IPush create(Map<String,String> conf){
        IPushFactory factory;
        switch (conf.get("type")) {
            case ("LocationAgePush"):
                factory = new LocationAgePushFactory();
                break;
            case ("AgeSpecificPush"):
                factory = new AgeSpecificPushFactory();
                break;
            case ("LocationPush"):
                factory = new LocationPushFactory();
                break;
            case ("TechPush"):
                factory = new TechPushFactory();
                break;
            case ("GenderPush"):
                factory = new GenderPushFactory();
                break;
            case ("GenderAgePush"):
                factory = new GenderAgePushFactory();
                break;
            default:
                factory = new SimplePushFactory();
                break;
        }
        return factory.create(conf);
    }
}
