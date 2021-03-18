package org.ShapeSHifter420.Filters;

import org.ShapeSHifter420.Pushes.*;

public class TechFilter implements IFilter {
    public boolean isAllow(IPush push){
        return push instanceof ITechPush;
    };
    public boolean test(IPush push, ISystem sys){
        ITechPush agepush = (ITechPush) push;
        return  (agepush.GetOSVersion() >= sys.GetOSVersion());
    }
}
