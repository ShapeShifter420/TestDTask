package org.ShapeSHifter420;
import org.ShapeSHifter420.Pushes.IPush;
import org.ShapeSHifter420.Pushes.ISystem;

import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(java.lang.System.in);
        PrintWriter out = new PrintWriter(java.lang.System.out);

        IReader reader = new Reader(in,new PushCreator(),new SystemDataFactory());
        ISystem sys = reader.readSystem();
        List<IPush> pushes = new LinkedList<>();
        while (reader.hasPush()){
            pushes.add(reader.readPush());
        }

        IFilterManager filterManager = new FilterManager();
        PushWriter pushWriter = new PushWriter(out);
        pushWriter.writePushes(filterManager.filtration(pushes,sys));
    }
}
