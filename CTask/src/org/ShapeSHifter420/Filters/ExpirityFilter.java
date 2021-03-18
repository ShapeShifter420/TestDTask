package org.ShapeSHifter420.Filters;

import org.ShapeSHifter420.Pushes.*;

public class ExpirityFilter implements IFilter{
    @Override
    public boolean isAllow(IPush push) {
        return push instanceof IExpitity;
    }

    @Override
    public boolean test(IPush push, ISystem sys) {
        IExpitity expPush = (IExpitity) push;
        return  (expPush.GetExpirity() >= sys.GetTime());
    }
}
