package org.ShapeSHifter420;

import org.ShapeSHifter420.Pushes.IPush;

import java.io.PrintWriter;
import java.util.List;

public class PushWriter {
    PrintWriter out;
    public void writePushes(List<IPush> pushes){
        if (pushes.size() == 0) out.println(-1);
        else
        for (IPush push : pushes){
            out.println(push.getText());
        }
        out.flush();
    }
    public PushWriter(PrintWriter out){
        this.out = out;
    }
}
