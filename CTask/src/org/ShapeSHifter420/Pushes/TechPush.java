package org.ShapeSHifter420.Pushes;

import java.util.Map;

public class TechPush extends SimplePush implements ITechPush{
    float OSVersion;

    public TechPush(String text,float osversion){
        super(text);
        this.OSVersion = osversion;
    }

    @Override
    public float GetOSVersion() {
        return OSVersion;
    }
}
