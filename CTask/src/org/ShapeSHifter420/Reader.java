package org.ShapeSHifter420;

import org.ShapeSHifter420.Pushes.IPush;
import org.ShapeSHifter420.Pushes.ISystem;

import java.util.*;

public class Reader implements IReader{
    Scanner In;
    IPushCreator pushCreator;
    ISystemDataFactory systemDataFactory;
    private int N = 0;

    public ISystem readSystem() {
        Map<String,String> param = new HashMap<>();
        while(In.hasNext()){
            String[] nl = In.nextLine().split(" ");
            if (nl.length == 1)
            {N = Integer.parseInt(nl[0]);break;}
            param.put(nl[0],nl[1]);
        }
        return systemDataFactory.create(param);}

    public IPush readPush(){
            N--;
            Map<String,String> conf = new HashMap<>();
            int M = Integer.parseInt(In.nextLine());
            for (int j = 0;j<M;j++){
                String[] nl = In.nextLine().split(" ");
                conf.put(nl[0],nl[1]);
            }
             return pushCreator.create(conf);
    }

    public boolean hasPush(){return N>0;}
    public Reader(Scanner in,IPushCreator pushCreator,ISystemDataFactory systemDataFactory){
        this.In = in;
        this.pushCreator = pushCreator;
        this.systemDataFactory = systemDataFactory;
    }
}
