package org.ShapeSHifter420;

import org.ShapeSHifter420.Pushes.IPush;
import org.ShapeSHifter420.Pushes.ISystem;

public interface IReader {
    ISystem readSystem();
    IPush readPush();
    boolean hasPush();
}
