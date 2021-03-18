package org.ShapeSHifter420;

import org.ShapeSHifter420.Filters.*;
import org.ShapeSHifter420.Pushes.IPush;
import org.ShapeSHifter420.Pushes.ISystem;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FilterManager implements IFilterManager{
    public List<IFilter> filterList;
    public List<IPush> filtration(List<IPush> pushList, ISystem sys){
        List<IPush> filtredPushes= new LinkedList<>();
        for (IPush push : pushList){
            boolean f = true;
            for (IFilter filter : filterList)
                if(filter.isAllow(push) && !filter.test(push,sys)) {f = false;break;}
            if(f) filtredPushes.add(push);
        }
        return filtredPushes;
    }
    public FilterManager(){
        IFilter[] filters = {new AgeFilter(),new ExpirityFilter(),new GenderFilter(),new LocationFilter(),new TechFilter()};
        this.filterList = Arrays.asList(filters);
    }
}
