import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        ArrayList<String[]> Group = new ArrayList<>();
        int lastid = 0;
        int N = in.nextInt();
        int[] cc = new int[N];
        for (int i = 0;i<N;i++) cc[i] = -1;
        int M = 0;
        in.nextLine();
        for (int i = 0;i<N;i++){
            List<Integer> concratinate= new ArrayList<>();
            String[] man = in.nextLine().split(" ");
            for (String h : man){
                for (int t = 0;t< i;t++){
                    if (concratinate.contains(t)) continue;
                    for (String hobby : Group.get(t)){
                        if (h.equals(hobby)){
                            concratinate.add(t);
                            break;
                        }
                    }
                }
            }
            if(!concratinate.isEmpty()) cc[i] = lastid;
            for (int g : concratinate){
                int vv = cc[g];
                if (vv==lastid) continue;
                if (vv!=-1)
                    for(int h =0;h<i+1;h++){
                        if (vv == cc[h])
                            cc[h]=lastid;
                    }
                else cc[g]=lastid;
            }
            lastid++;
            Group.add(man);
        }
        //printAll(Group);
        Set<Integer> ccs = new HashSet<>();
        for (int i : cc){
            if (i != -1){
                ccs.add(i);
            }
            else M++;
        }
        //for (int i : cc.keySet()){System.out.println(i + ":" + cc.get(i));}
        out.println(M+ccs.size());
        out.flush();
    }
}
