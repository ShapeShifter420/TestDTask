package org.ShapeSHifter420.Filters;

import org.ShapeSHifter420.Pushes.*;

public class LocationFilter implements IFilter{
    @Override
    public boolean isAllow(IPush push) {
        return push instanceof ILocationPush;
    }

    @Override
    public boolean test(IPush push, ISystem sys) {
        ILocationPush agepush = (ILocationPush) push;
        return agepush.getRadius() >= Math.sqrt(((Math.pow(agepush.getXCoord() - sys.getXCoord(),2))+
                (Math.pow(agepush.getYCoord() - sys.getYCoord(),2))));
    }
}
