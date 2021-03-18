package org.ShapeSHifter420.Filters;

import org.ShapeSHifter420.Pushes.*;

public class GenderFilter implements IFilter {
    public boolean isAllow(IPush push){
        return push instanceof IGenderPush;
    };
    public boolean test(IPush push, ISystem sys){
        IGenderPush genPush = (IGenderPush) push;
        return  (genPush.GetGender().equals(sys.GetGender()));
    }
}
