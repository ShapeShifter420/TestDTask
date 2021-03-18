package org.ShapeSHifter420;

import org.ShapeSHifter420.Pushes.IPush;
import org.ShapeSHifter420.Pushes.ISystem;

import java.util.List;

public interface IFilterManager {
    List<IPush> filtration(List<IPush> pushes, ISystem sys);
}
