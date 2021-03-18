package org.ShapeSHifter420.Filters;

import org.ShapeSHifter420.Pushes.*;

public class AgeFilter implements IFilter{
    @Override
    public boolean isAllow(IPush push) {
        return push instanceof IAgePush;
    }

    @Override
    public boolean test(IPush push, ISystem sys) {
        IAgePush agePush = (IAgePush) push;
        return  (agePush.GetAge() <= sys.GetAge());
    }
}
