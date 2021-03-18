package org.ShapeSHifter420.Filters;

import org.ShapeSHifter420.Pushes.IPush;
import org.ShapeSHifter420.Pushes.ISystem;


public interface IFilter {
    boolean isAllow(IPush push);
    boolean test(IPush push, ISystem sys);
}
