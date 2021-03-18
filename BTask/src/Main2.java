import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        List<HashSet<String>> Group = new LinkedList<>();
        HashSet<String> allready = new HashSet<>();
        int N = in.nextInt();
        in.nextLine();
        for (int i = 0;i<N;i++){
            List<Integer> concratinate= new LinkedList<>();
            List<String> man = Arrays.asList(in.nextLine().split(" "));
            for (String h : man){
                if (allready.contains(h))
                for (int t = 0;t<Group.size();t++){
                    if (concratinate.contains(t)) continue;
                    HashSet<String> gg = Group.get(t);
                    for (String hobby : gg){
                        if (h.equals(hobby)){
                            concratinate.add(t);
                            break;
                        }
                    }
                }
                else allready.add(h);
            }
            if (concratinate.size() == 1){Group.get(concratinate.get(0)).addAll(man);}
            else if (concratinate.size() > 1){
                Set<String> bg = null;
                int last = 0;
                for (int c : concratinate){
                    if (bg == null){ bg = Group.get(c);bg.addAll(man);continue; }
                    bg.addAll(Group.get(c-last));
                    Group.remove(c-last);
                    last++;
                }
            }
            else Group.add(new HashSet<>(man));
        }
        //printAll(Group);
        out.println(Group.size());
        out.flush();
    }
    private static void printAll(List<Set<String>> l){
        for (Set<String> t1: l){
            for (String t2 : t1)
                System.out.print(t2 + " ");
            System.out.println();
        }

    }
}
